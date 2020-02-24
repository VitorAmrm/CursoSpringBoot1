package br.ufpb.dcx.sisalfa.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import br.ufpb.dcx.sisalfa.entity.User;
import br.ufpb.dcx.sisalfa.repository.UserRepository;

@Component
public class DataInitializer implements ApplicationListener<ContextRefreshedEvent> {

	@Autowired
	UserRepository buscador; // VARIÁVEL QUE FAZ O MEIO DE CAMPO COM DB
	
	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {

		List<User> users = buscador.findAll();

		if (users.isEmpty()) {
			createUser("User1", "email1");
			createUser("User2", "email2");
			createUser("User3", "email3");
			createUser("User4", "email4");
			
		}
		
		List<User> usuarios = buscador.findAll();
		
		for(User u : usuarios)
			System.out.println(u.toString());
		
		
		System.out.println("Rodou a baiana!");
	}

	public void createUser(String nome, String email) {
		User user = new User(nome, email);
		buscador.save(user);
	}

}
