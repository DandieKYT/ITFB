<h1>Добро пожаловать!</br> 

# <a name="TableOfContents">Содержание страницы</a>
+ [:trophy: Мои инструменты и технологии](#MyToolsAndTechnologies)
+ [✍Описаниe](#Description)
+ [:heavy_check_mark:  Реализованные проверки:](#ImplementedСhecks)
+ [🎯Проект](#Project)
+ [👷‍♂️ Сборка в Jenkins](#Build_in_Jenkins)
+ [🖥 Запуск из терминала](#terminal)
+ [:chart_with_downwards_trend: Allure отчет](#Allure_report)
    + [Главный экран отчета](#Allure_report1)
    + [Страница с проведенными тестами](#Allure_report2)
+ [:bar_chart: Интеграция с Allure TestOps](#Integration_Allure_TestOps)
    + [Страница с тестами в TestOps](#ManualTest)
+ [:iphone: Отчет в Telegram](#Telegram)
+ [:movie_camera: Видео примеры прохождения тестов](#Video)

<a name="MyToolsAndTechnologies"><h2>:trophy: Мои инструменты и технологии</h2></a>
<p  align="center">

<code><a href = "https://www.java.com/ru/">![This is an image](/design/icons/Java.png)</a></code>
<code><a href = "https://gradle.org/">![This is an image](/design/icons/gradle.png)</a></code>
<code><a href = "https://www.jetbrains.com/ru-ru/idea/">![This is an image](/design/icons/Intelij_IDEA.png)</a></code>
<code><a href = "https://ru.selenide.org/">![This is an image](/design/icons/Selenide.png)</a></code>
<code><a href = "https://selenoid.autotests.cloud/#/">![This is an image](/design/icons/Selenoid.png)</a></code>
<code><a href = "https://junit.org/junit5/">![This is an image](/design/icons/JUnit5.png)</a></code>
<code><a href = "https://www.jenkins.io/">![This is an image](/design/icons/Jenkins.png)</a></code>
<code><a href = "https://github.com/allure-framework">![This is an image](/design/icons/Allure_Report.png)</a></code>
<code><a href = "https://qameta.io/">![This is an image](/design/icons/AllureTestOps.png)</a></code>
<code><a href = "https://web.telegram.org/k/">![This is an image](/design/icons/Telegram.png)</a></code>
<code><a href = "https://www.atlassian.com/ru/software/jira">![This is an image](/design/icons/Jira.png)</a></code>
<code><a href = "https://www.postman.com/">![This is an image](/design/icons/postman.png)</a></code>
<code><a href = "https://git-scm.com/">![This is an image](/design/icons/git.png)</a></code>
<code><a href = "https://github.com/">![This is an image](/design/icons/GitHub.png)</a></code>
<code><a href = "https://developer.chrome.com/docs/devtools/">![This is an image](/design/icons/devtools.png)</a></code>
</br>

<a name="Description"><h2>Описаниe</h2></a>
Автотесты в этом проекте написаны на `Java` с использованием `Selenide`.\
`Gradle` - для автоматической системы сборки.  \
`JUnit5` - для модульного тестирования.\
`Jenkins` - CI/CD для удаленного запуска тестов.\
`Selenoid` - для удаленного запуска браузеров в `Docker` контейнере.\
`Allure Report` - для визуализации результатов тестирования.\
`Telegram Bot` - для уведомлений о результатах тестирования.\
`Allure TestOps` - система управления тестированием.

<a name="ImplementedСhecks"><h2>:heavy_check_mark:  Реализованные проверки:</h2></a> 

:clipboard: Наличие вакансии тестировщика на <a href = "https://itfbgroup.ru/career#actual">сайте компании </br>

:speech_balloon: Переход на официальную страницу компании в <a href = "https://vk.com/itfb_group">ВК</a><a href = "https://t.me/itfbgroup">Telegram</a>
</br>

:clipboard: Открытие страниц с PDF фвйлом <a href = "https://nextcloud.itfbgroup.ru/s/aqZtTNNcc8yKP6b">Инструкция по эксплуатация ПО</a>/<a href = "https://nextcloud.itfbgroup.ru/s/qJ8cxmPz6ita5iL">Описание ПО</a>
<a href = "https://nextcloud.itfbgroup.ru/s/dxBn5RcY76dWmDQ">Описание процессов ПО</a>
</br>

🔎 Соответствие результатов выдачи во вкладке<a href = "https://itfbgroup.ru/projects"> Проекты
</br>

:card_index_dividers: Открытие и проверка страницы <a href = "https://itfbgroup.ru/easydoc"> EasyDoc
</br>

<a name="Project"><h2>Проект</h2></a>
<a href="https://itfbgroup.ru/"><code><img width="5%" title="ITFB" src="https://static.tildacdn.com/tild3036-3466-4462-a133-613066343432/logo-itfb-white.svg"></code></a> Проект по автоматизации тестирования для <a target="_blank" href="https://itfbgroup.ru/">ITFB</a> — группа компаний с экспертизой от проектирования и разработки ПО до строительства и поддержки ИТ-инфраструктуры.
:star2:

<a name="Build_in_Jenkins" href="https://jenkins.autotests.cloud/job/ITFB/"><h2>👷‍♂️ Сборки в [Jenkins](https://jenkins.autotests.cloud/job/ITFB/)<h2></a>

![image](https://github.com/DandieKYT/ITFB/assets/75677738/ba872a25-4a6b-4b54-9b4b-9416b5a80a37)


<a name="terminal"><h2>:computer: Запуск из терминала</h2></a>
Удаленный запуск:

```

clean test

```
<a name="Allure_report"><h2>:chart_with_downwards_trend: Allure </a><a href="https://jenkins.autotests.cloud/job/BIZONE/5/allure/">отчет</a></h2>

- <a name="Allure_report1"><h3>Главный экран отчета</h3></a>

![image](https://github.com/DandieKYT/ITFB/assets/75677738/b4b13979-179e-43bd-bf55-0a993f299e39)


-  <a name="Allure_report2"><h3>Страница с проведенными тестами</h3></a>

![image](https://github.com/DandieKYT/ITFB/assets/75677738/e8c202f4-775a-4341-90b2-059d278068d3)


<a name="Integration_Allure_TestOps"><h2>:bar_chart: Интеграция с Allure TestOps</h2></a>




<a name="Telegram"><h2>:iphone: Отчет в Telegram</h2></a>

![image](https://github.com/DandieKYT/ITFB/assets/75677738/1432513a-b36b-4ee1-a0a3-be23a24f5db9)


<a name="Video"><h2>:movie_camera: Видео примеры прохождения тестов</h2></a>

- <a name="Video1"><h3>Пример запуска тестов через selenoid</h3></a>
    <h1><a href="https://selenoid.autotests.cloud/video/13f2afbee3f6bde5f77236d6531dbf13.mp4">ITFB Suite<br>



https://github.com/DandieKYT/ITFB/assets/75677738/17f78da1-e8a9-47e4-845e-90e80e32ab8e



