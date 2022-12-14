package com.dominiccaggese.springmvc.loginandregistration.services;

import java.util.Optional;

import org.mindrot.jbcrypt.BCrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.dominiccaggese.springmvc.loginandregistration.models.LoginUser;
import com.dominiccaggese.springmvc.loginandregistration.models.User;
import com.dominiccaggese.springmvc.loginandregistration.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepo;

	public User register(User newUser, BindingResult result) {

		Optional<User> optionalUser = userRepo.findByEmail(newUser.getEmail());
		if(optionalUser.isPresent()) {
			result.rejectValue("email","unique","This email is already registered.");
		}
		// Reject if password doesn't match confirmation
		if(!newUser.getPassword().equals(newUser.getConfirm())) {
			result.rejectValue("password","matches","Passwords do not match.");
			result.rejectValue("confirm","matches","Passwords do not match.");
		}
		// Return null if result has errors
		if(result.hasErrors()) {
			return null;
		}
		// Hash and set password, save user to database
		String hashed = BCrypt.hashpw(newUser.getPassword(), BCrypt.gensalt());
		newUser.setPassword(hashed);
		userRepo.save(newUser);

		return newUser;	
	}

	public User login(LoginUser newLogin, BindingResult result) {

		Optional<User> optionalUser = userRepo.findByEmail(newLogin.getEmail());
        if(!optionalUser.isPresent()) {
        	result.rejectValue("email","unique","This email is not registered");
        	return null;
        }
        
        User user = optionalUser.get();
        // Reject if BCrypt password match fails
        if(!BCrypt.checkpw(newLogin.getPassword(), user.getPassword())) {
            result.rejectValue("password", "Matches", "Invalid Password!");
        }
        if(result.hasErrors()) {
			return null;
		}
        
		return user;
	}
}
