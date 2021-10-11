package project.Company.Register;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.Company.CompanyDTO;

@Repository
public interface RegisterDAO  extends JpaRepository<CompanyDTO,Long>{
    
    
}
