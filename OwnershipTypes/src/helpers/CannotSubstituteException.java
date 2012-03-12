package helpers;

/**
 * @author ilyas
 */
public class CannotSubstituteException extends Error {
  public CannotSubstituteException(final String name) {
    super("Cannot substitute for the parameter '" + name + "'");
  }
}
