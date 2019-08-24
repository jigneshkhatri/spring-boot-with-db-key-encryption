/**
 * 
 */
package in.quallit.springboot.dbKeyEncryption.controllers;

import java.io.IOException;

import org.mapstruct.factory.Mappers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.quallit.springboot.dbKeyEncryption.controllers.common.AbstractController;
import in.quallit.springboot.dbKeyEncryption.dtos.UserDTO;
import in.quallit.springboot.dbKeyEncryption.entities.User;
import in.quallit.springboot.dbKeyEncryption.entities.common.ResponseBody;
import in.quallit.springboot.dbKeyEncryption.mappers.IAbstractMapper;
import in.quallit.springboot.dbKeyEncryption.mappers.IUserMapper;
import in.quallit.springboot.dbKeyEncryption.services.AbstractService;
import in.quallit.springboot.dbKeyEncryption.services.UserService;
import in.quallit.springboot.dbKeyEncryption.utilities.ObjectUtil;

// TODO: Auto-generated Javadoc
/**
 * The Class UserController.
 *
 * @author JIGS
 */
@RestController
@RequestMapping(value = "user")
public class UserController extends AbstractController<User, UserDTO> {

	// Routes start
	// Routes end

	/** The user service. */
	private UserService userService;

	/** The user mapper. */
	private IUserMapper userMapper;

	/**
	 * Instantiates a new user controller.
	 *
	 * @param userService the user service
	 */
	public UserController(UserService userService) {
		this.userService = userService;
		this.userMapper = Mappers.getMapper(IUserMapper.class);
	}

	/**
	 * Gets the service.
	 *
	 * @return the service
	 */
	@Override
	protected AbstractService<User> getService() {
		return userService;
	}

	/**
	 * Gets the mapper.
	 *
	 * @return the mapper
	 */
	@Override
	protected IAbstractMapper<User, UserDTO> getMapper() {
		return userMapper;
	}

	/**
	 * Response clean up.
	 *
	 * @param entity the entity
	 */
	@Override
	protected void responseCleanUp(User entity) {
		entity.setPassword(null);
	}

}
