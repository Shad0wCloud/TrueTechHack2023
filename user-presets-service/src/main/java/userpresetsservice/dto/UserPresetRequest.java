package userpresetsservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserPresetRequest { // DTO-сущность пресета на запросы

    private String presetName;
    private int brightness; // Яркость
    private int contrastRatio; // Контрастность
    private int saturation; //Насыщенность
    private int sharpness; // Резкость
    private int epilepsyMode; // "Режим эпилепсии"
    private String userLogin; // Логин пользователя

}
