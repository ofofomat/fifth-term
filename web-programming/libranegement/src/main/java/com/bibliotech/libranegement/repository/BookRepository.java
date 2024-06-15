package com.bibliotech.libranegement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bibliotech.libranegement.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{
}
