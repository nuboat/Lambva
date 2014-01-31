/**
 * Attribution
 * CC BY
 * This license lets others distribute, remix, tweak,
 * and build upon your work, even commercially,
 * as long as they credit you for the original creation.
 * This is the most accommodating of licenses offered.
 * Recommended for maximum dissemination and use of licensed materials.
 *
 * http://creativecommons.org/licenses/by/3.0/
 * http://creativecommons.org/licenses/by/3.0/legalcode
 */
package com.thjug.learn.lambda;

/**
 *
 * @author nuboat
 */
public class Person {

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

    public enum Sex {
        MALE, FEMALE
    }

}
