package com.smartbazaar.service;

import com.smartbazaar.entity.Wallet;

public interface WalletService {
    Wallet getById(Long id);
    Wallet topUp(Long walletId, Double amount);
    Wallet transfer(Long fromWalletId, Long toWalletId, Double amount);
}
