package userpresetsservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import userpresetsservice.service.UserPresetService;
import userpresetsservice.service.UserService;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final UserPresetService userPresetService;

    @PostMapping("/{presetName}")
    @ResponseStatus(HttpStatus.CREATED)
    public void setupPreset(@PathVariable("presetName") String presetName) {
        userService.savePreset(userPresetService.setupPreset(presetName).getPresetId(), 1);
    }
}
