package Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.User_App;

@Repository
public interface IUser_app extends JpaRepository<User_App, Long>{

}
