package Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.Specialites;
@Repository
public interface ISpecialites extends JpaRepository<Specialites, Long>{

}
