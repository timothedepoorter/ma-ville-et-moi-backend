package fr.cda.tpcitoyen.Controllers;

import fr.cda.tpcitoyen.Services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
}