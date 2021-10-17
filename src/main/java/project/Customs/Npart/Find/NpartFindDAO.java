package project.Customs.Npart.Find;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.Customs.Block.BlockDTO;
import project.Customs.Npart.NpartDTO;

import java.util.List;

@Repository
public interface NpartFindDAO extends JpaRepository<NpartDTO, Long> {
        List<NpartDTO> findNpartDTOSByScheid(long scheid);

}