package com.blogapi.blogapi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blogapi.blogapi.models.Postagens;

public interface PostagensRepository extends JpaRepository<Postagens, Long> {

	public List<Postagens> findAllByTituloContainingIgnoreCase(String titulo);
}
