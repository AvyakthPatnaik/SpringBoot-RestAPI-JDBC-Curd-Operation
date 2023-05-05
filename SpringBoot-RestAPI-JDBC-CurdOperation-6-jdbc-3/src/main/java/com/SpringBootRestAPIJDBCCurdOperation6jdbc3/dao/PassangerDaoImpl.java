package com.SpringBootRestAPIJDBCCurdOperation6jdbc3.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.SpringBootRestAPIJDBCCurdOperation6jdbc3.entity.Passanger;

@Repository
public class PassangerDaoImpl implements PassangerDao {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Passanger> findAll() {
		return jdbcTemplate.query("SELECT * FROM passanger", new BeanPropertyRowMapper<Passanger>(Passanger.class));
	}

	@Override
	public Passanger findById(int id) {
		return jdbcTemplate.queryForObject("SELECT * FROM passanger WHERE id=?", new BeanPropertyRowMapper<Passanger>(Passanger.class), id);
	}

	@Override
	public int deleteById(int id) {
		return jdbcTemplate.update("DELETE FROM passanger WHERE id=?", id);
	}

	@Override
	public int save(Passanger e) {
		return jdbcTemplate.update("INSERT INTO passanger (name, arrival, destination) VALUES (?, ?, ?)", new Object[] {e.getName(), e.getArrival(),e.getDestination()});
	}

	@Override
	public int update(Passanger e, int id) {
		return jdbcTemplate.update("UPDATE passanger SET name = ?, arrival = ?, destination = ? WHERE id = ?", new Object[] {e.getName(), e.getArrival(), e.getDestination(), id});
	}
}
