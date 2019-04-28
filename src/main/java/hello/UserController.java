package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class UserController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    private UserRepo repo;

    @Autowired
    public UserController(UserRepo repo) {
        this.repo = repo;
    }

    @RequestMapping("/addUser")
    public String addUser(User user) {

        repo.save(user);
        return "home";
    }

    @RequestMapping("/")
    public String home() {
        return "home";
    }
}