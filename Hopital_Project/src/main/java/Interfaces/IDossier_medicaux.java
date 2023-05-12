package Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.Dossier_medicaux;

@Repository
public interface IDossier_medicaux extends JpaRepository<Dossier_medicaux, Long> {

}
