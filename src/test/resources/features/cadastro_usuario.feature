# language: pt

@cadastro
Funcionalidade: Cadastro de usuário
  Eu como novo usuário
  Quero me cadastrar da Qazando Shop
  Para comprar itens

  @cadastro_sucesso
  Cenario: Registrar novo usuário com sucesso
    Dado que estou na tela de cadastro
    Quando eu preencho o formulario de cadastro com nome "Nala" email "nala@gmail.com" e senha "123456"
    E clico em cadastrar
    Entao vejo a mensagem de cadastro realizado com sucesso

  Cenario: Cadastrar usuario com todos os campos vazios
    Dado que estou na tela de cadastro
    Quando eu preencho o formulario de cadastro com nome "" email "" e senha ""
    E clico em cadastrar
    Entao vejo a mensagem de "O campo nome deve ser prenchido" de campo inválido

  Cenario: Cadastrar usuario com o campo nome vazio
    Dado que estou na tela de cadastro
    Quando eu preencho o formulario de cadastro com nome "" email "nala@gmail.com" e senha "123456"
    E clico em cadastrar
    Entao vejo a mensagem de "O campo nome deve ser prenchido" de campo inválido

  Cenario: Cadastrar usuario com o campo email vazio
    Dado que estou na tela de cadastro
    Quando eu preencho o formulario de cadastro com nome "Nala" email "" e senha "123456"
    E clico em cadastrar
    Entao vejo a mensagem de "O campo e-mail deve ser prenchido corretamente" de campo inválido

  Cenario: Cadastrar usuario com o campo email inválido
    Dado que estou na tela de cadastro
    Quando eu preencho o formulario de cadastro com nome "Nala" email "email" e senha "123456"
    E clico em cadastrar
    Entao vejo a mensagem de "O campo e-mail deve ser prenchido corretamente" de campo inválido

  Cenario: Cadastrar usuario com o campo senha vazia
    Dado que estou na tela de cadastro
    Quando eu preencho o formulario de cadastro com nome "Nala" email "nala@gmail.com" e senha ""
    E clico em cadastrar
    Entao vejo a mensagem de "O campo senha deve ter pelo menos 6 dígitos" de campo inválido

  Cenario: Cadastrar usuario com o campo senha com menos de 6 caracteres
    Dado que estou na tela de cadastro
    Quando eu preencho o formulario de cadastro com nome "Nala" email "nala@gmail.com" e senha "123"
    E clico em cadastrar
    Entao vejo a mensagem de "O campo senha deve ter pelo menos 6 dígitos" de campo inválido