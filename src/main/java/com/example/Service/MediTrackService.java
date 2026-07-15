package com.example.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Repository.MediTrackRepository;
import com.example.dto.MediTrackDto;
import com.example.entities.MediTrackEntities;
import com.example.shared.MediTrackShared;




@Service
public class MediTrackService implements MediTrackShared{

	@Autowired
	MediTrackRepository repo;
	
	@Override
	public MediTrackDto saveOrUpdate(MediTrackDto dto) {
		
		return null;
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
	                .orElseThrow(() -> new RuntimeException("kayıt bulunamadı!"));
		meditrack.setStatus("0"); 
	        repo.save(meditrack);
	}
	
}