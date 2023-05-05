package com.SpringBootRestAPIJDBCCurdOperation6jdbc3.dao;

import java.util.List;

import com.SpringBootRestAPIJDBCCurdOperation6jdbc3.entity.Passanger;


public interface PassangerDao {

	public List<Passanger> findAll();
	
	public Passanger findById(int id);
	
	public int deleteById(int id);
	
	public int save(Passanger e);
	
	public int update(Passanger e, int id);
}
