package Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.Scanners;

@Repository
public interface IScanners extends JpaRepository< Scanners, Long>{

}
