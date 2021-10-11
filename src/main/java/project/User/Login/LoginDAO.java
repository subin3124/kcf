package project.User.Login;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import project.User.UserDTO;

@Repository
public interface LoginDAO extends CrudRepository<UserDTO, String>{ //JpaRepository<Type, ID> id type은 추후 ERD보고 변경 할 수 있음
   UserDTO findUserDTOById(String id);
}
