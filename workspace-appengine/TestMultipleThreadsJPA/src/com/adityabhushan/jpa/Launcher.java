package com.adityabhushan.jpa;

import java.util.List;

public class Launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PersonDAO personDao = new PersonDAO();
		
		Person person1 = new Person();
		person1.setName("name1");
		Person person2 = new Person();
		person1.setName("name2");
		personDao.persisPerson(person1);
		personDao.persisPerson(person2);
		
		List<Person> persons = personDao.getAllPersons();
		System.out.println(persons);
	}

}
