package Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.Service_de_garde;

@Repository
public interface IService_De_Garde extends JpaRepository<Service_de_garde, Long>{

}
