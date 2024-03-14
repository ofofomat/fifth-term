package br.edu.catolicasc.mateusfernandes.library.model;

import br.edu.catolicasc.mateusfernandes.library.model.Author;
import jakarta.persistence.*;
import java.util.List;

@Entity
public class Book {
    @Id @GeneratedValue
    private Long id;
    @Column(name = "title")
    private String title;
    @ManyToMany(mappedBy = "books")
    private List<Author> authors;
    @ManyToOne
    private Publisher publisher;

    public Long getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public List<Author> getAuthors() {
        return authors;
    }
    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }
    public Publisher getPublisher() {
        return publisher;
    }
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }
}
