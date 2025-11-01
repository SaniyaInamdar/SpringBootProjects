package com.smartbazaar.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smartbazaar.entity.Wallet;
import com.smartbazaar.exception.InsufficientBalanceException;
import com.smartbazaar.exception.ResourceNotFoundException;
import com.smartbazaar.repository.WalletRepository;
import com.smartbazaar.service.WalletService;

@Service
@Transactional
public class WalletServiceImpl implements WalletService {

    private final WalletRepository repo;

    public WalletServiceImpl(WalletRepository repo) { this.repo = repo; }

    @Override
    public Wallet getById(Long id) { return repo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Wallet not found: " + id)); }

    @Override
    public Wallet topUp(Long walletId, Double amount) {
        Wallet w = getById(walletId);
        w.setBalance(w.getBalance() + amount);
        return repo.save(w);
    }

    @Override
    public Wallet transfer(Long fromWalletId, Long toWalletId, Double amount) {
        Wallet a = getById(fromWalletId);
        Wallet b = getById(toWalletId);
        if (a.getBalance() < amount) throw new InsufficientBalanceException("Insufficient funds");
        a.setBalance(a.getBalance() - amount);
        b.setBalance(b.getBalance() + amount);
        repo.save(b);
        return repo.save(a);
    }
}
