package pidev.spring.Service;

import java.util.Collection;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pidev.spring.InterfaceService.Interface_User_Role_Service;
import pidev.spring.Repository.Role_Repository;
import pidev.spring.entities.Role;
 
 

@Service
public class User_Role_Service implements Interface_User_Role_Service{
	
	
	@Autowired
	 Role_Repository role_Repository;

	@Override
	public Role addRole(Role roleToAdd) {
		 
		return role_Repository.save(roleToAdd);
	}

	@Override
	public Collection<Role> retrieveAllRole() {
		 
		return role_Repository.findAll();
	}

	@Override
	public Role saveOrUpdate(Role role) {
		
		return role_Repository.saveAndFlush(role);
	}

 

	@Override
	public String deleteById(Long id) {
		JSONObject jsonObject = new JSONObject();
		try {
			role_Repository.deleteById(id);
			jsonObject.put("message", "User deleted successfully ");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return jsonObject.toString();
	}

	@Override
	public Optional<Role> findById(Long id) {
		return role_Repository.findById(id);
	}
}
