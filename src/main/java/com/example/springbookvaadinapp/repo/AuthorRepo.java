package com.example.springbookvaadinapp.repo;


import com.example.springbookvaadinapp.entity.Author;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface AuthorRepo extends CrudRepository<Author,Long> {

    @Query(value = "SELECT AUTHOR.NAME as Author, COUNT(AUTHOR.NAME) as Count ,BOOK.CATEGORY as Category FROM AUTHOR,BOOK WHERE AUTHOR_ID = AUTHOR.ID GROUP BY BOOK.CATEGORY,AUTHOR.NAME",nativeQuery = true)
    List<AuthorsList> getResult();
}
