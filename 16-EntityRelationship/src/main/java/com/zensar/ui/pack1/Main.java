package com.zensar.ui.pack1;
 
 
import java.time.LocalDate;
 
import javax.persistence.EntityManager;

import com.zensar.bean.pack1.ContactInfo;
import com.zensar.bean.pack1.Person;
import com.zensar.util.JPAUtil;
 
public class Main {

    static void test1() {
        Person person=new Person(101, "John", LocalDate.of(1998, 2, 20), 'M', null);

        ContactInfo contactInfo=new ContactInfo("John@gmail.com", "9764736738", null);
        person.setContactInfo(contactInfo);
        contactInfo.setPerson(person);

        EntityManager em=JPAUtil.createEntityManager("PU");
        em.getTransaction().begin();
        em.persist(person);
        em.getTransaction().commit();
        JPAUtil.shutDown();
    }
    
    static void test2(){
    	Person person=null;
    	  EntityManager em=JPAUtil.createEntityManager("PU");
          person=em.find(Person.class, 101);
          System.out.println(person);
          JPAUtil.shutDown();
    }
    
 
    public static void main(String[] args) {
        test1();
 
    }
 
}