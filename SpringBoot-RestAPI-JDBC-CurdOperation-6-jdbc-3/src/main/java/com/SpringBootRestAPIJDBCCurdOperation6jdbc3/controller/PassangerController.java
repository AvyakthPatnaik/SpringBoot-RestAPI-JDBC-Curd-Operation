package com.SpringBootRestAPIJDBCCurdOperation6jdbc3.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootRestAPIJDBCCurdOperation6jdbc3.dao.PassangerDao;
import com.SpringBootRestAPIJDBCCurdOperation6jdbc3.entity.Passanger;


@RestController
public class PassangerController {

	@Autowired 
	private PassangerDao eDAO;
	
	@GetMapping("/passanger")
	public List<Passanger> findAll() {
		return eDAO.findAll();
	}
	
	@GetMapping("/passanger/{id}")
	public Passanger findById(@PathVariable int id) {
		return eDAO.findById(id);
	}
	
	@DeleteMapping("/passanger/{id}")
	public String deleteById(@PathVariable int id) {
		return eDAO.deleteById(id)+" passanger(s) delete from the database";
	}
	
	@PostMapping("/passanger")
	public String save(@RequestBody Passanger e) {
		return eDAO.save(e)+" passanger(s) saved successfully";
	}
	
	@PutMapping("/passanger/{id}")
	public String update(@RequestBody Passanger e, @PathVariable int id) {
		return eDAO.update(e, id)+" passanger(s) updated successfully"+eDAO.findById(id);
	}
}
