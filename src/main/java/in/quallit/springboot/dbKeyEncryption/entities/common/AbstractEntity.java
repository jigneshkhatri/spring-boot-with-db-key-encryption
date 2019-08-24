package in.quallit.springboot.dbKeyEncryption.entities.common;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.MappedSuperclass;


/**
 * The Class AbstractEntity.
 */
@MappedSuperclass
@IdClass(PrimaryKey.class)
public abstract class AbstractEntity implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -1191422925622832672L;

	/** The id. */
	private String id;

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
