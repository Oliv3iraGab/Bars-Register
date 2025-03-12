Documentação do Projeto - Bar’s Register

Apresentação
Visando aprimorar a organização e a eficiência operacional, foi identificada a necessidade de adotar um sistema capaz de registrar e gerenciar produtos e transações comerciais.
O Bar’s Register foi concebido para automatizar o controle de inventário e o acompanhamento das vendas, facilitando o dia a dia e garantindo maior precisão nas operações. Com esta solução, espera-se otimizar processos, melhorar a gestão de estoque e oferecer maior agilidade e transparência nas atividades comerciais.

Descrição do projeto (descrição básica do sistema planejado)
O Bar’s Register é uma solução de software desenvolvida para otimizar o controle de vendas e inventário para estabelecimentos comerciais no setor de bebidas. O sistema permite o registro detalhado de vendas, gerenciamento de produtos e criação de usuários com permissões específicas, proporcionando maior segurança e personalização no acesso às informações. Além disso, oferece a geração de relatórios mensais sobre as transações realizadas, com a flexibilidade de ajustar o período de análise conforme necessário.
O sistema também permitirá o cadastro e gerenciamento de fornecedores, facilitando o controle de abastecimento e a reposição de produtos. Os usuários autorizados poderão visualizar informações como nome da empresa, contato, histórico de fornecimento e prazos de entrega.
O projeto será desenvolvido utilizando as tecnologias Java e Swing para a interface gráfica, e MySQL para o gerenciamento e armazenamento de dados, garantindo uma solução robusta, escalável e de fácil manutenção.

Descrição dos usuários (quem serão os usuários do sistema)
Os usuários do sistema Bar’s Register serão divididos em diferentes perfis, cada um com permissões específicas para garantir a eficiência e segurança nas operações:
Funcionário: Responsáveis pelo registro das vendas e pelo controle imediato das transações realizadas.
Gestor Financeiro: Encarregado de monitorar o fluxo financeiro, gerenciar relatórios de vendas e realizar análises sobre o desempenho econômico do estabelecimento.
Gerente: Responsável pela supervisão geral do sistema, incluindo a gestão de produtos, usuários, fornecedores e permissões, além de garantir a operação eficiente do dia a dia.

Necessidades observadas e regras de negócio
O sistema deve atender às seguintes necessidades e regras de negócio:
Página de Login: O software deverá possuir uma página de login para autenticação dos usuários, garantindo a identificação adequada e a segurança no acesso às funcionalidades.
Interface Intuitiva e Ágil: A interface do sistema deve ser simples e de fácil navegação, permitindo um registro rápido e eficiente das transações, sem sobrecarregar o usuário com complexidade.
Armazenamento de Registros: O sistema deverá garantir o armazenamento seguro e organizado de todos os registros de vendas e produtos, com fácil acesso a essas informações conforme necessário.
Geração de Relatórios: O software deve ser capaz de gerar relatórios detalhados das vendas, com a possibilidade de filtrar e personalizar o período de análise.
Operação Offline: O sistema não exigirá conexão constante com a rede, permitindo seu funcionamento de forma autônoma e sem dependência de internet para as operações diárias.
Prioridade no Registro de Vendas: A funcionalidade principal do sistema será o registro de vendas, devendo essa função ser ágil, confiável e central para o fluxo de trabalho do sistema.
Cadastro e Gerenciamento de Fornecedores: O sistema permitirá o registro de fornecedores, incluindo nome, CNPJ/CPF, contato e histórico de pedidos. O gestor poderá visualizar quais produtos foram comprados de cada fornecedor e acompanhar prazos de entrega.

Requisitos funcionais
(RF001) Criação de Usuários
 Ator: Gerente / Proprietário
 O sistema deve permitir a criação de usuários com permissões específicas, conforme as necessidades do negócio. O processo de criação de usuários deve ser intuitivo, facilitando o entendimento e garantindo eficiência na configuração das permissões.


(RF002) Registro de Produtos
 Ator: Vendedores / Gerente
 O sistema deve possibilitar o registro de produtos de maneira ágil e eficiente, permitindo a inclusão de descrições detalhadas dos itens para evitar confusões e garantir clareza para todos os usuários do sistema.


(RF003) Registro de Vendas
 Ator: Vendedores
 O sistema deve permitir o registro de vendas de forma rápida e simplificada, com o objetivo de proporcionar um atendimento ágil aos clientes e aumentar a eficiência operacional.


(RF004) Consulta e Alteração de Dados
 Ator: Gerente / Proprietário / Gestor Financeiro
 O sistema deve oferecer a funcionalidade de consulta de registros de vendas e produtos, permitindo a visualização detalhada das informações. Além disso, deve possibilitar a alteração ou exclusão de registros em caso de erros ou ajustes necessários.

(RF005) Cadastro de Fornecedores
 Ator: Gerente / Proprietário
O sistema deve permitir o registro de fornecedores, incluindo dados como nome da empresa, CNPJ/CPF, telefone, e-mail e produtos fornecidos. Além disso, deve possibilitar a edição e exclusão dessas informações conforme necessário.

Requisitos não funcionais
(RNF001) Desempenho
 O software deve ser otimizado para operar de maneira eficiente em máquinas com especificações modestas, garantindo bom desempenho mesmo em computadores com recursos limitados.


(RNF002) Geração de Relatórios
 O sistema deve permitir a geração de relatórios financeiros com base no período selecionado pelo usuário. Gerentes, proprietários e gestores financeiros devem ter acesso completo a esses relatórios, garantindo transparência e facilidade na análise de dados.


(RNF003) Página de Login
 O software deve incluir uma página de login que permita a autenticação dos usuários, assegurando que cada um tenha acesso apenas às funções e permissões específicas definidas para seu perfil.
(RNF004) Segurança
 O sistema deve utilizar hashing de senhas com PBKDF2, garantindo proteção contra ataques de força bruta. Além disso, deve implementar uma rotina de backups automáticos e regulares para evitar perda de dados. O processo de restauração (restore) dos backups deve ser testado periodicamente, assegurando sua eficácia em caso de falhas ou recuperação de informações.

Tecnologias previstas
Linguagem de Programação: Java
Interface gráfica: Swing
Ferramenta de Desenvolvimento (IDE): Netbeans 24
Controle de Versão: GitHub
Banco de Dados: MySQL
Framework: Hibernate para integração com MySQL
