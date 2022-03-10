package pidev.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pidev.spring.entities.Feedback;

@Repository
public interface FeedbackRepository extends JpaRepository <Feedback,Long> {
	
	
}
