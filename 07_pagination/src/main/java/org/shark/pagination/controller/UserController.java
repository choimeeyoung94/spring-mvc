package org.shark.pagination.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.shark.pagination.model.dto.PageDTO;
import org.shark.pagination.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.RequiredArgsConstructor;

@RequestMapping("/user")
@RequiredArgsConstructor
@Controller
public class UserController {
<<<<<<< HEAD
 private final UserService userService;
=======
  private final UserService userService;
>>>>>>> 62be30bf0bc79d0f820073899e6d97316f2a6482
  
  @GetMapping("/list")
  public String list(PageDTO dto, 
                      HttpServletRequest request, 
                      Model model ) {
    Map<String, Object> map = userService.getUsers(dto, request);
    model.addAttribute("users", map.get("users"));
    model.addAttribute("pagingHTML", map.get("pagingHTML"));
    return "user/list";
  }
}
