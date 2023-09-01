package com.siggy.repository;

import java.util.List;

import org.springframework.data.repository.Repository;

import com.siggy.entity.JBoard;

public interface BoardRepository extends Repository<JBoard, Long> {

	void save(JBoard jBoard);

	List<JBoard> findAll();

	JBoard findByBno(int bno);

}
