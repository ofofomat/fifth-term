package com.bibliotech.libranegement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bibliotech.libranegement.entity.Author;
import com.bibliotech.libranegement.repository.AuthorRepository;

@Service
public class AuthorService {
  
  @Autowired
  private AuthorRepository authorRepository;

  public List<Author> getAllAuthors() {
    return authorRepository.findAll();
  }

  public Optional<Author> getAuthorById(Long id) {
    return authorRepository.findById(id);
  }

  public Author saveAuthor(Author author) {
    return authorRepository.save(author);
  }

  public void deleteAuthorById(Long id) {
    authorRepository.deleteById(id);
  }

  public void deleteAllAuthors() {
    authorRepository.deleteAll();
  }

  public Author updateAuthorById(Long id, Author author) {
    author.setId(id);
    return authorRepository.save(author);
  }

  public Author updateAuthorNameById(Long id, String name) {
    Author author = authorRepository.findById(id).get();
    author.setName(name);
    return authorRepository.save(author);
  }

  
}
