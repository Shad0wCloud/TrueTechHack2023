package userpresetsservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import userpresetsservice.config.ModelMapperConfig;
import userpresetsservice.dto.UserPresetRequest;
import userpresetsservice.model.UserPreset;
import userpresetsservice.service.UserPresetService;

@RestController
@RequestMapping("/api/userPreset")
@RequiredArgsConstructor
public class UserPresetController {

    private final UserPresetService userPresetService;
    private final ModelMapperConfig modelMapperConfig;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createPreset(@RequestBody UserPresetRequest userPresetRequest) {
        userPresetService.savePreset(userPresetRequest);
    }

    @GetMapping("/{name}")
    @ResponseStatus(HttpStatus.OK)
    public UserPresetRequest getByName(@PathVariable("name") String name) {
        return mapToDto(userPresetService.setupPreset(name));
    }

    private UserPresetRequest mapToDto(UserPreset userPreset) {
        return modelMapperConfig.modelMapper().map(userPreset, UserPresetRequest.class);
    }
}
