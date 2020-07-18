package com.example.springbookvaadinapp.controller;

import com.example.springbookvaadinapp.entity.Author;
import com.example.springbookvaadinapp.entity.Book;
import com.example.springbookvaadinapp.entity.Category;
import com.example.springbookvaadinapp.repo.AuthorRepo;
import com.example.springbookvaadinapp.repo.AuthorsList;
import com.example.springbookvaadinapp.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class BookController {

    private BookRepo bookRepo;
    private AuthorRepo authorRepo;

    @Autowired
    public BookController(BookRepo bookRepo, AuthorRepo authorRepo) {
        this.bookRepo = bookRepo;
        this.authorRepo = authorRepo;
    }
    

    @EventListener(ApplicationReadyEvent.class)
    public void fillDB(){

        Book book1 = new Book();
        book1.setTitle("W głębi lasu");
        book1.setIsbn("960-425-059-0");
        book1.setCategory(Category.ACTION);

        Book book2 = new Book();
        book2.setTitle("Lot 202");
        book2.setIsbn("99921-58-10-7");
        book2.setCategory(Category.ACTION);

        Book book3 = new Book();
        book3.setTitle("Cham niezbuntowany");
        book3.setIsbn("0-8044-2957-X");
        book3.setCategory(Category.ADVENTURE);

        Author author1 = new Author();
        author1.setName("Rafał ");
        author1.setSurname("Mróz");
        author1.setBooks(Stream.of(book1,book2).collect(Collectors.toSet()));

        Author author2 = new Author();
        author2.setName("Remigiusz");
        author2.setSurname("Ziemkiewicz");
        author2.setBooks(Stream.of(book3).collect(Collectors.toSet()));

        bookRepo.save(book1);
        bookRepo.save(book2);
        bookRepo.save(book3);

        authorRepo.save(author1);
        authorRepo.save(author2);

    }

}
