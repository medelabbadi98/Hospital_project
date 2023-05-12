package Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.Patients;

@Repository
public interface Ipatient extends JpaRepository<Patients, Long>{

}
