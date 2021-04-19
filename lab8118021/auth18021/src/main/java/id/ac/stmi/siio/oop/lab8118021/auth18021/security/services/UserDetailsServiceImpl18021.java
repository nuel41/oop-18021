package id.ac.stmi.siio.oop.lab8118021.auth18021.security.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import id.ac.stmi.siio.oop.lab8118021.auth18021.model.User;
import id.ac.stmi.siio.oop.lab8118021.auth18021.repository.UserRepository18021;

@Service
public class UserDetailsServiceImpl18021 implements UserDetailsService {
	
	@Autowired
	UserRepository18021 userRepository;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username)
				.orElseThrow(() -> new UsernameNotFoundException("User Not Found with username: " + username));

		return UserDetailsImpl18021.build(user);
	}

}