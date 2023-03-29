package userpresetsservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class UserPresetSetupData { // Сущность, которая отдает конкретные числовые параметры пресета
    private int brightness; // Яркость
    private int contrastRatio; // Контрастность
    private int saturation; //Насыщенность
    private int sharpness; // Резкость
    private int epilepsyMode; // "Режим эпилепсии"
}
