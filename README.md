# Sistema de Cadastro de Requisições de Medicamentos para Prefeituras

## Índice
- [Introdução](#Introdução)
- [Funcionalidades](#Funcionalidades)
- [Tecnologias Utilizadas](#Tecnologias-Utilizadas)
- [Futuras Melhorias](#Futuras-Melhorias)

## Introdução
<p align="justify">Este repositório está sendo desenvolvido como trabalho acadêmico das disciplinas de Programação III, Banco de Dados II e Análise de Projetos e Sistemas do curso técnico em informática do IFRS. O objetivo deste projeto é facilitar a comunicação entre as requisições de medicamentos das prefeituras do litoral norte gaúcho e a unidade da Coordenadoria da Saúde da região.
<br> <br>
O sistema possui dois tipos de usuários: PREFEITURA e ADMIN. Usuários PREFEITURA podem criar requisições de medicamentos, especificando nome, lote e quantidade, além de visualizar histórico e atualizações dos pedidos. Usuários ADMIN recebem e analisam as requisições, podendo alterar o status para "em análise", "em trânsito" e "entregue". O sistema calcula a quantidade de caixas necessárias para atender à requisição e identifica se o medicamento requer um transporte especial, como manutenção em temperatura baixa. </p>

## Funcionalidades
- [x] Autentificação de Usuário.
- [x] Cadastro e edição de requisições.
- [x] Envio de requisições para a Coordenadoria.
- [x] Geração de históricos de requisições.
- [ ] Acompanhamento e atualização de status de requisições.
- [ ] Identificação de transporte especial e cálculo de quantidade de caixas necessárias.
- [ ] Sistema de notificação quando status alterado

## Tecnologias Utilizadas
- Java - Linguagem de Programação principal.
- Swing - Biblioteca para criação de interface gráfica.
- Derby - Banco de dados relacional utilizado para armazenar dados de usuários, pedidos e medicamentos.

## Futuras Melhorias
<p align="justify">Para melhorar a funcionalidade e praticidade do sistema de histórico, seria vantajoso a adição de dois novo campos à tabela de Pedido: Data de Requisição e Data de Entrega. Ambas as informações auxiliam em processos relacionados a logísticas e controle de medicamentos, permitindo que a aplicação reflita situações reais com mais precisão.
<br><br>
Da mesma forma, a implementação de um sistema de estoque facilitaria a adição de medicamentos ao banco de dados e manteria um controle preciso das quantidades na Coordenadoria. A inclusão de um campo para observações nos pedidos também melhoraria a comunicação e permitiria relatar possíveis transtornos, como a falta de um medicamento requisitado, de forma mais eficiente.
<br><br>
Além disso, considera-se interessante a transformação em uma aplicação web, utilizando frameworks como o Spring. O Spring é conhecido por oferecer simplicidade na aplicação da arquitetura MVC(Movel View Controller) em razão de sua eficiência e facilitando a integração com banco de dados. </p>
