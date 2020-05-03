package com.pack.sooriya;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class CreateMain {

	public static void main(String[] args) {
      SessionFactory factory = new Configuration().configure().addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
      Session session = factory.getCurrentSession();
      try
      {
    	  Instructor instructor=new Instructor("Sooriya","Meenakshi","soormo06@gmail.com");
    	  InstructorDetail instructorDetail = new InstructorDetail("www.youtube.com","Coding");
    	  instructor.setInstructorDetail(instructorDetail);
    	  session.beginTransaction();
    	  session.save(instructor);
    	  session.getTransaction().commit();
      }
      finally
      {
    	  factory.close();
      }
    		  
	
	}

}
