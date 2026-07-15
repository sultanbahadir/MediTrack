package com.example.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.Service.MediTrackService;
import com.example.dto.MediTrackDto;

@RestController
@RequestMapping("/rest/api/mediTrack")
public class MediTrackController {

    private final MediTrackService mediTrackService;

    public MediTrackController(MediTrackService mediTrackService) {
        this.mediTrackService = mediTrackService;
    }

	@GetMapping("/list")
	public List<MediTrackDto> getAllMediTrack() {
		return mediTrackService.getAllMediTrack();
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteDrug(@PathVariable Long id) {
		mediTrackService.deleteMediTrack(id);
	}
}
