package com.osy.test;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.osy.entity.Customer;

/**
* @author 作者 E-mail:
* @version 创建时间：2019年1月16日 上午10:22:57
* 类说明
*/
public class Test {
	public static void main(String[] args) {

         //1.创建 EntityManagerFactory
         String persistenceUnitName = "Jpa";
         EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(persistenceUnitName);
         
         //2.创建 EntityManager
         EntityManager entityManager = entityManagerFactory.createEntityManager();
         String jpql = "SELECT new Customer(c.lastName, c.age) FROM Customer c WHERE c.id > ?";
         Query query = entityManager.createQuery(jpql);
         query.setParameter(1, 1);
         List<Customer>list = query.getResultList();
        for(Customer customer:list) {
        	System.out.println(customer);
        }
         
      /*   Customer customer= entityManager.find(Customer.class, 1);
         System.out.println(customer);
         //4.开启事务
         EntityTransaction transaction = entityManager.getTransaction();
         transaction.begin();
         
         //5.进行持久化操作
         Customer customer = new Customer();
         customer.setLastName("AAB");
         customer.setEmail("aa@163.com");
         customer.setAge(20);
         entityManager.merge(customer);
        entityManager.persist(customer);

         //6.提交事务
         transaction.commit();  
                  //7.关闭 EntityManager
*/         entityManager.close();
       
         //8.关闭 EntityManagerFactory
         entityManagerFactory.close();
         
	}
}
