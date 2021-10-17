package project.Customs.N.block.Find;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.Customs.Block.BlockDTO;
import project.Customs.N.block.NblockDTO;

import java.util.List;

@Repository
public interface NblockFindDAO extends JpaRepository<NblockDTO, Long> {
        List<NblockDTO> findNblockDTOSByPartid(long partid);
}