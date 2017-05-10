package com.concretepage;

import com.concretepage.dao.GoodDao;
import com.concretepage.dao.daoImpl.GoodDaoImpl;
import com.concretepage.dao.daoImpl.ProposalDaoImpl;
import com.concretepage.dao.daoImpl.UserDaoImpl;
import com.concretepage.entity.Good;
import com.concretepage.entity.Proposal;
import com.concretepage.entity.User;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

@SpringBootApplication

public class OkeanApplication {

	public static void main(String[] args) {
		System.out.println("-01-");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		EntityManager entityManager = context.getBean("entityManagerFactory", EntityManagerFactory.class).createEntityManager();
		//entityManager = context.getBean("entityManagerFactory", EntityManagerFactory.class).createEntityManager();
		//System.out.println(new GoodDaoImpl(entityManager).findById(12).getGoodName());
		//new GoodDaoImpl(entityManager).update(new Good("good up"));
		//new UserDaoImpl(entityManager).persist(new User("Admin","222"));
		new ProposalDaoImpl(entityManager).persist(new Proposal("first proposition",2000));
		//System.out.println("-07-"+new GoodDaoImpl(entityManager).findAll().size());
		//System.out.println(new GoodDaoImpl(entityManager).deleteByID(24));

		System.out.println("-10-");
	}
}
