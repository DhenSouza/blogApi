package com.blogapi.blogapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogapi.blogapi.models.Tema;

public interface TemaRepository extends JpaRepository<Tema, Long> {
	public List<Tema> findAllByNomeContainingIgnoreCase(String nome);
}
