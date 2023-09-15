package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Book;
import com.example.demo.Repository.BookRepo;

@RestController
@CrossOrigin
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookRepo bookrepo;

    @PostMapping("/add")
    public String addBook(@RequestBody Book book){
        bookrepo.save(book);
        return "book saved";
    }

    @GetMapping("/getall")
    public List<Book> booklist(){
        return bookrepo.findAll();
    }

}
