/**
 * 
 */
package in.quallit.springboot.dbKeyEncryption.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.quallit.springboot.dbKeyEncryption.entities.User;
import in.quallit.springboot.dbKeyEncryption.repositories.UserRepository;
import in.quallit.springboot.dbKeyEncryption.utilities.ObjectUtil;

// TODO: Auto-generated Javadoc
/**
 * The Class UserService.
 *
 * @author JIGS
 */
@Service
@Transactional(readOnly = true)
public class UserService extends AbstractService<User> {

	/** The user repository. */
	@Autowired
	private UserRepository userRepository;


	/**
	 * Find by email or contact number.
	 *
	 * @param username the username
	 * @return the user
	 */
	public User findByEmailOrContactNumber(String username) {
		if (ObjectUtil.isNumeric(username)) {
			// contact number
			return this.userRepository.findByContactNumber(Long.valueOf(username)).orElse(null);
		} else {
			// email
			return this.userRepository.findByEmail(username).orElse(null);
		}
	}
}
