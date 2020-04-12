# ctoproject
Игрушечный проект для "Школы Будущих СТО Яндекс.Облака"

vk.com:

Получите токен для авторизации перейдя по ссылке
https://oauth.vk.com/authorize?client_id={айди сервиса}&display=page&redirect_uri=https://oauth.vk.com/blank.html&scope=wall&response_type=token&v=5.52
где {айди сервиса} - айди вашего stanalone приложения из https://vk.com/apps?act=manage
в изменившемся url будет access_token, скопируйте его в файл application.properties после props.vkToken=
также "ID приложения" после vkServiceId=
id группы(с отрицательным знаком) в которой будет публиковаться пост после vkOwnerId=

<==================================================================================>
facebook.com:

получите маркер доступа пользователя из https://developers.facebook.com/tools/explorer
скопируйте его в application.properties после props.fbToken=
Убедитесь что у вашего приложения в facebook есть согласованные доступы manage_pages, pages_show_list
доступы возможны только у приложения прошедшего проверку, для этого надо соблюсти кучу формальностей и ждать несколько дней.


<==================================================================================>
Без заполненных свойств props.fbToken, props.vkToken, props.vkOwnerId, props.vkServiceId запускать не имеет смысла, будем падать в NPE

Запуск:
mvn spring-boot:run

<==================================================================================>
Использование:
в браузере http://localhost:8080/publish?message=ваше_сообщение_для_публикации_в_соцсетях

ссылка на видео демонстрацию https://yadi.sk/d/k6z1_oITZAQ9oQ