package Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.Maladies;

@Repository
public interface IMaladies extends JpaRepository<Maladies, Long>{

}
