#language:pt

Funcionalidade: Evento

Eu como gestor de eventos
Quero ter a possibilidade de criar eventos
Para que meus clientes tenham conhecimento de eventos e suas datas

Cenário: 
Dado que quero criar um evento
Quando carregar o formulário
Então deve apresentar os seguintes campos "nome" e "data"

Cenário: 
Dado que quero criar um evento
Quando salvar o evento
Então os campos abaixo devem ser obrigatórios "nome" e "data evento"


Cenário: 

Dado que quero criar um evento
Quando informar um nome maior que 150 caracteres e salvar
Então não deve permitir salvar e informar a mensagem: "O nome permite no máximo 150 caracteres"

Cenário:

Dado que quero criar um evento
Quando informar uma data inferior ao do dia atual e salvar
Então não deve permitir salvar e informar a mensagem: "A data do evento deve ser igual ou maior que a de hoje"

