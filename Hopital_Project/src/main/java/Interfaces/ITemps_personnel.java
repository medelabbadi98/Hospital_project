package Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.Temps_personnel;

@Repository
public interface ITemps_personnel extends JpaRepository<Temps_personnel, Long> {

}
