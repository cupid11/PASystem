package pas.controller;

import pas.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/user", produces = "application/json;charset=UTF-8")
public class UserController {

    private UserService userService;

    public UserController(@Autowired UserService userService) {
        this.userService = userService;
    }

//    @GetMapping(value = "/")
//    public String index() {
//        System.out.println("123");
//        return "user-index";
//    }

    @GetMapping(value = "/allUsers")
    @ResponseBody
    public Object allUsers() {
        return userService.all();
    }

    @RequestMapping(value = "/queryByPage", method = RequestMethod.GET)
    @ResponseBody
    public Object queryByPage(@RequestParam int page, @RequestParam int pageSize) {
        return userService.queryByPage(page, pageSize);
    }


    @GetMapping(value = "/show/{id}")
    @ResponseBody
    public Object show(@PathVariable("id") Integer id) {
        return userService.findById(id);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseBody
    public void delete(@PathVariable("id") Integer id) {
        userService.deleteById(id);
    }

//    @PostMapping(value = "/store")
//    @ResponseBody
//    public int store(@RequestBody User user) {
//        return userService.store(user);
//    }
}
