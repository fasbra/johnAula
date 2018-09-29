#language:pt

Funcionalidade: Ingresso


Eu como gestor de eventos
Quero ter inúmeros tipos de ingresso
Para que eu possa atingir vários níveis de público

Cenario: 2.1
Dado que quero disponibilizar um ingresso VIP
Quando informar o valor
Então o mesmo deve ser 1000

Cenário: 2.2 - Critérios de Aceitação
Dado que quero disponibilizar um ingresso BACKSTAGE
Quando informar o valor
Então o mesmo deve ser 800

Cenario: 2.3 - Critérios de Aceitação
Dado que quero disponibilizar um ingresso PLATEIA VIP
Quando informar o valor
Então o mesmo deve ser 500

Cenario: 2.4 - Critérios de Aceitação
Dado que quero disponibilizar um ingresso PLATEIA
Quando informar o valor
Então o mesmo deve ser 300
