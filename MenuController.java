package com.example.qrmenu.controllers;

import com.example.qrmenu.entities.MenuItem;
import com.example.qrmenu.repositories.MenuItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/menu")
public class MenuController {

    @Autowired
    private MenuItemRepository menuItemRepository;

    @PostMapping("/add")
    public String addMenuItem(@RequestBody MenuItem menuItem) {
        menuItemRepository.save(menuItem);
        return "Menu item added successfully!";
    }

    @GetMapping
    public List<MenuItem> getMenu() {
        return menuItemRepository.findAll();
    }
}
