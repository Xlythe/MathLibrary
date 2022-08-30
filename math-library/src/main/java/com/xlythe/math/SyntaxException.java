package com.xlythe.math;

public class SyntaxException extends Exception {
  static SyntaxException from(org.javia.arity.SyntaxException e) {
    SyntaxException syntaxException = new SyntaxException(e.toString());
    syntaxException.setStackTrace(e.getStackTrace());
    return syntaxException;
  }

  public SyntaxException() {
    super();
  }

  public SyntaxException(String message) {
    super(message);
  }
}
