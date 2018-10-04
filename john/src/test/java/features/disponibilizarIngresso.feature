#language:pt

DISPONIBILIZAR V�RIOS TIPOS DE INGRESSOS

Como gestor de eventos
Quero  para cada evento disponibilizar variados tipos de ingressos com per�odo de vendas
Para que eu possa atingir v�rios n�veis de p�blico

Cenario

Dado que pretendo disponibilizar venda online
Quando cadastrar o evento
Ent�o devo definir um per�odo de venda obrigat�rio

Cenario

Dado que quero criar um evento
Quando informar a data de in�cio de venda posterior a data fim de venda do evento
Ent�o sistema n�o deve permitir salvar e informa a mensagem:
"A data de in�cio de venda deve ser inferior a data de fim"

Cenario

Dado que quero vincular os tipos de ingresso dispon�veis para o evento
Quando cadastrar o evento
Ent�o quero definir quais tipos de ingressos estar�o dispon�veis

Cenario

Dado que quero criar um evento com ingressos
Quando salvar e ocorrer tipos de ingressos duplicados
Ent�o sistema n�o deve permitir salvar

