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

import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author nuboat
 */
public class CalculatorNGTest {

    @Test
    public void testOperateAdd() {

        final Calculator myApp = new Calculator();
		assertEquals(myApp.operateBinary(40, 2, (a, b) -> a + b), 42);
    }

	@Test
    public void testOperateSubtract() {

        final Calculator myApp = new Calculator();
		assertEquals(myApp.operateBinary(20, 10, (a, b) -> a - b), 10);
    }

}
