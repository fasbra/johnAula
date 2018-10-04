#language:pt

DISPONIBILIZAR VÁRIOS TIPOS DE INGRESSOS

Cenario service
Como gestor de eventos
Quero  para cada evento disponibilizar variados tipos de ingressos com período de vendas
Para que eu possa atingir vários níveis de público

Cenario validador
Dado que pretendo disponibilizar venda online
Quando cadastrar o evento
Então devo definir um período de venda obrigatório

Cenario validador
Dado que quero criar um evento
Quando informar a data de início de venda posterior a data fim de venda do evento
Então sistema não deve permitir salvar e informa a mensagem:
"A data de início de venda deve ser inferior a data de fim"

Cenario service
Dado que quero vincular os tipos de ingresso disponíveis para o evento
Quando cadastrar o evento
Então quero definir quais tipos de ingressos estarão disponíveis

Cenario validador
Dado que quero criar um evento com ingressos
Quando salvar e ocorrer tipos de ingressos duplicados
Então sistema não deve permitir salvar

