# Sistema de Cadastro de Requisições de Medicamentos para Prefeituras
Este repositório está sendo desenvolvido como trabalho acadêmico das disciplinas de Programação III, Banco de Dados II e Análise de Projetos e Sistemas do curso técnico em informática do IFRS. O objetivo deste projeto é facilitar a comunicação entre as requisições de medicamentos das prefeituras do litoral norte gaúcho e a unidade da Coordenadoria da Saúde da região.
<br> <br>
O sistema possui dois tipos de usuários: PREFEITURA e ADMIN. Usuários PREFEITURA podem criar requisições de medicamentos, especificando nome, lote e quantidade, além de visualizar histórico e atualizações dos pedidos. Usuários ADMIN recebem e analisam as requisições, podendo alterar o status para "em análise", "em trânsito" e "entregue". O sistema calcula a quantidade de caixas necessárias para atender à requisição e identifica se o medicamento requer um transporte especial, como manutenção em temperatura baixa.

## Funcionalidades
- Autentificação de Usuário. (Implementada)
- Cadastro e edição de requisições. (Implementada)
- Envio de requisições para a Coordenadoria. (Implementada)
- Geração de históricos de requisições. (À fazer)
- Acompanhamento de status de requisições. (À fazer)
- Identificação de transporte especial e quantidade de caixas. (À fazer)

## Tecnologias Utilizadas
- Java - Linguagem de Programação principal.
- Swing - Biblioteca para criação de interfac gráfica.
- Derby - Banco de dados relacional utilizado para armazenar dados de usuários, pedidos e medicamentos.
