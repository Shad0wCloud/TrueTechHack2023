package userpresetsservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import userpresetsservice.dto.UserPresetRequest;
import userpresetsservice.model.UserPreset;
import userpresetsservice.repository.UserPresetRepository;

@Service
@RequiredArgsConstructor
public class UserPresetService {

    private final UserPresetRepository userPresetRepository;

    public void savePreset(UserPresetRequest userPresetRequest) {
        UserPreset userPreset = UserPreset.builder()
                .presetName(userPresetRequest.getPresetName())
                .brightness(userPresetRequest.getBrightness())
                .contrastRatio(userPresetRequest.getContrastRatio())
                .saturation(userPresetRequest.getSaturation())
                .sharpness(userPresetRequest.getSharpness())
                .epilepsyMode(userPresetRequest.getEpilepsyMode())
                .build();

        userPresetRepository.save(userPreset);
        // id пресета передается пользователю по WebFlux
    }

    public UserPreset setupPreset(String name) {
        return userPresetRepository.findUserPresetByPresetName(name);
    }



}
