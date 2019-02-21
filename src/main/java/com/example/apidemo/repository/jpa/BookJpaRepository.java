package com.example.apidemo.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.apidemo.entity.Book;

@Repository
public interface BookJpaRepository extends JpaRepository<Book, String> {
    Book findBookById(final String id);
}