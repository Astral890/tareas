package com.tareas.repository;

import com.tareas.model.TareaModel;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository 
public interface TareaRepository extends JpaRepository<TareaModel, Integer> {

}
