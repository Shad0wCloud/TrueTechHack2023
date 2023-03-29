# UserPresetService Documentation
###### Russian

* Данный сервис разрабатывался на хакатоне от МТС для площадки KION. 

## Возможности сервиса:
* Сохранение кастомных настроек параметров видеоплеера (пресетов) для конкретного пользователя
* Просмотр списка всех пресетов для конкретного пользователя
* Удаление пресета из списка пресетов пользователя
* Установка выбранного пресета

## Работа с сервисом
###### Примечание: в примерах вместо DNS-адреса будет использоваться http//localhost:8080

#### 1. Сохранение пресета пользователя
Для того, чтобы сохранить пресет пользователя, в Postman нужно передать тело POST-запроса вида:
> {
"presetName": "SomeName",
"brightness": SomeInteger,
"contrastRatio": SomeInteger,
"saturation": SomeInteger,
"sharpness": SomeInteger,
"epilepsyMode": 1 or 0,
"userLogin": "SomeLogin"
}

По адресу:
> http://localhost:8080/api/userPreset

Где:
* presetName - Название пресета пользователя
* brightness - Яркость 
* contrastRatio - Контрастность
* saturation - Насыщенность
* sharpness - Резкость
* epilepsyMode - "Режим эпилепсии"
* userLogin - Имя пользователя (
###### Примечание: логин пользователя нужен, поскольку имена пресетов у разных пользователей могут повторяться, а логин уникален
Режим эпилепсии показывает, нужен ли он пользователю или нет. 
При значении 1, режим считается нужен. При значении 0, режим не включается

Все данные, которые мы передаем в Postman, подразумевают то, что они приходят с Front-end стороны

#### 2. Список пресетов пользователя
Для того, чтобы посмотреть список пресетов пользователя, в Postman нужно перейти по следущему адресу с параметром GET:
>http://localhost:8080/api/userPreset/presets?userLogin=SomeUser

Где SomeUser - имя пользователя

#### 3. Удаление пресета пользователя
Для того, чтобы удалить пресет пользователя, нужно перейти по следущему адресу с параметром DELETE:
>http://localhost:8080/api/userPreset/delete?presetName=SomeName&userLogin=SomeUser

Где SomeName - Имя пресета, а SomeUser - имя пользователя, у которого удаляется пресет

#### 4. Установка выбранного пресета
Для того, чтобы установить пресет, следует перейти по адресу:
>http://localhost:8080/api/userPreset/setup?presetName=SomeName&userLogin=SomeUser

Где SomeName - Имя пресета, а SomeUser - имя пользователя, который хочет установить пресет

Здесь, в формате JSON передаются параметры яркости, контрастности и т.д, которые получает уже Front-end сторона и 
устанавливает выбранный пользователем пресет

###### English

* This service was developed on a hackathon from MTS for the KION platform.

## Service features:
* Saving custom settings of video player parameters (presets) for a specific user
* View a list of all presets for a specific user
* Removing a preset from the user's preset list
* Setting the selected preset

## Working with the service
###### Note: in the examples, http//localhost:8080 will be used instead of the DNS address

#### 1. Saving a user preset
In order to save the user's preset, you need to pass the body of the POST request to Postman in the form:
> {
""preset Name": "SomeName",
""brightness": Some Integer,
""contrast Ratio": Some Integer,
""saturation": Some Integer,
""sharpness": Some Integer,
"epilepsyMode": 1 or 0,
""user Login": "SomeLogin"
}

At:
> http://localhost:8080/api/userPreset

Where:
* presetName is the name of the user's preset
* brightness - Brightness
* contrastRatio - Contrast
* saturation - Saturation
* sharpness - Sharpness
* epilepsyMode - "Epilepsy Mode"
* UserLogin - User name (
###### Note: the user login is needed because the names of presets can be repeated for different users, and the login is unique
The epilepsy mode shows whether the user needs it or not.
If the value is 1, the mode is considered necessary. If the value is 0, the mode is not turned on

All the data that we transmit to Postman implies that they come from the Front-end side

#### 2. List of user presets
In order to view the list of user presets, in Postman you need to go to the following address with the GET parameter:
>http://localhost:8080/api/userPreset/presets?userLogin=SomeUser

Where SomeUser is the user name

#### 3. Deleting a user preset
In order to delete a user preset, you need to go to the following address with the DELETE parameter:
>http://localhost:8080/api/userPreset/delete?presetName=SomeName&userLogin=SomeUser

Where SomeName is the name of the preset, and SomeUser is the name of the user from whom the preset is being deleted

#### 4. Setting the selected preset
In order to set the preset, go to:
>http://localhost:8080/api/userPreset/setup?presetName=SomeName&userLogin=SomeUser

Where SomeName is the name of the preset, and SomeUser is the name of the user who wants to set the preset

Here, the brightness, contrast, etc. parameters are transmitted in JSON format, which the Front-end side already receives and
sets the preset selected by the user