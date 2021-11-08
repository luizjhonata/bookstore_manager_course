package com.jhonataluiz.bookstoremanager.controler;

import com.jhonataluiz.bookstoremanager.dto.MessageResponseDTO;
import com.jhonataluiz.bookstoremanager.entity.Book;
import com.jhonataluiz.bookstoremanager.repository.BookRepository;
import com.jhonataluiz.bookstoremanager.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/books")
public class BookControler {

    private BookService bookService;

    @Autowired
    public BookControler(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public MessageResponseDTO crete (@RequestBody Book book){
        return bookService.crete(book);

    }
}
