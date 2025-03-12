Documenta��o do Projeto - Bar�s Register

Apresenta��o
Visando aprimorar a organiza��o e a efici�ncia operacional, foi identificada a necessidade de adotar um sistema capaz de registrar e gerenciar produtos e transa��es comerciais.
O Bar�s Register foi concebido para automatizar o controle de invent�rio e o acompanhamento das vendas, facilitando o dia a dia e garantindo maior precis�o nas opera��es. Com esta solu��o, espera-se otimizar processos, melhorar a gest�o de estoque e oferecer maior agilidade e transpar�ncia nas atividades comerciais.

Descri��o do projeto (descri��o b�sica do sistema planejado)
O Bar�s Register � uma solu��o de software desenvolvida para otimizar o controle de vendas e invent�rio para estabelecimentos comerciais no setor de bebidas. O sistema permite o registro detalhado de vendas, gerenciamento de produtos e cria��o de usu�rios com permiss�es espec�ficas, proporcionando maior seguran�a e personaliza��o no acesso �s informa��es. Al�m disso, oferece a gera��o de relat�rios mensais sobre as transa��es realizadas, com a flexibilidade de ajustar o per�odo de an�lise conforme necess�rio.
O sistema tamb�m permitir� o cadastro e gerenciamento de fornecedores, facilitando o controle de abastecimento e a reposi��o de produtos. Os usu�rios autorizados poder�o visualizar informa��es como nome da empresa, contato, hist�rico de fornecimento e prazos de entrega.
O projeto ser� desenvolvido utilizando as tecnologias Java e Swing para a interface gr�fica, e MySQL para o gerenciamento e armazenamento de dados, garantindo uma solu��o robusta, escal�vel e de f�cil manuten��o.

Descri��o dos usu�rios (quem ser�o os usu�rios do sistema)
Os usu�rios do sistema Bar�s Register ser�o divididos em diferentes perfis, cada um com permiss�es espec�ficas para garantir a efici�ncia e seguran�a nas opera��es:
Funcion�rio: Respons�veis pelo registro das vendas e pelo controle imediato das transa��es realizadas.
Gestor Financeiro: Encarregado de monitorar o fluxo financeiro, gerenciar relat�rios de vendas e realizar an�lises sobre o desempenho econ�mico do estabelecimento.
Gerente: Respons�vel pela supervis�o geral do sistema, incluindo a gest�o de produtos, usu�rios, fornecedores e permiss�es, al�m de garantir a opera��o eficiente do dia a dia.

Necessidades observadas e regras de neg�cio
O sistema deve atender �s seguintes necessidades e regras de neg�cio:
P�gina de Login: O software dever� possuir uma p�gina de login para autentica��o dos usu�rios, garantindo a identifica��o adequada e a seguran�a no acesso �s funcionalidades.
Interface Intuitiva e �gil: A interface do sistema deve ser simples e de f�cil navega��o, permitindo um registro r�pido e eficiente das transa��es, sem sobrecarregar o usu�rio com complexidade.
Armazenamento de Registros: O sistema dever� garantir o armazenamento seguro e organizado de todos os registros de vendas e produtos, com f�cil acesso a essas informa��es conforme necess�rio.
Gera��o de Relat�rios: O software deve ser capaz de gerar relat�rios detalhados das vendas, com a possibilidade de filtrar e personalizar o per�odo de an�lise.
Opera��o Offline: O sistema n�o exigir� conex�o constante com a rede, permitindo seu funcionamento de forma aut�noma e sem depend�ncia de internet para as opera��es di�rias.
Prioridade no Registro de Vendas: A funcionalidade principal do sistema ser� o registro de vendas, devendo essa fun��o ser �gil, confi�vel e central para o fluxo de trabalho do sistema.
Cadastro e Gerenciamento de Fornecedores: O sistema permitir� o registro de fornecedores, incluindo nome, CNPJ/CPF, contato e hist�rico de pedidos. O gestor poder� visualizar quais produtos foram comprados de cada fornecedor e acompanhar prazos de entrega.

Requisitos funcionais
(RF001) Cria��o de Usu�rios
 Ator: Gerente / Propriet�rio
 O sistema deve permitir a cria��o de usu�rios com permiss�es espec�ficas, conforme as necessidades do neg�cio. O processo de cria��o de usu�rios deve ser intuitivo, facilitando o entendimento e garantindo efici�ncia na configura��o das permiss�es.


(RF002) Registro de Produtos
 Ator: Vendedores / Gerente
 O sistema deve possibilitar o registro de produtos de maneira �gil e eficiente, permitindo a inclus�o de descri��es detalhadas dos itens para evitar confus�es e garantir clareza para todos os usu�rios do sistema.


(RF003) Registro de Vendas
 Ator: Vendedores
 O sistema deve permitir o registro de vendas de forma r�pida e simplificada, com o objetivo de proporcionar um atendimento �gil aos clientes e aumentar a efici�ncia operacional.


(RF004) Consulta e Altera��o de Dados
 Ator: Gerente / Propriet�rio / Gestor Financeiro
 O sistema deve oferecer a funcionalidade de consulta de registros de vendas e produtos, permitindo a visualiza��o detalhada das informa��es. Al�m disso, deve possibilitar a altera��o ou exclus�o de registros em caso de erros ou ajustes necess�rios.

(RF005) Cadastro de Fornecedores
 Ator: Gerente / Propriet�rio
O sistema deve permitir o registro de fornecedores, incluindo dados como nome da empresa, CNPJ/CPF, telefone, e-mail e produtos fornecidos. Al�m disso, deve possibilitar a edi��o e exclus�o dessas informa��es conforme necess�rio.

Requisitos n�o funcionais
(RNF001) Desempenho
 O software deve ser otimizado para operar de maneira eficiente em m�quinas com especifica��es modestas, garantindo bom desempenho mesmo em computadores com recursos limitados.


(RNF002) Gera��o de Relat�rios
 O sistema deve permitir a gera��o de relat�rios financeiros com base no per�odo selecionado pelo usu�rio. Gerentes, propriet�rios e gestores financeiros devem ter acesso completo a esses relat�rios, garantindo transpar�ncia e facilidade na an�lise de dados.


(RNF003) P�gina de Login
 O software deve incluir uma p�gina de login que permita a autentica��o dos usu�rios, assegurando que cada um tenha acesso apenas �s fun��es e permiss�es espec�ficas definidas para seu perfil.
(RNF004) Seguran�a
 O sistema deve utilizar hashing de senhas com PBKDF2, garantindo prote��o contra ataques de for�a bruta. Al�m disso, deve implementar uma rotina de backups autom�ticos e regulares para evitar perda de dados. O processo de restaura��o (restore) dos backups deve ser testado periodicamente, assegurando sua efic�cia em caso de falhas ou recupera��o de informa��es.

Tecnologias previstas
Linguagem de Programa��o: Java
Interface gr�fica: Swing
Ferramenta de Desenvolvimento (IDE): Netbeans 24
Controle de Vers�o: GitHub
Banco de Dados: MySQL
Framework: Hibernate para integra��o com MySQL
