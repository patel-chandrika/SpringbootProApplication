package spring.pro.application.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import spring.pro.application.model.User;

public interface UserRepository extends JpaRepository<User, Long> 
{
	
}
