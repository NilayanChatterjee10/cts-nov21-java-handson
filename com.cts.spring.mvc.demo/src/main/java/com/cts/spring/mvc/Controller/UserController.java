package com.cts.spring.mvc.Controller;

import java.time.LocalTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.spring.mvc.model.beans.User;
import com.cts.spring.mvc.model.service.UserServiceImpl;

@Controller
@RequestMapping("/")
public class UserController {

	@Autowired
	private UserServiceImpl service;
	
	// this method can handle greet and HTTP GET
	@RequestMapping(value = "/greet", method = RequestMethod.GET)
	public ModelAndView greetings() {
		// you need to call business logic, but current we are ignoring it
		// ModelAndView carries model i.e., data and view name, view can display the data using the key
		// 1st argument is the view name, 2nd argument is the key, 3rd argument is model
		ModelAndView mav = new ModelAndView("display", "time", LocalTime.now());
		// because of view resolver display will become /WEB-INF/pages/display.jsp
		return mav;
	}
	// controller to store, retrieve the user
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView store(@RequestParam("un") String username, @RequestParam("pw") String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		User storedUser = service.storeUser(user);
		ModelAndView mav = new ModelAndView("storeSuccess", "u", storedUser);
		return mav;
	}
	@RequestMapping(value = "/search", method = RequestMethod.POST)
	public ModelAndView search(@RequestParam("uid") int userID) {
		User user = new User();
		user.setUserId(userID);
		
		User storedUser = service.findUser(userID);
		ModelAndView mav = new ModelAndView("search", "u", storedUser);
		return mav;
	}
	@RequestMapping(value = "/searchName", method = RequestMethod.POST)
	public ModelAndView search(@RequestParam("uname") String username) {
		User user = new User();
		user.setUsername(username);
		
		List<User> storedUser = service.findUsersByName(username);
		ModelAndView mav = new ModelAndView("searchName", "u", storedUser);
		return mav;
	}
	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public ModelAndView viewAll() {
		
		
		List<User> storedUser = service.findAllUsers();
		ModelAndView mav = new ModelAndView("list", "u", storedUser);
		return mav;
	}
}