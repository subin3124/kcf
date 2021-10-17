package project.Customs.Block.New;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import project.Customs.Block.BlockDTO;

@Repository
public interface CustomBlockNewDAO extends JpaRepository<BlockDTO, Long> {

}