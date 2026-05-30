package com.springproject.book_hub.controller;


import com.springproject.book_hub.entity.Book;
import com.springproject.book_hub.service.BookService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    // Display all books
    @GetMapping
    public String getAllBooks(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "books";
    }

    // Show add form
    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("book", new Book());
        return "book-form";
    }

    // Save book
    @PostMapping("/save")
    public String saveBook(@Valid @ModelAttribute Book book,
                           BindingResult result) {

        if (result.hasErrors()) {
            return "book-form";
        }

        bookService.addBook(book);
        return "redirect:/books";
    }

    // Show edit form
    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id,
                               Model model) {

        model.addAttribute("book",
                bookService.getBookById(id));

        return "book-form";
    }

    // Delete book
    @GetMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id) {

        bookService.deleteBook(id);
        return "redirect:/books";
    }
    
    
    @GetMapping("/search/title")
    public String searchByTitle(
            @RequestParam String keyword,
            Model model) {

        model.addAttribute(
                "books",
                bookService.searchByTitle(keyword)
        );

        return "books";
    }
    
    
    @GetMapping("/search/author")
    public String searchByAuthor(
            @RequestParam String keyword,
            Model model) {

        model.addAttribute(
                "books",
                bookService.searchByAuthor(keyword)
        );

        return "books";
    }
}
