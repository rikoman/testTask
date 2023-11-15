# testTask
## Описание
Приложение принимает строку и показывает частоту повторений символов.

Пример входной строки: “aaaaabcccc”
Пример выходного результата: “a”: 5, “c”: 4, “b”: 1

## Стек технологий
- Java 17
- Spring boot 3
- junit
- docker

## Запуск приложения
1) Склонируйте репозиторий на ваш компьютер
2) Перейдите в корневую папку Spring приложения (/testTask/test)
3) Откройте консоль и напишите команду docker build -t api:latest .
4) Запустите докер контейнер командой docker run api
![Screenshot](https://github.com/rikoman/testTask/blob/main/runningSpringBoot.png)
6) После успешного запуска контейнера создайте новое окно терминала и пропишите команду docker ps чтобы узнать id контейнера (CONTAINER ID)
![Screenshot](https://github.com/rikoman/testTask/blob/main/containerId.png)
8) После того как узнали id пропишите docker inspect id чтобы узнать на каком адресе запущен контейнер (NetworkSetting - Networks - bridge - IPAddress: 172.17.0.2 - в моем случае)
![Screenshot](https://github.com/rikoman/testTask/blob/main/IPAddres.png)
10) Переходим по адресу контейнера и добавляем :8080 ( в моем случае id контейнера http://172.17.0.2 и я добавляю :8080 и получается http://172.17.0.2:8080)
11) Для проверки можно использовать браузер, просто прописав http://172.17.0.2:8080. Будет выведен интерфейс с вводом текста и кнопка которая будет отправлять текст на сервер
![Screenshot](https://github.com/rikoman/testTask/blob/main/browser.png)
![Screenshot](https://github.com/rikoman/testTask/blob/main/browserResult.png)
12) Для проверки можно использовать Postman, прописав http://172.17.0.2:8080/api?body=yourtext и выбрав метод POST
![Screenshot](https://github.com/rikoman/testTask/blob/main/postman.png)

p.s. У вас должен быть установлен докер
