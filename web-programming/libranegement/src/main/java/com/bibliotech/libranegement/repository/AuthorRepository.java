package com.bibliotech.libranegement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bibliotech.libranegement.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long>{
}
