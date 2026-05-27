# language: pt

@cadastro
Funcionalidade: Cadastro de usuário
  Eu como novo usuário
  Quero me cadastrar da Qazando Shop
  Para comprar itens

  Contexto: Acessar tela de cadastro
    Dado que estou na tela de cadastro

  @cadastro_sucesso
  Cenario: Registrar novo usuário com sucesso
    Quando eu preencho o formulario de cadastro com nome "Nala" email "nala@gmail.com" e senha "123456"
    E clico em cadastrar
    Entao vejo a mensagem de cadastro realizado com sucesso

    @cadastro_incorreto
  Esquema do Cenario: Cadastrar usuario com <titulo>
    Quando eu preencho o formulario de cadastro com nome "<name>" email "<email>" e senha "<password>"
    E clico em cadastrar
    Entao vejo a mensagem de "<message>" de campo inválido

    Exemplos:
    |   name    |      email      |  password |                    message                     |                titulo                 |
    |           |                 |           |         O campo nome deve ser prenchido        |       todos os campos vazios          |
    |           |  nala@gmail.com |   123456  |         O campo nome deve ser prenchido        |          campo nome vazio             |
    |    Nala   |                 |   123456  | O campo e-mail deve ser prenchido corretamente |           campo email vazio           |
    |    Nala   |      nala       |   123456  | O campo e-mail deve ser prenchido corretamente |         campo email inválido          |
    |    Nala   |  nala@gmail.com |           |   O campo senha deve ter pelo menos 6 dígitos  |          campo senha vazia            |
    |    Nala   |  nala@gmail.com |    123    |   O campo senha deve ter pelo menos 6 dígitos  | campo senha com menos de 6 caracteres |

