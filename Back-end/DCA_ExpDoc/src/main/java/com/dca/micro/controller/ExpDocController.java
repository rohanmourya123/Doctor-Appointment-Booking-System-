package com.dca.micro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dca.micro.entity.ExpDoc;
import com.dca.micro.services.ExpDocServices;

@RestController
@RequestMapping("/experience")
public class ExpDocController {
	@Autowired
	ExpDocServices expDocServices;
	
	@PostMapping
	public ResponseEntity<ExpDoc> createExp(@RequestBody ExpDoc expDoc) {
		return ResponseEntity.status(HttpStatus.CREATED).body(expDocServices.createExperience(expDoc));
	}
	
	@GetMapping
	public ResponseEntity<List<ExpDoc>> getAllExp() {
		return ResponseEntity.status(HttpStatus.FOUND).body(expDocServices.getAllExperience());
	}
	
	@GetMapping("/{experience_id}")
	public ResponseEntity<ExpDoc> getSingleExp(@PathVariable String experience_id) {
		return ResponseEntity.status(HttpStatus.FOUND).body(expDocServices.getSingleExperience(experience_id));
	}
	
	@PutMapping("/{experience_id}")
	public ResponseEntity<Void> updateExp(@PathVariable String experience_id, @RequestBody ExpDoc expDoc) {
		expDocServices.updateExperience(experience_id, expDoc);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
	
	@DeleteMapping("/{experience_id}")
	public ResponseEntity<Void> deleteExp(@PathVariable String experience_id) {
		expDocServices.deleteExperience(experience_id);
		return ResponseEntity.status(HttpStatus.OK).build();
	}
}
