package com.example.demo.controller;

import com.example.demo.model.Student;
import com.example.demo.model.StudentDTO;
import com.example.demo.service.ICodeGymClassService;
import com.example.demo.service.IStudentService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/")
public class StudentController {
    @Autowired
    private IStudentService iStudentService;

    @Autowired
    private ICodeGymClassService iCodeGymClassService;


    @GetMapping("/")
    public String showList(Model model, @RequestParam(defaultValue = "",required = false) String valueSearch,@RequestParam(required = false, defaultValue = "0") int page) { // handle method
//        List<Student> list = iStudentService.showList();
//        Tương tự request.setAttribute()
        // Page là trang hiện tại
        // Pagesize là số lượng record mỗi trang
        // sort là trường cần sắp xếp.
        Sort sort = Sort.by("name").descending();
        Pageable pageable = PageRequest.of(page, 5,sort);
        Page<Student> list = iStudentService.findCustomerByNameContaining(valueSearch,pageable);
        model.addAttribute("list", list);
        return "result";
    }

    @GetMapping("create")
    public String showCreateForm(Model model) {
        model.addAttribute("listCodeGymClass", iCodeGymClassService.findAll());
        model.addAttribute("student", new Student());
        return "create";
    }

    @PostMapping( "create")
    public String add(@Valid @ModelAttribute("student") StudentDTO studentDTO,
                      BindingResult bindingResult,
                      RedirectAttributes redirectAttributes, Model model) {
        new StudentDTO().validate(studentDTO, bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute("listCodeGymClass", iCodeGymClassService.findAll());
            return "create";
        }
        Student student = new Student();
        BeanUtils.copyProperties(studentDTO, student);
        iStudentService.add(student);
        redirectAttributes.addFlashAttribute("msg", "Thêm Thành Công");
        return "redirect:/";
    }
//    @GetMapping("/delete/{id}")
//    public String delete(@PathVariable Long id, RedirectAttributes redirectAttributes) {
//        iStudentService.delete(id);
//        redirectAttributes.addFlashAttribute("msg", "Deleted");
//        return "redirect:/";
//    }
    @PostMapping("delete")
    public String delete(@RequestParam("deleteId") Long id,RedirectAttributes redirectAttributes) {
        iStudentService.delete(id);
        redirectAttributes.addFlashAttribute("msg", "Xóa thành công");
        return "redirect:/";
    }
    @GetMapping("/edit/{id}")
    public String showFormEdit(@PathVariable Long id, Model model) {
//        ModelAndView modelAndView = new ModelAndView("update", "student", iStudentService.findById(id));
        model.addAttribute("listCodeGymClass", iCodeGymClassService.findAll());
        model.addAttribute("student", iStudentService.findById(id));
        return "update";
    }
    @PostMapping("/edit/{id}")
    public String update(@Valid @ModelAttribute("student") StudentDTO studentDTO,
                         BindingResult bindingResult,
                         RedirectAttributes redirectAttributes, Model model,@PathVariable Long id) {
        new StudentDTO().validate(studentDTO, bindingResult);
        if (bindingResult.hasErrors()) {
            model.addAttribute("listCodeGymClass", iCodeGymClassService.findAll());
            model.addAttribute("student", studentDTO);
            return "update";
        }
        Student student = new Student();
        BeanUtils.copyProperties(studentDTO, student);
        iStudentService.update(student);
        redirectAttributes.addFlashAttribute("msg", "updated successfully");
        return "redirect:/";
    }
}
