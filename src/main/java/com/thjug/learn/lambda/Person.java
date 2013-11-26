/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.thjug.learn.lambda;

/**
 *
 * @author PeerapatAsoktummarun
 */
public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    Integer age;
    Sex gender;
    String emailAddress;
	
	public Person(final String name, final Integer age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(final Integer age) {
		this.age = age;
	}

	public Sex getGender() {
		return gender;
	}

	public void setGender(final Sex gender) {
		this.gender = gender;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(final String emailAddress) {
		this.emailAddress = emailAddress;
	}

    public void printPerson() {
        System.out.println(name);
    }
	
	public int compareAge(final Person str) {
        return this.getAge().compareTo(str.getAge());
    }

}
