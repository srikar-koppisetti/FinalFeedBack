package com.srikar.springmvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.srikar.springmvc.entity.Feedback;



@Component
public class FeedbackDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	@Transactional
	public void addFeedback(Feedback fb){
		
		System.out.println("Feedback added "+ fb);
		
		Session session = sessionFactory.getCurrentSession();
		session.save(fb);
		
		
	}

	@Transactional
	public List<Feedback> getFeedbacks() {
		Session session = sessionFactory.getCurrentSession();
		Query q = session.createQuery("from Feedback");
		List<Feedback> list = (List<Feedback>) q.list();
		return list;
	}
}
