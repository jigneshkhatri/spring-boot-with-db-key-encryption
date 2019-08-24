package in.quallit.springboot.dbKeyEncryption.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.quallit.springboot.dbKeyEncryption.entities.User;
import in.quallit.springboot.dbKeyEncryption.entities.common.PrimaryKey;

// TODO: Auto-generated Javadoc
/**
 * The Interface UserRepository.
 *
 * @author JIGS
 */
@Repository
public interface UserRepository extends JpaRepository<User, PrimaryKey> {

	/**
	 * Find by email.
	 *
	 * @param email the email
	 * @return the optional
	 */
	Optional<User> findByEmail(String email);

	/**
	 * Find by contact number.
	 *
	 * @param contactNumber the contact number
	 * @return the optional
	 */
	Optional<User> findByContactNumber(Long contactNumber);
}
