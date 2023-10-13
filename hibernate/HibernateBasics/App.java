package com.hibernate.HibernateBasics;

import com.models.Info;
import com.models.Person;
import com.models.Students;

public class App {
  public static void main(String[] args) {
	  Students student=new Students("Alfred","NIMB");
	  SavingData<Students> data=new SavingData<Students>();
	  data.saveData(student);
	  
	  RetrieveData retrieve=new RetrieveData();
	  Students stud=retrieve.retrieveData(2);
	  System.out.println(stud);
	  
	  Info info=new Info("Imran","Khan");
	  Person person=new Person();
	  person.setInfo(info);
	  
	  SavingData<Person> data1=new SavingData<Person>();
	  data1.saveData(person);
  }
}
