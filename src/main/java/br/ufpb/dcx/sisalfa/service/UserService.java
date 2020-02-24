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
}
