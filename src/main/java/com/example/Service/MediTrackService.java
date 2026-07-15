package com.example.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dto.MediTrackDto;
import com.example.entities.MediTrackEntities;
import com.example.repository.MediTrackRepository;
import com.example.shared.MediTrackShared;

@Service
public class MediTrackService implements MediTrackShared{

	@Autowired
	MediTrackRepository repo;
	
	@Override
	public MediTrackDto saveOrUpdate(MediTrackDto dto) {
		 MediTrackEntities entities;

		    if (dto.getId() != null) {
		    	entities = repo.findById(dto.getId()).orElse(new MediTrackEntities());
		    } else {
		    	entities = new MediTrackEntities();
		    }

		    entities.setName(dto.getName());
		    entities.setCode(dto.getCode());
		    entities.setCategory(dto.getCategory());
		    entities.setCompany(dto.getCompany());
		    entities.setStockQuantity(dto.getStockQuantity());
		    entities.setPrice(dto.getPrice());
		    entities.setExpirationDate(dto.getExpirationDate());
		    entities.setDescription(dto.getDescription());
		    entities.setStatus("1");

		    MediTrackEntities savedDrug = repo.save(entities);

		    return convertEntityToDTO(savedDrug);
			}
	

	private MediTrackDto convertEntityToDTO(MediTrackEntities entity) {
		MediTrackDto dto = new MediTrackDto();

	    dto.setId(entity.getId());
	    dto.setName(entity.getName());
	    dto.setCode(entity.getCode());
	    dto.setCategory(entity.getCategory());
	    dto.setCompany(entity.getCompany());
	    dto.setStockQuantity(entity.getStockQuantity());
	    dto.setPrice(entity.getPrice());
	    dto.setExpirationDate(entity.getExpirationDate());
	    dto.setDescription(entity.getDescription());
	    dto.setStatus(entity.getStatus());
	    return dto;
	}
	
	@Override
	public List<MediTrackDto> getAllMediTrack() {
		
		 List<MediTrackEntities> mediList = repo.findByStatus("1");
		    List<MediTrackDto> dtoList = new ArrayList<>();
		    for (MediTrackEntities mediTrack : mediList) {
		    	MediTrackDto dto = convertEntityToDTO(mediTrack);
		        dtoList.add(dto);
		    }
		    return dtoList;
	}

	@Override
	public void deleteMediTrack(Long id) {
		MediTrackEntities meditrack = repo.findById(id)
	                .orElseThrow(() -> new NoSuchElementException("Kayıt Bulunamadı!"));
		meditrack.setStatus("0"); 
	        repo.save(meditrack);
	}
	
}