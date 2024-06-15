package com.bibliotech.libranegement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bibliotech.libranegement.entity.EBook;

public interface EBookRepository extends JpaRepository<EBook, Long>{
}
