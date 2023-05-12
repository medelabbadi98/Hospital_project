package Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import entities.Admins;

public interface Iadmin extends JpaRepository<Admins, Long>{

}
