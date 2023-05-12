package Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.Type_Maladies;

@Repository
public interface IType_maladie extends JpaRepository<Type_Maladies, Long>{

}
