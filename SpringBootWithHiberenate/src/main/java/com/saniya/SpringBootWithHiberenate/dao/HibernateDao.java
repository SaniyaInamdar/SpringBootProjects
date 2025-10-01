package com.saniya.SpringBootWithHiberenate.dao;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.saniya.SpringBootWithHiberenate.entity.Mobile;
import  org.hibernate.Transaction;

@Repository
public class HibernateDao {

	  @Autowired
	  SessionFactory sf; 

	 Session session = null;
	 Transaction tx=null;
	 
	public void inserdata(Mobile mob) {
		session=sf.openSession();
		tx=session.beginTransaction();
		session.save(mob);
		tx.commit();
	}
	
	public void updatedata(Mobile mob) {
		// TODO Auto-generated method stub
		session=sf.openSession();
		tx=session.beginTransaction();
		session.update(mob);
		tx.commit();
	}

	public void deletedata(int id) {
		session=sf.openSession();
		tx=session.beginTransaction();
		Mobile mob=session.get(Mobile.class, id);
		session.delete(mob);
		tx.commit();
	}

	public Mobile getmobilebyID(int id) {
		session=sf.openSession();
		tx=session.beginTransaction();
		Mobile mob=session.get(Mobile.class, id);
		tx.commit();
		return mob;
	}

	public List<Mobile> getallmobiles() {
		session=sf.openSession();
		tx=session.beginTransaction();
		List<Mobile> list=session.createQuery("from Mobile",Mobile.class).list();
		tx.commit();
		return list;
	}
}
