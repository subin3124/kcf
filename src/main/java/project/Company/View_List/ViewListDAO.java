package project.Company.View_List;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import project.Company.CompanyDTO;

@Repository
public interface ViewListDAO extends JpaRepository<CompanyDTO, Long>{
    List<CompanyDTO> findCompanyDTOsByRegion(String region);
}
