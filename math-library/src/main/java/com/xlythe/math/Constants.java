package com.xlythe.math;

import java.text.DecimalFormatSymbols;
import java.util.regex.Pattern;

/**
 * Created by Will on 11/8/2014.
 */
@SuppressWarnings({"WeakerAccess", "unused"})
public class Constants {
    public static final String INFINITY_UNICODE = "\u221e";
    // Double.toString() for Infinity
    public static final String INFINITY = "Infinity";
    // Double.toString() for NaN
    public static final String NAN = "NaN";
    public static final char MINUS = '\u2212';
    public static final char MUL = '\u00d7';
    public static final char PLUS = '+';
    public static final char DIV = '\u00f7';
    public static final char POWER_PLACEHOLDER = '\u200B';
    public static final char POWER = '^';
    public static final char EQUAL = '=';
    public static final char LEFT_PAREN = '(';
    public static final char RIGHT_PAREN = ')';
    public static char DECIMAL_POINT;
    public static char DECIMAL_SEPARATOR;
    public static char BINARY_SEPARATOR;
    public static char HEXADECIMAL_SEPARATOR;
    public static char MATRIX_SEPARATOR;
    public static String REGEX_NUMBER;
    public static String REGEX_NOT_NUMBER;

    static {
        rebuildConstants();
    }

    /**
     * If the locale changes, but the app is still in memory, you may need to rebuild these constants
     */
    public static void rebuildConstants() {
        DecimalFormatSymbols decimalFormat = new DecimalFormatSymbols();

        // These will already be known by Java
        DECIMAL_POINT = decimalFormat.getDecimalSeparator();
        DECIMAL_SEPARATOR = decimalFormat.getGroupingSeparator();

        // Use a space for Bin and Hex
        BINARY_SEPARATOR = ' ';
        HEXADECIMAL_SEPARATOR = ' ';

        // We have to be careful with the Matrix Separator.
        // It defaults to "," but that's a common decimal point.
        if (DECIMAL_POINT == ',') MATRIX_SEPARATOR = ';';
        else MATRIX_SEPARATOR = ',';

        String number = "A-F0-9" +
                Pattern.quote(String.valueOf(DECIMAL_POINT)) +
                Pattern.quote(String.valueOf(DECIMAL_SEPARATOR)) +
                Pattern.quote(String.valueOf(BINARY_SEPARATOR)) +
                Pattern.quote(String.valueOf(HEXADECIMAL_SEPARATOR));

        REGEX_NUMBER = "[" + number + "]";
        REGEX_NOT_NUMBER = "[^" + number + "]";
    }
}
