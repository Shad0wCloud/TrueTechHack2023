package userpresetsservice.controller;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import userpresetsservice.dto.UserPresetRequest;
import userpresetsservice.dto.UserPresetResponse;
import userpresetsservice.dto.UserPresetSetupData;
import userpresetsservice.model.UserPreset;
import userpresetsservice.service.UserPresetService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/userPreset")
public class UserPresetController { // Контроллер для работы с сервисом-пресетов

    private final UserPresetService userPresetService; // Сервис обработки логики пресета
    private final ModelMapper modelMapper; // Класс для маппинга сущности пресета с DTO-сущностями

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createPreset(@RequestBody UserPresetRequest userPresetRequest) {
        userPresetService.savePreset(requestConvertToUserPreset(userPresetRequest));
    } // Метод для сохранения пользовательского пресета

    @GetMapping("/presets")
    @ResponseStatus(HttpStatus.OK)
    public List<UserPresetResponse> findAllPresets(@RequestParam("userLogin") String userLogin) {
        return userPresetService.findAllPresets(userLogin)
                .stream().map(this::userPresetConvertToResponse).toList();
    } // Метод для поиска всех пресетов пользователя

    @DeleteMapping("/delete")
    @ResponseStatus(HttpStatus.OK)
    public void deletePreset(@RequestParam("presetName") String presetName,
                             @RequestParam("userLogin") String userLogin) {

        userPresetService.deletePreset(presetName, userLogin);
    } // Метод для удаления пресета пользователя

    @GetMapping("/setup")
    @ResponseStatus(HttpStatus.OK)
    public UserPresetSetupData setupPreset(@RequestParam("presetName") String presetName,
                                           @RequestParam("userLogin") String userLogin) {

        return userPresetConvertToSetupData(
                userPresetService.setupPreset(presetName, userLogin)
        );
    } // Метод, который отдает данные в виде JSON для установки параметров пресета

    private UserPreset requestConvertToUserPreset(UserPresetRequest userPresetRequest) {
        return modelMapper.map(userPresetRequest, UserPreset.class);
    } // Метод для маппинга DTO-сущности запроса c сущностью UserPreset

    private UserPresetResponse userPresetConvertToResponse(UserPreset userPreset) {
        return modelMapper.map(userPreset, UserPresetResponse.class);
    } // Метод для маппинга сущности DTO-сущности ответа с сущностью UserPreset

    private UserPresetSetupData userPresetConvertToSetupData(UserPreset userPreset) {
        return modelMapper.map(userPreset, UserPresetSetupData.class);
    } // Метод для маппинга DTO-сущности с параметрами пресета с сущностью UserPreset
}
