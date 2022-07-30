# Applying-the-Child-axes-method
Assignment 3 W8D5 - SDA - Software QA Bootcamp


## Table of contents
* [Question](#question)
* [Answer](#answer)
* [Output Screenshots](#output-screenshots)


## Question
write 3 or 4 examples for Xpath using the 'child' axes method.


## Answer
I used itmeo website https://itmeo.com/
Before running the code, there are some steps that need to take considered:


### First:
Setup Latest Web Driver for Chrome  Driver.
Donwload the necessary jar files:
- Selenium (Lastest).
- TestNG (Lastest).
- commander (Lastest).

### Second:
Add them as a library in the classpath of the project
- _click-reight on the file project >Build path > configure Bild path > Java Build Path > Libraries > classpath > add external JARs > Apply and close_.

### Third:
I Opened the website, then write four Xpath using 'child' axes method.

- XPath= //div[@class='logo']//child::a

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/181997141-8f2be1e1-ecbd-42f0-a01d-2e32754bb4b4.png" width=60% height=60%>
</p>

- XPath= //ul[@class='features-checklist main-screen__features']//li[@class='features-checklist__item']//child::span[contains(text(),'Ready-to-use products')]

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/181997168-aa7311e0-e347-4451-862b-4de11619da6a.png" width=60% height=60%>
</p>

- XPath= //li//child::a[contains(text(),'Log In') and @href='/login']

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/181997194-9db61f0f-f72d-4d84-819f-d25bb40833d5.png" width=60% height=60%>
</p>

- XPath= //form//child::input[contains(@placeholder,'Your email address') or @class='footer-subscribe-form__input']

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/181997212-6645827c-2ee7-4e6e-b69b-b502ed20cd81.png" width=60% height=60%>
</p>




## Output Screenshots:

<p align="center">
<img src="https://user-images.githubusercontent.com/48597284/181997229-e2517626-aea5-4ff7-98d9-9167a4d5b1d1.png" width=80% height=80%>


https://user-images.githubusercontent.com/48597284/181997251-65f3b8a0-8a17-4771-849c-e98588f53a41.mp4
</p>
