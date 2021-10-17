package project.Customs.Sche.New;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.Customs.Sche.ScheDTO;

@Repository
public interface CustomScheNewDAO extends JpaRepository<ScheDTO,Long> {

}
