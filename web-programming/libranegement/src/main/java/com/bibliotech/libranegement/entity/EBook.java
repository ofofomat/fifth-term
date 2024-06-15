package com.bibliotech.libranegement.entity;

import java.util.List;

import com.bibliotech.libranegement.entity.enums.Format;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@Entity
public class EBook extends Book {

  @ElementCollection
  @CollectionTable(name = "ebook_formats", joinColumns = @JoinColumn(name = "ebook_id"))
  @Enumerated(EnumType.STRING)
  @Column(name = "format", nullable = false)
  private List<Format> formats;
}
