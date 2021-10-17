package project.Customs.N.block.New;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.Customs.Block.BlockDTO;
import project.Customs.N.block.NblockDTO;

@Repository
public interface NBlockNewDAO extends JpaRepository<NblockDTO, Long> {

}