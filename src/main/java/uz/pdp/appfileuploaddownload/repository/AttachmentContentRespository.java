package uz.pdp.appfileuploaddownload.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.appfileuploaddownload.entity.Attachment;
import uz.pdp.appfileuploaddownload.entity.AttachmentContent;

import java.util.Optional;

public interface AttachmentContentRespository extends JpaRepository<AttachmentContent, Integer> {


    Optional<AttachmentContent> findByAttachmentId(Integer attachmet_id);
}
