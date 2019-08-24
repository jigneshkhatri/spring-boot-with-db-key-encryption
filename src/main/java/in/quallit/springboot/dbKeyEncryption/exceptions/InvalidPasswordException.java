/**
 * 
 */
package in.quallit.springboot.dbKeyEncryption.exceptions;

/**
 * @author JIGS
 *
 */
public class InvalidPasswordException extends RuntimeException {
	public InvalidPasswordException(String message) {
		super(message);
	}
}
