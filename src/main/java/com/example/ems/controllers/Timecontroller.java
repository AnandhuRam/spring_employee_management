package com.example.ems.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ems.entities.Time;
import com.example.ems.repositories.Timerepo;

@RestController
@RequestMapping("/api/v1/")
public class Timecontroller {
	
	@Autowired
	private Timerepo timerepo;
	
	//get all time details
	
	@GetMapping("/time")
	public List<Time> getTime(){
		return timerepo.findAll();
	}
	
	//inserting elements
	@PostMapping("/time")
	public Time addTime( @RequestBody Time time) {
		return timerepo.save(time);
	}
	
	// get time details by employee id
	
	@GetMapping("/time/{id}")
	public ResponseEntity<Time>  getTimeById( @PathVariable int id) {
		Time time = timerepo.findById(id)
				.orElseThrow();
		
		return ResponseEntity.ok(time);			
	}
	//update time api
	
	@PutMapping("/time/{id}")
	public ResponseEntity<Time> updateTime(@PathVariable int id,@RequestBody Time timeupd){
		
		Time time = timerepo.findById(id)
				.orElseThrow();
		
		time.setDays_Off(timeupd.getDays_Off());
		time.setExtra_Days(timeupd.getExtra_Days());
		time.setFrom_Date_Day(timeupd.getFrom_Date_Day());
		time.setOff_Hours(timeupd.getOff_Hours());
		time.setOver_Time(timeupd.getOver_Time());
		time.setW_From_Date_Month(timeupd.getW_From_Date_Month());
		time.setW_To_Date_Day(timeupd.getW_To_Date_Day());
		time.setW_To_Date_Month(timeupd.getW_To_Date_Month());
		time.setW_To_Date_Year(timeupd.getW_To_Date_Year());
		time.setWorked_Hours(timeupd.getWorked_Hours());
		
		Time updatedtime = timerepo.save(time);
		
		return ResponseEntity.ok(updatedtime);	
	}
	
	// delete time details
	@DeleteMapping("/time/{id}")
	public ResponseEntity <Map<String, Boolean>> deleteTime(@PathVariable int id){
		Time time = timerepo.findById(id)
				.orElseThrow();
		timerepo.delete(time);
		Map<String,Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}
	
}
