package fr.cda.tpcitoyen.Controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.cda.tpcitoyen.DTO.Users.UserDto;
import fr.cda.tpcitoyen.Entities.User;
import fr.cda.tpcitoyen.Services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;
    private final ObjectMapper objectMapper;

    @GetMapping()
    public List<UserDto> getUsers() {
        return userService.getUsers().stream().map(
             user -> objectMapper.convertValue(user, UserDto.class)
        ).toList();
    }

    @GetMapping("/{id}")
    public UserDto getUser(@PathVariable Integer id) {
        return objectMapper.convertValue(userService.getUser(id), UserDto.class);
    }

    @PostMapping()
    @ResponseStatus(HttpStatus.CREATED)
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@RequestBody User user, @PathVariable Integer id) {
        return userService.updateUser(user, id);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Integer id) {
        userService.deleteUser(id);
    }
}
