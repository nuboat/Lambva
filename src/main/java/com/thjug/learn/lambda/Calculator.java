/**
 * Attribution CC BY This license lets others distribute, remix, tweak, and build upon your work, even commercially, as
 * long as they credit you for the original creation. This is the most accommodating of licenses offered. Recommended
 * for maximum dissemination and use of licensed materials.
 *
 * http://creativecommons.org/licenses/by/3.0/ http://creativecommons.org/licenses/by/3.0/legalcode
 */
package com.thjug.learn.lambda;

/**
 *
 * @author nuboat
 */
public class Calculator {

	public int operateBinary(final int a, final int b, final IntegerMath op) {
		return op.operation(a, b);
	}

	interface IntegerMath {
		int operation(final int a, final int b);
	}

	class AddIntegerMath implements IntegerMath {

		@Override
		public int operation(int a, int b) {
			return a+b;
		}

	}

}
