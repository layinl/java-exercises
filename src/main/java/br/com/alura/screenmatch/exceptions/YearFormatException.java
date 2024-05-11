package br.com.alura.screenmatch.exceptions;

/**
 * This exception is thrown when the year format is not in the norm,
 * like: more than 4 characters.
 * <p>This might be a problem in 101st century</p>
 */
public class YearFormatException extends RuntimeException {

  /**
   * Creates a {@code YearFormatException} with the default message
   */
  public YearFormatException() {
    super("Wrong year format");
  }

  /**
   * Creates a {@code YearFormatException} with a custom message
   */
  public YearFormatException(String message) {
    super(message);
  }

}