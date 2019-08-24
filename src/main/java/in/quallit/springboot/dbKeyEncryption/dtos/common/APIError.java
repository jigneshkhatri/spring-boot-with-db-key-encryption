/**
 * 
 */
package in.quallit.springboot.dbKeyEncryption.dtos.common;

import java.io.Serializable;
import java.util.Date;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonFormat;

// TODO: Auto-generated Javadoc
/**
 * The Class APIError.
 *
 * @author JIGS
 */
public class APIError implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6364436606285438796L;

	/** The message. */
	private String message;

	/** The timestamp. */
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
	private Date timestamp;

	/** The status. */
	private HttpStatus status;

	/** The debug message. */
	private String debugMessage;

	/**
	 * Instantiates a new API error.
	 */
	public APIError() {
		this.timestamp = new Date();
	}

	/**
	 * Instantiates a new API error.
	 *
	 * @param status       the status
	 * @param debugMessage the debug message
	 */
	public APIError(HttpStatus status, String debugMessage) {
		this();
		this.status = status;
		this.debugMessage = debugMessage;
	}

	/**
	 * Instantiates a new API error.
	 *
	 * @param status       the status
	 * @param message      the message
	 * @param debugMessage the debug message
	 */
	public APIError(HttpStatus status, String message, String debugMessage) {
		this();
		this.message = message;
		this.debugMessage = debugMessage;
		this.status = status;
	}

	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * Sets the message.
	 *
	 * @param message the new message
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * Gets the timestamp.
	 *
	 * @return the timestamp
	 */
	public Date getTimestamp() {
		return timestamp;
	}

	/**
	 * Sets the timestamp.
	 *
	 * @param timestamp the new timestamp
	 */
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * Gets the status.
	 *
	 * @return the status
	 */
	public HttpStatus getStatus() {
		return status;
	}

	/**
	 * Sets the status.
	 *
	 * @param status the new status
	 */
	public void setStatus(HttpStatus status) {
		this.status = status;
	}

	/**
	 * Gets the debug message.
	 *
	 * @return the debug message
	 */
	public String getDebugMessage() {
		return debugMessage;
	}

	/**
	 * Sets the debug message.
	 *
	 * @param debugMessage the new debug message
	 */
	public void setDebugMessage(String debugMessage) {
		this.debugMessage = debugMessage;
	}

}
