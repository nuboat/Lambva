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
public class Calculator {

    interface IntegerMath {
        int operation(final int a, final int b);
    }

    public int operateBinary(final int a, final int b, final IntegerMath op) {
        return op.operation(a, b);
    }

}
