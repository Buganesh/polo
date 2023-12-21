package com.oasys.laptop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oasys.laptop.dao.LaptopDao;
import com.oasys.laptop.entity.Laptop;

@Service
public class LaptopService {
	
	@Autowired
	
	LaptopDao lapDao;

	public Laptop addValue(Laptop l) {
		// TODO Auto-generated method stub
		return lapDao.addValue(l) ;
	}

	public Laptop getbyId(int id) {
		// TODO Auto-generated method stub
		return lapDao.getbyId(id);
	}

	public List<Laptop> find() {
		// TODO Auto-generated method stub
		return lapDao.find();
	}

	public Laptop update(Laptop l,int id) {
		// TODO Auto-generated method stub
		return lapDao.update(l,id);
	}

	public String delete(int id) {
		// TODO Auto-generated method stub
		return lapDao.delete(id);
	}

}
