package com.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.demo.bean.Adress;
import com.demo.bean.Employee;

public class TestEmbedable {

	public static void main(String[] args) {
		System.out.println( "Hello World!" );
        Configuration cfg = new Configuration();
        cfg.configure("hibernate_cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        Employee e1 = new Employee(103,"Ram Kumar",550000);
        
        Adress ad1 = new Adress();
        ad1.setAdsId(1001);
        ad1.setStreet("Langarpur");
        ad1.setCity("Barh");
        ad1.setState("Bihar");
        ad1.setCountry("India");
        ad1.setZip(803213);
        
        e1.setAdress(ad1);
        System.out.println(e1);
        
        Session session = factory.openSession();
        session.beginTransaction();
        session.save(e1);
        session.getTransaction().commit();
        session.close();
        factory.close();
	}

}
