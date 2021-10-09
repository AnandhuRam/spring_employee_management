package com.example.ems.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ems.entities.Time;

@Repository
public interface Timerepo extends JpaRepository<Time, Integer>{

}
