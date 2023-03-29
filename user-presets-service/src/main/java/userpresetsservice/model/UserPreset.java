package userpresetsservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(value = "presets")
public class UserPreset { // Сущность пресета пользователя

    @Id
    private String presetId; // id пресета
    private String presetName; // Имя пресета
    private int brightness; // Яркость
    private int contrastRatio; // Контрастность
    private int saturation; //Насыщенность
    private int sharpness; // Резкость
    private int epilepsyMode; // "Режим эпилепсии"
    private String userLogin; // Логин пользователя
}
