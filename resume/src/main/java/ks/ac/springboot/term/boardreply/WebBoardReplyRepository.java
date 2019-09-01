package ks.ac.springboot.term.boardreply;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import kr.ac.springboot.term.resume.Resume;
import java.util.List;

public interface WebBoardReplyRepository extends CrudRepository<WebBoardReply, Long> {

	@Query("select rep from ResumeReply rep WHERE rep.res = 1 AND rep.RRno > 0 order by rep.RRno ASC")
	List<WebBoardReply> searchReplyResume1(Resume resume);
}






