package com.devsuperior.userdept.reposotories;

import com.devsuperior.userdept.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long>{
}
