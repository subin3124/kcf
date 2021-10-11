package project.Custom.NewCustom;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.Custom.CustomDTO;

@Repository
public interface NewCustomDAO extends JpaRepository<CustomDTO,Long>{
    
}
