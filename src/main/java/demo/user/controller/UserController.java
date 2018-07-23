package demo.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import demo.user.model.User;
import demo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/user", produces = "application/json;charset=UTF-8")
public class UserController {

    private UserService userService;

    public UserController(@Autowired UserService userService) {
        this.userService = userService;
    }

    @GetMapping(value = "/")
    public String index() {
        return "user-index";
    }

    @GetMapping(value = "/allUsers")
    @ResponseBody
    public Object allUsers() {
        return userService.allUser();
    }

    @RequestMapping(value = "/queryByPage", method = RequestMethod.GET)
    @ResponseBody
    public Object queryByPage(@RequestParam int page, @RequestParam int pageSize) {
        return userService.queryByPage(page, pageSize);
    }

    @GetMapping(value = "/show/{id}")
    @ResponseBody
    public Object show(@PathVariable("id") Long id) {
        return userService.findUserById(id);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseBody
    public void delete(@PathVariable("id") Long id) {
        userService.deleteById(id);
    }

    @PostMapping(value = "/store")
    @ResponseBody
    public int store(@RequestBody User user) {
        return userService.storeUser(user);
    }
}
