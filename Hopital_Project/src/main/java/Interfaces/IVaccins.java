package Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.Vaccins;
@Repository
public interface IVaccins extends JpaRepository<Vaccins, Long>{

}
