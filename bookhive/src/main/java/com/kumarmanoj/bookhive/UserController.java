package com.kumarmanoj.bookhive;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class UserController {
    // Only accessible to logged-in user via OAuth2 authentication
    @RequestMapping(path = "/user", method = RequestMethod.GET)
    public String user(@AuthenticationPrincipal OAuth2User principal) { 
        System.out.println(principal);
        return principal.getAttribute("name");
    }
}
