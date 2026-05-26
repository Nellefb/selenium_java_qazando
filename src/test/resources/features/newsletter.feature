# language: pt

  @newsletter
Funcionalidade: Se inscrever no Newsletter
  Eu como usuário da Qazando
  Quero receber notícias
  Para poder comprar cursos novos

  Cenário: Cadastrar e-mail no newsletter
    Dado que estou no site da Qazando
    Quando eu preencher meu e-mail na newsletter
    E clicar em Send Mail
    Então eu vejo a mensagem de sucesso