#language:pt

Funcionalidade: Evento

Eu como gestor de eventos
Quero ter a possibilidade de criar eventos
Para que meus clientes tenham conhecimento de eventos e suas datas

Cen�rio: 
Dado que quero criar um evento
Quando carregar o formul�rio
Ent�o deve apresentar os seguintes campos "nome" e "data"

Cen�rio: 
Dado que quero criar um evento
Quando salvar o evento
Ent�o os campos abaixo devem ser obrigat�rios "nome" e "data evento"


Cen�rio: 

Dado que quero criar um evento
Quando informar um nome maior que 150 caracteres e salvar
Ent�o n�o deve permitir salvar e informar a mensagem: "O nome permite no m�ximo 150 caracteres"

Cen�rio:

Dado que quero criar um evento
Quando informar uma data inferior ao do dia atual e salvar
Ent�o n�o deve permitir salvar e informar a mensagem: "A data do evento deve ser igual ou maior que a de hoje"

