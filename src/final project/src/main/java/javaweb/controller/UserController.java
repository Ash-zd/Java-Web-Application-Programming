package javaweb.controller;

import javaweb.entity.User;
import javaweb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Ash
 * @date 2018/12/27 12:53
 */
@RestController
@RequestMapping(path = "/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public void login(@RequestParam("username") String username, @RequestParam("password") String password, HttpServletResponse response) {
        User user = userRepository.findUserByUsername(username);
        if (user.getPassword().equals(password)) {
            try {
                response.sendRedirect("http://localhost:8080/page/admin1/main.html");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                response.sendRedirect("http://localhost:8080/page/admin1/index.html");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public Object getAll() {
        return userRepository.findAll();
    }

    @RequestMapping(path = "/update", method = RequestMethod.POST)
    public void update(@RequestParam("username") String username, @RequestParam("password") String password, HttpServletResponse response) {
        User user = userRepository.findUserByUsername(username);
        if (user != null) {
            user.setPassword(password);
            userRepository.save(user);
            try {
                response.sendRedirect("http://localhost:8080/page/admin1/main.html");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            try {
                response.sendRedirect("http://localhost:8080/page/admin1/main.html");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @RequestMapping(path = "/delete", method = RequestMethod.POST)
    public void delete(@RequestParam("username") String username, HttpServletResponse response) {
        User user = userRepository.findUserByUsername(username);
        if (user != null) {
            userRepository.delete(user);
            try {
                response.sendRedirect("http://localhost:8080/page/admin1/main.html");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            try {
                response.sendRedirect("http://localhost:8080/page/admin1/main.html");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
