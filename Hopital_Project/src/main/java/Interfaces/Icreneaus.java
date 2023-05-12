package Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.Creneaus;

@Repository
public interface Icreneaus extends JpaRepository<Creneaus, Long> {

}
