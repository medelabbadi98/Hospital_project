package Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.Traitements;

@Repository
public interface ITraitements extends JpaRepository<Traitements, Long>{

}
