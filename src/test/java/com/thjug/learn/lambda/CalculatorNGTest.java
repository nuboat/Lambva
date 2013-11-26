/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.thjug.learn.lambda;

import com.thjug.learn.lambda.Calculator;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author PeerapatAsoktummarun
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
