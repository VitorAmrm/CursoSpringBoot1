package br.ufpb.dcx.sisalfa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.ufpb.dcx.sisalfa.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	
	//MÉTODO PARA BUSCAR USUÁRIO PELO nome - QUANDO USA O FINDBY<ALGO> O SPRING PROCURA UMA COLUNA NA BASE DE DADOS COM ESSE ALGO
	public User findByNome(String nome);
	
	
	// SELECT u FROM User u WHERE u.status = ?1
	@Query("SELECT u FROM User u WHERE u.nome like %?1%")
	public User findByQualquerCoisa(String nome);
}