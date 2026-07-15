package com.example.repository;

import com.example.entities.MediTrackEntities;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MediTrackRepository extends JpaRepository<MediTrackEntities, Long> {
	List<MediTrackEntities> findByStatus(String status);

}