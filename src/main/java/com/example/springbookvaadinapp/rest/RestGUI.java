package com.example.springbookvaadinapp.rest;

import com.example.springbookvaadinapp.repo.AuthorRepo;
import com.example.springbookvaadinapp.repo.AuthorsList;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import java.util.List;


@Route("result")
public class RestGUI extends VerticalLayout {

    private AuthorRepo authorRepo;

    public RestGUI(AuthorRepo authorRepo) {
        this.authorRepo = authorRepo;
        List<AuthorsList> authorsList = authorRepo.getResult();
        Grid<AuthorsList> grid = new Grid<>(AuthorsList.class);
        grid.setItems(authorsList);
        add(grid);
    }
}
