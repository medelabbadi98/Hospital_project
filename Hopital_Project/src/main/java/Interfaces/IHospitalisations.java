package Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.Hospitalisations;

@Repository
public interface IHospitalisations extends JpaRepository<Hospitalisations, Long> {

}
