package project.Custom.ViewCustomDetails;

import org.springframework.data.jpa.repository.JpaRepository;

import project.Custom.CustomDTO;

public interface CustomDetailsDAO extends JpaRepository<CustomDTO,Long>{
    CustomDTO findCustomDTOById(long id);
    CustomDTO findCustomDTOByOrderfk(long orderfk);
    
}
