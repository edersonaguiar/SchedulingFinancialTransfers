Documentação - Scheduler Transfers Back-end
Tecnologias Utilizadas
Spring Boot
Spring Boot é um framework Java que simplifica o desenvolvimento de aplicativos Java, fornecendo um conjunto de recursos e convenções para acelerar o processo de desenvolvimento. Ele facilita a criação de aplicativos robustos e escaláveis, com configuração mínima e sem a necessidade de configuração manual extensiva.

Site oficial do Spring Boot

Spring Data JPA
Spring Data JPA é uma parte do ecossistema Spring que facilita o acesso a bancos de dados relacionais a partir de aplicativos Java, usando a API JPA (Java Persistence API). Ele fornece uma abordagem simplificada para escrever consultas de banco de dados e realizar operações CRUD (Create, Read, Update, Delete) em entidades JPA.

Documentação do Spring Data JPA

Spring Web
Spring Web é um módulo do Spring Framework que oferece suporte ao desenvolvimento de aplicativos da web em Java. Ele fornece recursos para criar controladores RESTful, manipular solicitações HTTP, serializar/desserializar objetos JSON, entre outros.

Documentação do Spring Web

Funcionalidades
Agendamento de Transferências
O back-end da aplicação permite que os usuários agendem transferências entre contas bancárias. Ele expõe um endpoint RESTful que aceita solicitações para agendar uma transferência, incluindo detalhes como a conta de origem, conta de destino, valor e data da transferência. Após receber uma solicitação de agendamento de transferência, o back-end valida os dados fornecidos e executa a lógica de negócios necessária para agendar a transferência.

Listagem de Transferências Agendadas
Além disso, o back-end oferece um endpoint RESTful para recuperar uma lista de todas as transferências agendadas. Os usuários podem acessar essa lista para visualizar as transferências agendadas anteriormente, incluindo detalhes como a conta de origem, conta de destino, valor e data da transferência.
