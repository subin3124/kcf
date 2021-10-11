package project.User.Register;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.User.UserDTO;

@Repository
public interface UserRegisterDAO extends JpaRepository<UserDTO,String>{
    
}
