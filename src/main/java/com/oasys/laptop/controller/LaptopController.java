package com.oasys.laptop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oasys.laptop.entity.Laptop;
import com.oasys.laptop.service.LaptopService;

@RestController
@RequestMapping(value="/laptop")
@CrossOrigin(origins = "*")
public class LaptopController {
	
	@Autowired
	
	LaptopService lapSer;
	@PostMapping(value="post")
	public Laptop addValue(@RequestBody Laptop l) {
		return lapSer.addValue(l);
	}
	
	@GetMapping(value="getid/{id}")
	public Laptop getbyId(@PathVariable int id) {
		return lapSer.getbyId(id);
	}
	
	@GetMapping(value="getall")
	public List<Laptop> find(){
		return lapSer.find();
	}
	
	@PutMapping(value="updateById/{id}")
	public Laptop update(@RequestBody Laptop l , @PathVariable int id) {
		return lapSer.update(l,id);
	}
	
	@DeleteMapping(value="deleteById/{id}")
	public String delete(@PathVariable int id) {
		return lapSer.delete(id);
	}
	

}
