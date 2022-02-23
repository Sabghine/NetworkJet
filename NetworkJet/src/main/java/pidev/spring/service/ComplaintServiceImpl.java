package pidev.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pidev.spring.entities.Complaint;
import pidev.spring.repository.ComplaintRepository;



@Service
public class ComplaintServiceImpl implements IComplaint{
	
	@Autowired
	ComplaintRepository complaintRepository;

	@Override
	public List<Complaint> retrieveAllComplaints() {
		List<Complaint> complaints = (List<Complaint>) complaintRepository.findAll();
		return complaints;
	}

	@Override
	public Complaint addComplaint(Complaint c) {
		return complaintRepository.save(c);
	}

	@Override
	public void deleteComplaint(Long id) {
		complaintRepository.deleteById(id);
		
	}

	@Override
	public Complaint updateComplaint(Complaint c) {
		return complaintRepository.save(c);
	}

	@Override
	public Complaint retrieveComplaint(Long id) {
		return null;
	}
}
	
	