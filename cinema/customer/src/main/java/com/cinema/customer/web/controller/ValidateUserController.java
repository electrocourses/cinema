package com.cinema.customer.web.controller;

//import com.anc.cinema.com.cinema.fraud.services.JWTService;
//import com.auth0.jwt.JWT;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.com.cinema.fraud.web.bind.annotation.RequestMapping;
//import org.springframework.com.cinema.fraud.web.bind.annotation.RestController;
//
//import javax.servlet.http.Cookie;
//import javax.servlet.http.HttpServletResponse;
//import java.util.HashMap;
//import java.util.Map;

//@RestController
//@RequestMapping("/api/basicAuth/")
public class ValidateUserController {

//    @Autowired
//    private JWTService jwtService;

//    @RequestMapping("validate")
//    public Map<String, String> userIsValid(HttpServletResponse response) {
//
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        User currentUser = (User) auth.getPrincipal();
//        String name = currentUser.getUsername();
//        String role = currentUser.getAuthorities().toArray()[0].toString().substring(5);
//        String token = jwtService.generateToken(name, role);
//
//        Map<String, String> results = new HashMap<>();
//        results.put("result", "ok");
//
//        Cookie cookie = new Cookie("token", token);
//        cookie.setPath("/api");
//        cookie.setHttpOnly(true);
//       //TODO when in production must do - cookie.setSecure(true);
//        cookie.setMaxAge(1800);
//        response.addCookie(cookie);
//
//        return results;
//    }

}
