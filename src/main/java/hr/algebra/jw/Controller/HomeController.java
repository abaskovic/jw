package hr.algebra.jw.Controller;

import hr.algebra.jw.Models.User;
import hr.algebra.jw.Models.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class HomeController {

    private  final UserService service;
    @GetMapping("/")
    public String greeting() {
        return "home";
    }
    @GetMapping("/users")
    public String users(Model model) {
        List<User> users = service.getAllUsers();
        model.addAttribute("users", users);
        return "users";
    }
    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }


    @GetMapping("/logout")
    public String logout() {
        return "redirect:/login";
    }
}