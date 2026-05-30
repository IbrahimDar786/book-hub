package com.springproject.book_hub.controller;


import com.springproject.book_hub.entity.Student;
import com.springproject.book_hub.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    // Display all students
    @GetMapping
    public String getAllStudents(Model model) {

        model.addAttribute("students",
                studentService.getAllStudents());

        return "students";
    }

    // Show add form
    @GetMapping("/add")
    public String showAddForm(Model model) {

        model.addAttribute("student",
                new Student());

        return "student-form";
    }

    // Save student
    @PostMapping("/save")
    public String saveStudent(
            @Valid @ModelAttribute Student student,
            BindingResult result) {

        if (result.hasErrors()) {
            return "student-form";
        }

        studentService.addStudent(student);
        return "redirect:/students";
    }

    // Show edit form
    @GetMapping("/edit/{id}")
    public String showEditForm(
            @PathVariable Long id,
            Model model) {

        model.addAttribute("student",
                studentService.getStudentById(id));

        return "student-form";
    }

    // Delete student
    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {

        studentService.deleteStudent(id);
        return "redirect:/students";
    }
}
