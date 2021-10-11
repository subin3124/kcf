package project.Comapny.View_Details;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import project.Company.CompanyDTO;

@Repository
public interface ViewDetailsDAO extends JpaRepository<CompanyDTO, Long>{
    CompanyDTO findCompanyDTOById(Long id);
}
