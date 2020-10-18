Os integrantes deste PG2 são os mesmos integrantes do meu grupo do trabalho prático:
Andy Ruiz
Gabriel Stepien
Cassiano
Guilherme


Para rodar projeto (maneira alternativa e mais simples do que rodar na mão os comandos):
  - Rodar um make
  - Rodar um make run-server
  - Rodar um make run-client (tendo outro terminal rodando um server)

P.S. foi testado que o servidor executa simultaneamente invocações concorrente feitas por múltiplos
clientes. No arquivo CalculadoraRest.java foi colocado um sleep de 3 segundos no método de somar.
Foram disparados 2 clientes, 1 somando primeiro e logo após 1 multiplicando.
O cliente que pediu multiplicação recebeu a resposta em seguida, já o da soma recebeu após o tempo do sleep.
Isso nos indicou que cada invocação rest abre uma execução no web server
