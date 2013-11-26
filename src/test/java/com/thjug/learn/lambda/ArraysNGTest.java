/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.thjug.learn.lambda;

import com.thjug.learn.lambda.Person;
import java.util.Arrays;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author PeerapatAsoktummarun
 */
public class ArraysNGTest {
	
	@Test
	public void testSortString() {
		final String[] stringArray = 
			{"James", "Barbara", "Mary", "John", "Patricia", "Robert", "Michael", "Linda"};

		Arrays.sort(stringArray, String::compareToIgnoreCase);
		
		System.out.println(Arrays.deepToString(stringArray));
		assertEquals(stringArray[0], "Barbara");
	}
	
	@Test
	public void testSortPerson() {
		final Person[] persons = new Person[5];
		persons[0] = new Person("Norbor", 32);
		persons[1] = new Person("Peerapat", 16);
		persons[2] = new Person("Kitty", 72);
		persons[3] = new Person("Lego", 55);
		persons[4] = new Person("Nuboat", 8);

		Arrays.sort(persons, Person::compareAge);
		
		System.out.println(Arrays.deepToString(persons));
	}
	
}
