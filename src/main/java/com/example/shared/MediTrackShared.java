package com.example.shared;

import java.util.List;
import com.example.dto.MediTrackDto;

public interface MediTrackShared {
	
	MediTrackDto saveOrUpdate(MediTrackDto dto);

	List<MediTrackDto> getAllMediTrack();

	void deleteMediTrack(Long id);

}