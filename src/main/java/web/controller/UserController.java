package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.entity.User;
import web.service.UserService;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/")
    private String showAllUsers(Model model) {
        List<User> userList = userService.getAllUsers();
        model.addAttribute("allUser", userList);
        return "users";
    }

    @GetMapping("/addNewUser")
    public String newUser(Model model) {
        model.addAttribute("newUser", new User());
        return "user-info";
    }

    @PostMapping("saveUser")
    public String saveUser(@ModelAttribute("newUser") User user) {
        userService.saveUsers(user);
        return "redirect:/";
    }
    @GetMapping("/edit")
    public String edit(@RequestParam("id") int id, Model model) {
        User user = userService.getUser(id);
        model.addAttribute("user", user);
        return "edit";
    }
    @PatchMapping("edit")
    public String updateUser(@ModelAttribute("user") User user) {
        userService.updateUser(user);
        return "redirect:/";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") int id) {
        userService.deleteUser(id);
        return "redirect:/";
    }

}
