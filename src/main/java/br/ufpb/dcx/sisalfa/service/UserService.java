package br.ufpb.dcx.sisalfa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufpb.dcx.sisalfa.entity.User;
import br.ufpb.dcx.sisalfa.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository buscador;
	
	public List<User> findAll() {
		return buscador.findAll();		 	
	}

	public void cadastrar(){
		this.buscador.save(new User("luis.vitor","luis.vitor@dcx.ufpb.br"));
		this.buscador.save(new User("raimundo.ludgerio","raimundo.ludgerio@dcx.ufpb.br"));
		this.buscador.save(new User("camila.tereza","camila.tereza@dcx.ufpb.br"));
		this.buscador.save(new User("ingrid.martins","ingrid.martins@dcx.ufpb.br"));
		this.buscador.save(new User("jeferson.alves","jeferson.alves@dcx.ufpb.br"));
	}
}
