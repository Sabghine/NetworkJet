package pidev.spring.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import pidev.spring.entities.Feedback;



public interface IFeedback {
	
	List<Feedback> retrieveAllFeedbacks();

	Feedback addFeeback(Feedback f);

	@Transactional
	void deleteProduit(Long id);

	Feedback updateFeedback(Feedback f, Long id);

	Feedback retrieveFeed(Long id);

}
