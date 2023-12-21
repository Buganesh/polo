package com.oasys.laptop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oasys.laptop.entity.Laptop;

public interface LaptopRepository extends JpaRepository<Laptop, Integer> {

}
