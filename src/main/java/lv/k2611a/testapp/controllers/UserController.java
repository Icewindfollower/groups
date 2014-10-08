package lv.k2611a.testapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import lv.k2611a.testapp.domain.User;
import lv.k2611a.testapp.services.UserService;

/**
 * @author <a href="mailto:kirill.afanasjev@odnoklassniki.ru">Kirill Afanasjev</a>
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user/{userId}")
    public String getMainPage(Model model, @PathVariable Long userId) {
        User user = userService.getUserById(userId);
        if (user == null ) {
            return "404";
        }
        model.addAttribute("username", user.getName());
        return "hello";
    }
}
