package com.xlythe.math;

import junit.framework.TestCase;

import org.javia.arity.SyntaxException;

public class MathTest extends TestCase {
    public void testAddition() throws SyntaxException {
        Solver solver = new Solver();
        assertEquals("Addition", "3", solver.solve("1+2"));
    }

    public void testComplexMath() throws SyntaxException {
        Solver solver = new Solver();
        assertEquals("Trig", "1", solver.solve("sind(90)"));
    }

    public void testMatrices() throws SyntaxException {
        Solver solver = new Solver();

        assertEquals("Matrix", true, solver.displayContainsMatrices("[[0]]+[[1]]"));
        assertEquals("Matrix", false, solver.displayContainsMatrices("1+2"));

        assertEquals("Matrix", false, solver.getMatrixModule().isMatrix("0"));
        assertEquals("Matrix", true, solver.getMatrixModule().isMatrix("[[0]]"));

        assertEquals("Matrix", "[[1]]", solver.solve("[[0]]+[[1]]"));
        assertEquals("Matrix", "[[1,1]]", solver.solve("[[0,0]]+[[1,1]]"));
        assertEquals("Matrix", "[[1,1][1,1]]", solver.solve("[[0,0][0,0]]+[[1,1][1,1]]"));
    }
}