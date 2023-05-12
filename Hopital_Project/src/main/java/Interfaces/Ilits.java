package Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.Lits;

@Repository
public interface Ilits extends JpaRepository<Lits, Long>{

}
