package com.xlythe.math;

public class SyntaxException extends org.javia.arity.SyntaxException {
  static SyntaxException from(org.javia.arity.SyntaxException e) {
    SyntaxException syntaxException = new SyntaxException();
    syntaxException.expression = e.expression;
    syntaxException.message = e.message;
    syntaxException.position = e.position;
    syntaxException.setStackTrace(e.getStackTrace());
    return syntaxException;
  }

  @Override
  public String getMessage() {
    return message;
  }
}
