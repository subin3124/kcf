package project.Customs.Block.Find;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.Customs.Block.BlockDTO;

import java.util.List;

@Repository
public interface CustomBlockFindDAO extends JpaRepository<BlockDTO, Long> {
        List<BlockDTO> findBlockDTOSByScheid(long sccheid);
        List<BlockDTO> findBlockDTOSByCompany(long company);
}