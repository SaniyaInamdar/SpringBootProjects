package com.saniya.SpringBootWithHiberenate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saniya.SpringBootWithHiberenate.dao.HibernateDao;
import com.saniya.SpringBootWithHiberenate.entity.Mobile;

@Service
public class MobileService {
	
	@Autowired
	HibernateDao d;
	public void inserdata(Mobile mob) {
		d.inserdata(mob);
	}
	public void updatedata(Mobile mob) {
		d.updatedata(mob);
	}
	public void deletedata(int id) {
		d.deletedata(id);
	}
	public Mobile getmobilebyID(int id) {
		return d.getmobilebyID(id);
	}
	public List<Mobile> getallmobiles() {
		return d.getallmobiles();
	}
}
