package com.jhonataluiz.bookstoremanager.repository;

import com.jhonataluiz.bookstoremanager.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
