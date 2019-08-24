/**
 * 
 */
package in.quallit.springboot.dbKeyEncryption.dtos.common;

import java.io.Serializable;


// TODO: Auto-generated Javadoc
/**
 * The Class AbstractDTO.
 *
 * @author JIGS
 */
public abstract class AbstractDTO implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -2856049089851268954L;

	/** The id. */
	private String id;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
	}

}
