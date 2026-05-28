# language: pt

@Login
Funcionalidade: Login de usuário
  Eu como usuário da Qazando
  Quero fazer login na aplicacao
  Para ter acesso as funcionalidades

  Contexto: Acessar tela de login
    Dado que estou na tela de login

  @login_sucesso
  Cenario: Login com sucesso
    Quando preencho email e senha
    E clico em login
    Entao vejo a mensagem de login realizado com sucesso

  Cenario: Login com sucesso, passando email e senha no gherkin
    Quando preencho login "nala@gmail.com" e senha "123456"
    E clico em login
    Entao vejo a mensagem de login realizado com sucesso

  @login_invalido
  Esquema do Cenario: Validar <name>
    Quando preencho login "<user>" e senha "<password>"
    E clico em login
    Entao vejo a mensagem "<message>" de campo não preenchido

      Exemplos:
      |        user       |    password     |        message        |       name       |
      | qualquercoisa     |     123456      |   E-mail inválido.    |  E-mail inválido |
      |                   |     123456      |   E-mail inválido.    |  E-mail vazio    |
      | nala@gmail.com    |     123         |   Senha inválida.     |  Senha inválida  |
      | nala@gmail.com    |                 |   Senha inválida.     |  Senha vazia     |

