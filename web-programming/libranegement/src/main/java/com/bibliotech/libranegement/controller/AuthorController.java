package com.bibliotech.libranegement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bibliotech.libranegement.entity.Author;
import com.bibliotech.libranegement.service.AuthorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("/authors")
public class AuthorController {
  
  @Autowired
  private AuthorService authorService;

  @GetMapping
  public List<Author> getAllAuthors() {
    return authorService.getAllAuthors();
  }
  
  @GetMapping("/{id}")
  public ResponseEntity<Author> getAuthorById(@PathVariable Long id) {
    Optional<Author> author = authorService.getAuthorById(id);
    if (author.isPresent()) {
      return ResponseEntity.ok(author.get());
    } else {
      return ResponseEntity.notFound().build();
    }
  }

  @PostMapping
  public Author createAuthor(@RequestBody Author author) {
    return authorService.saveAuthor(author);
  }

  @PutMapping("/{id}")
  public ResponseEntity<Author> updateAuthorById(@PathVariable Long id, @RequestBody Author author) {
    Optional<Author> authorOptional = authorService.getAuthorById(id);
    if (authorOptional.isPresent()) {
      author.setId(id);
      return ResponseEntity.ok(authorService.saveAuthor(author));
    } else {
      return ResponseEntity.notFound().build();
    }
  }
}
