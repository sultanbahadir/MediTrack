package com.example.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.Service.MediTrackService;
import com.example.dto.MediTrackDto;


@RestController
@RequestMapping("/rest/api/mediTrack")
@CrossOrigin(origins = "http://localhost:4200") 
public class MediTrackController {

    private final MediTrackService mediTrackService;

    public MediTrackController(MediTrackService mediTrackService) {
        this.mediTrackService = mediTrackService;
    }
    

	@PostMapping(path = "/saveOrUpdate")
	public MediTrackDto saveOrUpdate(@RequestBody MediTrackDto mediTrackDto) {
		return mediTrackService.saveOrUpdate(mediTrackDto);
	}

	@GetMapping("/list")
	public List<MediTrackDto> getAllMediTrack() {
		return mediTrackService.getAllMediTrack();
	}
	
	@DeleteMapping("/delete/{id}")
	public org.springframework.http.ResponseEntity<Void> deleteDrug(@PathVariable Long id) {
		mediTrackService.deleteMediTrack(id);
		return org.springframework.http.ResponseEntity.ok().build();
	}
}