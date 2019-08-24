/**
 * 
 */
package in.quallit.springboot.dbKeyEncryption.mappers;

import org.mapstruct.Mapper;

import in.quallit.springboot.dbKeyEncryption.dtos.UserDTO;
import in.quallit.springboot.dbKeyEncryption.entities.User;

/**
 * The Interface IUserMapper.
 *
 * @author JIGS
 */
@Mapper
public interface IUserMapper extends IAbstractMapper<User, UserDTO> {

}
