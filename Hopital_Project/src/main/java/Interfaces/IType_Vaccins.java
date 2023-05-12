package Interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.Type_Vaccins;

@Repository
public interface IType_Vaccins extends JpaRepository<Type_Vaccins, Long>{

}
