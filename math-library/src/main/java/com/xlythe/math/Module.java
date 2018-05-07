package com.xlythe.math;

/**
 * A super class for BaseModule, GraphModule, MatrixModule
 */
@SuppressWarnings({"WeakerAccess", "unused"})
public class Module {
    // Used whenever math is necessary
    private final Solver mSolver;

    // Used for formatting Dec, Bin, and Hex.
    // Dec looks like 1,234,567. Bin is 1010 1010. Hex is 0F 1F 2F.
    private static final int DECIMAL_SEPARATOR_DISTANCE = 3;
    private static final int BINARY_SEPARATOR_DISTANCE = 4;
    private static final int HEXADEICMAL_SEPARATOR_DISTANCE = 2;

    Module(Solver solver) {
        mSolver = solver;
    }

    public int getDecSeparatorDistance() {
        return DECIMAL_SEPARATOR_DISTANCE;
    }

    public int getBinSeparatorDistance() {
        return BINARY_SEPARATOR_DISTANCE;
    }

    public int getHexSeparatorDistance() {
        return HEXADEICMAL_SEPARATOR_DISTANCE;
    }

    public char getDecimalPoint() {
        return Constants.DECIMAL_POINT;
    }

    public char getDecSeparator() {
        return Constants.DECIMAL_SEPARATOR;
    }

    public char getBinSeparator() {
        return Constants.BINARY_SEPARATOR;
    }

    public char getHexSeparator() {
        return Constants.HEXADECIMAL_SEPARATOR;
    }

    public char getMatrixSeparator() {
        return Constants.MATRIX_SEPARATOR;
    }

    public Solver getSolver() {
        return mSolver;
    }
}
