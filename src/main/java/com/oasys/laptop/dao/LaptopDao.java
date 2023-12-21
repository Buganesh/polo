package com.oasys.laptop.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.oasys.laptop.entity.Laptop;
import com.oasys.laptop.repository.LaptopRepository;

@Repository
public class LaptopDao {
	
	@Autowired
	LaptopRepository lapRepo;

	public Laptop addValue(Laptop l) {
		// TODO Auto-generated method stub
		return lapRepo.save(l);
	}

	public Laptop getbyId(int id) {
		// TODO Auto-generated method stub
		return lapRepo.findById(id).get();
	}

	public List<Laptop> find() {
		// TODO Auto-generated method stub
		return lapRepo.findAll();
	}

	public Laptop update(Laptop l, int id) {
		// TODO Auto-generated method stub
		Laptop ls=lapRepo.findById(id).get();
		ls.setBrand(l.getBrand());
		ls.setModel(l.getModel());
		ls.setPrice(l.getPrice());
		ls.setUsagetype(l.getUsagetype());
		return lapRepo.save(ls);
	}

	public String delete(int id) {
		// TODO Auto-generated method stub
		 lapRepo.deleteById(id);
		 return "Delete Sucess";
	}

}
