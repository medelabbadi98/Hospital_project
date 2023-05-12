package Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.Maladies;

@Repository
public interface IMedecins extends JpaRepository<Maladies, Long>{

}
