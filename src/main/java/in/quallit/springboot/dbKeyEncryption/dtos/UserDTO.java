/**
 * 
 */
package in.quallit.springboot.dbKeyEncryption.dtos;

import in.quallit.springboot.dbKeyEncryption.dtos.common.AbstractDTO;

// TODO: Auto-generated Javadoc
/**
 * The Class UserDTO.
 *
 * @author JIGS
 */
public class UserDTO extends AbstractDTO {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7390762214006245699L;

	/** The name. */
	private String name;

	/** The email. */
	private String email;

	/** The contact number. */
	private Long contactNumber;

	/** The password. */
	private String password;

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Gets the contact number.
	 *
	 * @return the contact number
	 */
	public Long getContactNumber() {
		return contactNumber;
	}

	/**
	 * Sets the contact number.
	 *
	 * @param contactNumber the new contact number
	 */
	public void setContactNumber(Long contactNumber) {
		this.contactNumber = contactNumber;
	}

	/**
	 * Gets the password.
	 *
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Sets the password.
	 *
	 * @param password the new password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

}
