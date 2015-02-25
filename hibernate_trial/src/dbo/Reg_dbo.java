package dbo;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;


import org.hibernate.cfg.Configuration;


import vao.Reg_vao;
import vao.Vehicle;



public class Reg_dbo implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void insert(Reg_vao rv) {
		SessionFactory sf =new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		s.beginTransaction();
		s.save(rv);
		
		s.getTransaction().commit();
	}
	public void insert_Vehicle(Vehicle vo) {
		SessionFactory sf =new Configuration().configure().buildSessionFactory();
		Session s=sf.openSession();
		s.beginTransaction();
		s.save(vo);
		
		s.getTransaction().commit();
	}
	public void update(Reg_vao rv){
		
	}

}
