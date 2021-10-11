package project.Image;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageDAO extends JpaRepository<ImageDTO, Long> {
    List<ImageDTO> findImageDTOsByCompanyAndType(String company, int type);
    List<ImageDTO> findImageDTOsByCustomAndType(String custom, int type);
    
}
