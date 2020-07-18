package com.example.springbookvaadinapp.repo;

import com.example.springbookvaadinapp.entity.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepo extends CrudRepository<Book,Long> {
}
