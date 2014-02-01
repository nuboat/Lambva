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

import java.util.Arrays;
import org.testng.annotations.Test;

/**
 *
 * @author nuboat
 */
public class PersonNGTest {

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
