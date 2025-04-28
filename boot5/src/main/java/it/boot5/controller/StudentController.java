package it.boot5.controller;

import it.boot5.model.Student;
import it.boot5.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import jakarta.servlet.http.HttpSession;
import java.util.HashSet;
import java.util.Set;

@Controller
public class StudentController {

    @Autowired
    private Student stu;

    @GetMapping("/show1")
    public String showStudent(Model model) {
        model.addAttribute("stu", stu);
        model.addAttribute("sex", "女生");

        Set<String> courses = new HashSet<>();
        courses.add("数学");
        courses.add("美术");
        courses.add("体育");
        courses.add("语文");
        courses.add("英语");
        courses.add("计算机");
        model.addAttribute("kcSet", courses);
        return "index";
    }

    @GetMapping("/show3")
    public String processStudent(Student stu) {
        System.out.println(stu);
        return "forward:/show1";
    }

    @GetMapping("/show4/{name}/{age}")
    public String showWithPathVariables(@PathVariable String name, @PathVariable Integer age) {
        System.out.println(name + ":" + age);
        return "forward:/show1";
    }

    @RequestMapping("/login")
    public String login(String userid, String password, HttpSession session) {
        System.out.println(userid + ":" + password);
        if ("zhangsan".equals(userid) && "123".equals(password)) {
            session.setAttribute("username", userid);
            return "redirect:/show5";
        }
        return "login";
    }

    @ResponseBody
    @PostMapping("/users")
    public String addUser(@RequestBody User user) {
        System.out.println(user);
        return "{\"flag\":\"添加成功\"}";
    }

    @ResponseBody
    @PutMapping("/users")
    public String updateUser(User user) {
        System.out.println("接收到修改请求：" + user);
        return "{\"flag\":\"修改成功\"}";
    }
}