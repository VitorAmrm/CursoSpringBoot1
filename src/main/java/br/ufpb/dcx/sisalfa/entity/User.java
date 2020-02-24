package br.ufpb.dcx.sisalfa.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String email;
	
	@ManyToMany
	private Set<Role> roles;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	

	@Override
	public String toString() {
		return "User: {\n id: " + id + ",\n nome:" + nome + ",\n email:" + email + ",\n roles:" + roles + "\n}";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}