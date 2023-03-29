package userpresetsservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import userpresetsservice.model.UserPreset;
import userpresetsservice.repository.UserPresetRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserPresetService { // Сервис с логикой обработки поступающих запросов и ответов для UserPreset

    private final UserPresetRepository userPresetRepository;

    public List<UserPreset> findAllPresets(String userLogin) {
        return userPresetRepository.findAllByUserLogin(userLogin);
    }  // Метод, отдающих список всех пресетов пользователя

    public void savePreset(UserPreset userPreset) {
        userPresetRepository.save(userPreset);
    } // Метод, сохраняющий пользовательский пресет

    public void deletePreset(String presetName, String userLogin) {
        userPresetRepository.deleteUserPresetByPresetNameAndUserLogin(presetName,userLogin);
    } // Метод, удаляющий пользовательский пресет
    public UserPreset setupPreset(String presetName, String userLogin) {
        return userPresetRepository.findUserPresetByPresetNameAndUserLogin(presetName, userLogin);
    } // Метод, который отдает данные для установки пресета

}
