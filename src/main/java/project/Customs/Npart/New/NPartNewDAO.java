package project.Customs.Npart.New;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.Customs.N.block.NblockDTO;
import project.Customs.Npart.NpartDTO;

@Repository
public interface NPartNewDAO extends JpaRepository<NpartDTO, Long> {

}