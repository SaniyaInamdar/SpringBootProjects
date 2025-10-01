package com.saniya.SpringBootWithHiberenate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saniya.SpringBootWithHiberenate.entity.Mobile;
import com.saniya.SpringBootWithHiberenate.service.MobileService;

@RestController
@RequestMapping("/api")
public class MobileController {
	
	@Autowired
	MobileService ms;
	
	@GetMapping("/print")
	public String printdata() {
		return "hello in spring";
	}
	
	@PostMapping("/insert")
	public void inserdata(@RequestBody Mobile mob) {
		ms.inserdata(mob);
	}
	
	@PutMapping("/update")
	public void updatedata(@RequestBody Mobile mob) {
		ms.updatedata(mob);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deletedata(@PathVariable int id) {
		ms.deletedata(id);
	}
	
	@GetMapping("/get/{id}")
	public Mobile getmobilebyID(@PathVariable int id) {
		return ms.getmobilebyID(id);
	}
	
	@GetMapping("/getall")
	public List<Mobile> getallmobiles(){
		return ms.getallmobiles();
	}
	
	@PostMapping("/manyinsert")
	public void inserdatamany(@RequestBody List<Mobile> mob) {
		for(Mobile mobile: mob) {
			ms.inserdata(mobile);
		}
	}
	
	
}
