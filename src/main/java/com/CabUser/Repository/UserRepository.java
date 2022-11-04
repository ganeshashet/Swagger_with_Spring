package com.CabUser.Repository;

import com.CabUser.Model.CabUser;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<CabUser,Integer>{
	
	// query to find the id to delete
	@Query(value="select * from cab_user where user_id=?1", nativeQuery=true)
	CabUser findByUserId(int id);

}
