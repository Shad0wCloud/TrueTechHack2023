package userpresetsservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(value = "userPreset")
public class UserPreset { // Добавить настройку цветовой палитры

    @Id
    private String presetId; // id пресета
    private String presetName;
    private int brightness; // Яркость
    private int contrastRatio; // Контрастность
    private int saturation; //Насыщенность
    private int sharpness; // Резкость
    private int epilepsyMode;
}
