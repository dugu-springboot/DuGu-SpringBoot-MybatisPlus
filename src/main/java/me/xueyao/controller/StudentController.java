package me.xueyao.controller;

import me.xueyao.base.R;
import me.xueyao.domain.Student;
import me.xueyao.service.StudentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author Simon.Xue
 * @date 2021-09-04 00:36:21
 **/
@RequestMapping("/student")
@RestController
public class StudentController {

    @Resource
    private StudentService studentService;

    @PostMapping("/insert")
    public R insert(@RequestBody Student student) {
        return studentService.insert(student);
    }

    @GetMapping("/getById/{id}")
    public R<Student> getById(@PathVariable("id") String id) {
        return studentService.getById(id);
    }

    @PutMapping("/update")
    public R update(@RequestBody Student student) {
        return studentService.update(student);
    }

    @DeleteMapping("/delete/{id}")
    public R delete(@PathVariable("id") String id) {
        return studentService.delete(id);
    }
}
