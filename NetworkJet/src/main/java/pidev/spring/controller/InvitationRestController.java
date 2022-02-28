package pidev.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import pidev.spring.entities.Invitation;
import pidev.spring.service.InvitationService;

@RestController
@RequestMapping("/api/invitation")
@CrossOrigin
public class InvitationRestController {
	
	@Autowired
	InvitationService invitationService;
	@RequestMapping(method = RequestMethod.GET)
	public List<Invitation> getAllInvitations() {
	return invitationService.getAllInvitations();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Invitation getInvitationById(@PathVariable("id") Long id) {
	return invitationService.getInvitation(id);
	 }
	
	@RequestMapping(method = RequestMethod.POST)
	public Invitation sendInvitation(@RequestBody Invitation invitation) {
	return invitationService.saveInvitation(invitation);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Invitation updateInvitation(@RequestBody Invitation invitation) {
	return invitationService.updateInvitation(invitation);
	}



}
