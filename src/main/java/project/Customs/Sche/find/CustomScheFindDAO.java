package project.Customs.Sche.find;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.Customs.Sche.ScheDTO;

import java.util.List;

@Repository
public interface CustomScheFindDAO extends JpaRepository<ScheDTO, Long> {
    List<ScheDTO> findScheDTOSByCompany(long company);
}
