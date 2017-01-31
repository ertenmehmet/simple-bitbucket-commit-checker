package se.bjurr.sbcc.settings;

public class ValidationException extends Exception {
  private static final long serialVersionUID = 2203598567281456784L;
  private final String error;
  private final String field;

  public ValidationException(String field, String error) {
    this.error = error;
    this.field = field;
  }

  public String getError() {
    return error;
  }

  public String getField() {
    return field;
  }

  @Override
  public String getMessage() {
    return field + "=" + error;
  }
}
