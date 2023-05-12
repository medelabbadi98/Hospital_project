package Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.Operations;

@Repository
public interface IOperations extends JpaRepository<Operations, Long>{

}
