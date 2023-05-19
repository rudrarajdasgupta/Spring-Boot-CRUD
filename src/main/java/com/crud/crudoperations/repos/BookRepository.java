package com.crud.crudoperations.repos;

import com.crud.crudoperations.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
