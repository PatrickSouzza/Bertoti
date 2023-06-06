# Portifólio - Patrick Souza
<div align="center">
<img src="https://raw.githubusercontent.com/PatrickSouzza/Bertoti/main/Metodologia/WhatsApp%20Image%202023-05-28%20at%2012.24.29.jpeg" height="500"/>
</div>

## Introdução

Com 24 anos de idade, sou estudante do 4º semestre do curso de Banco de Dados na FATEC de São José dos Campos - Prof. Jessen Vidal. Nesse programa acadêmico, tive a oportunidade de participar de alguns projetos integradores em parceria com diversas empresas, o que me proporcionou um contato direto com clientes e desafios reais enfrentados tanto por empresas de pequeno porte quanto por multinacionais.

Ao longo dos meus estudos durante esses 4 semestres, concentrei-me não apenas no desenvolvimento de habilidades técnicas (hard skills), mas também no aprimoramento das competências interpessoais (soft skills). Participei ativamente de equipes que utilizam Metodologia Ágil, o que me permitiu adquirir experiência em colaboração, comunicação eficaz e trabalho em equipe.

Estou empenhado em me tornar um profissional completo na área de Banco de Dados e Desenvolvimento de Software, buscando constantemente atualizações e aprimoramentos para acompanhar as demandas do mercado e fornecer soluções eficientes para os desafios enfrentados pelas empresas.

<h3>Para mais informações e contato:</h3>

[![portfolio](https://img.shields.io/badge/my_portfolio-000?style=for-the-badge&logo=ko-fi&logoColor=white)](https://github.com/PatrickSouzza)
[![linkedin](https://img.shields.io/badge/linkedin-0A66C2?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/PatrickSouzza/)
<a href = "mailto:emanuelecampos14@gmail.com"><img src="https://img.shields.io/badge/-Gmail-%23333?style=for-the-badge&logo=gmail&logoColor=white" target="_blank"></a>


## Habilidades e Proficiências


<details>
<summary>BackEnd</summary>

* [Java](https://www.java.com/pt-BR/?msclkid=7faa842eb8f811ecab39772d4c1ae90b)
* [Python](https://www.python.org/downloads/)
* [Spring boot](https://spring.io/projects/spring-boot)
* [JavaScript](https://www.javascript.com/)
* [Node.js](https://nodejs.org/en)

</details>

<details>
<summary>Front-End</summary>

* [Vue.js](https://vuejs.org/)
* [JavaScript](https://www.javascript.com)
* [HTML](https://www.w3schools.com/css/)
* [CSS](https://www.w3schools.com/css/)

</details>

<details>
<summary>Banco de Dados</summary>

* Tenho experiência sólida no uso de bancos de dados, incluindo MySQL, PostgreSQL, MariaDB e Oracle desde 2021. Domino os comandos DDL, DCL e DML, permitindo desenvolver tabelas, inserir registros, estabelecer restrições e diretrizes para garantir uma gestão eficiente do banco de dados. Também desempenhei funções administrativas importantes, como monitoramento, backup e recuperação de dados. Possuo habilidades para colaborar efetivamente em equipes e garantir a integridade e qualidade dos dados em projetos.
</details>


## Projeto Integrador 2º semestre de 2022
## Empresa parceira:
IACIT

<img src="https://user-images.githubusercontent.com/54003876/142727570-6c418f49-5e00-437c-9d9e-5b27131974bb.png" height="300"/>

##### (Fonte: https://www.iacit.com.br/)*

## Visão do Projeto
Desenvolver uma aplicação capaz de tratar, filtrar e exibir dados metereológicos de nivel nacional de facil visualização. Em que todos os dadose a forma em que são apresentados foram decididos em conjunto com os clientes parceiros.

## O produto


![cabecario (3)](https://user-images.githubusercontent.com/89882058/222289468-de548f06-66b0-461f-aa74-86c6f90f5907.jpg)

A equipe do Fluffy desenvolveu um software web para a empresa Iacit que possibilita a automatização desde o download, o processamento dos dados e a persistência dos dados no banco de dados de forma simplificada. Além disso, também será possível realizar a filtragem desses dados por temperatura, umidade, estações, vento, pressão atmosférica, radiação global e precipitação, além da diversa visualizações desses dados. Contudo, foi entregue também diferentes níveis de usuários juntamente com o painel administrativo possibilitando a exportação dos relatórios a partir dos dados.

<div align="center">
<a href="#" target="_blank"><img style="margin: 10px" src="https://github.com/fluffyfatec/Iacit/blob/Sprint-2/GIT/VID-20221009-WA0013%20(2).gif" height="500" /></a>
</div>

## Contibuições individuais:

<details>
<summary>Front-End</summary>
  
  ### Desenvolvimento das telas
  <p>-Implementei o desenvolvimento de telas em um aplicativo Spring Boot utilizando o framework Thymeleaf. Criei as páginas HTML para cada tela desejada, definindo sua estrutura e layout. Integrei as páginas HTML ao aplicativo Spring Boot, utilizando recursos do Thymeleaf para renderizar dados dinâmicos e processar lógica condicional. Implementei a navegação entre as telas e obtive um aplicativo com telas funcionais e interativas.
    
  ### Estilização 
  <p>-Realizei a estilização e manutenção das telas do aplicativo, priorizando a adaptabilidade para dispositivos móveis. Utilizei media queries e técnicas de design responsivo para ajustar o layout e os estilos das telas em diferentes tamanhos de tela. Realizei testes em diversos dispositivos e implementei práticas de manutenção para garantir uma experiência consistente. As telas foram estilizadas de forma responsiva, proporcionando uma experiência de usuário otimizada em dispositivos móveis.</p>
  <p>-Estilizei os gráficos nas telas de relatórios do aplicativo, utilizando bibliotecas de gráficos para criar visualizações interativas. Apliquei estilos personalizados aos gráficos, garantindo uma aparência profissional e adaptando-os a diferentes tamanhos de tela. Realizei testes em vários dispositivos para garantir uma experiência visual agradável. Os gráficos nas telas de relatórios oferecem uma representação clara e atraente dos dados aos usuários..</p>

</details>

<details>
<summary>Back-End</summary>

  ### Código de Download
    class Automacao:

    logging.basicConfig(filename="log.txt", level=logging.DEBUG,
                        format="%(asctime)s %(message)s", filemode="a")

    def download_df(self, ano: int):
        url = "https://portal.inmet.gov.br/uploads/dadoshistoricos/{}.zip".format(ano)
        endereco = os.path.join("DF","{}.zip".format(ano))
        try:
            os.mkdir("DF/{}".format(ano))   
        except:
            shutil.rmtree(f"DF/{ano}", ignore_errors=False, onerror=None)
            os.mkdir("DF/{}".format(ano))

        status = requests.get(url)

        if status.status_code == requests.codes.OK:
            with open(endereco, "wb") as novo_arquivo:
                novo_arquivo.write(status.content) 
        else:
            status.raise_for_status()
        return

 Esse método baixa um arquivo ZIP de dados históricos de uma URL com base em um ano fornecido como parâmetro. Ele cria um diretório específico para o ano, excluindo-o primeiro se já existir. O arquivo baixado é salvo nesse diretório. O código também registra informações sobre a execução em um arquivo de log chamado "log.txt".

    def extract(self, ano: int):
        zip_ref = zipfile.ZipFile("DF/{}.zip".format(ano), "r")
        reference = ("DF/{}".format(ano))
        zip_ref.extractall(reference)
        zip_ref.close()
        os.remove("DF/{}.zip".format(ano))
        print("{} Extraido".format(ano))
        return

Ao chamar esse método, os arquivos contidos no arquivo ZIP são extraídos e colocados no diretório específico, facilitando o acesso e a manipulação desses arquivos. A remoção do arquivo ZIP economiza espaço em disco, já que os arquivos já foram extraídos.

Essa funcionalidade pode ser útil em cenários onde você precisa processar ou analisar os dados contidos nos arquivos ZIP baixados, e a extração automatizada simplifica o processo, economizando tempo e esforço.
  
    @staticmethod
    def auto_run():

        auto = Automacao()
    
        # Criando a variavel do ano atual 
        date_td = date.today()
        year_td = date_td.year

        # Para cada ano de 2020 até o ano atual executar o codigo
        for i in range(2020, year_td + 1):
            try:
  
                auto.download_df(i)
  
O método estático auto_run cria uma instância da classe Automacao e, em seguida, percorre um loop para executar o método download_df para cada ano de 2020 até o ano atual. Isso automatiza o processo de download dos arquivos ZIP de dados históricos para cada ano, facilitando a execução em lote e evitando a necessidade de chamar manualmente o método download_df para cada ano individualmente.
              
  ### Encriptação da senha do cadastro de Usuário
  
  
Implementei a criptografia de senhas em um aplicativo Spring Boot usando o Spring Security. Utilizei o algoritmo BCrypt para codificar as senhas, garantindo a segurança dos dados. Armazenei as senhas codificadas no banco de dados e, ao fazer login, o Spring Security compara a senha fornecida com a senha codificada para autenticar os usuários. Isso garante a proteção das senhas e a segurança das informações dos usuários.
 
  ### Mapeamento das Tabelas do banco
  
  Implementei o mapeamento das tabelas do banco de dados em um aplicativo Spring Boot usando o Spring Data JPA. Defini entidades Java anotadas com @Entity para representar as tabelas. Utilizei anotações como @Column, @Id, @GeneratedValue, @OneToOne, @OneToMany para mapear as colunas e relacionamentos entre as tabelas. Criei interfaces de repositório estendendo JpaRepository para executar operações CRUD. Configurei o provedor de persistência no arquivo application.properties ou application.yml. Durante a inicialização do aplicativo, o Spring Data JPA cria automaticamente as tabelas com base nas entidades definidas. Agora posso interagir com o banco de dados facilmente usando os métodos fornecidos pelos repositórios.
  
  
  
</details>

## Aprendizados Efetivos

### 1.Spring Boot
* No meu primeiro contato com o Spring Boot, aprendi várias coisas incríveis. Primeiramente, descobri que ele possui uma configuração automática muito poderosa. Fiquei impressionado com a facilidade de iniciar um projeto, pois muitas configurações são feitas automaticamente com base nas dependências que adicionamos.
* Também aprendi sobre o gerenciamento de dependências com o Maven ou Gradle. O Spring Boot simplifica bastante o processo de inclusão de bibliotecas e garante a compatibilidade das versões automaticamente. 
* Outro conceito fundamental que aprendi foi a injeção de dependência. O Spring Boot utiliza esse princípio do Spring Framework.
* Em resumo, minha experiência com o Spring Boot foi incrível. Aprendi sobre a configuração automática, o desenvolvimento ágil, o gerenciamento de dependências, a injeção de dependência, a criação de endpoints RESTful.

### 2.Download PDF

* Utilizar a biblioteca requests para fazer solicitações HTTP e verificar o status da resposta.
* Utilizar a biblioteca zipfile para extrair o conteúdo de arquivos ZIP.
* Utilizar a biblioteca os para criar diretórios e excluir diretórios existentes.
* Utilizar a biblioteca shutil para remover diretórios existentes, mesmo que contenham arquivos.
* Utilizar a biblioteca logging para registrar informações de execução em um arquivo de log.
* Criar métodos em uma classe para encapsular e reutilizar funcionalidades relacionadas.
* Utilizar métodos estáticos para criar um ponto de entrada para a execução automatizada do código.
* Utilizar loops para iterar sobre uma sequência de valores (no caso, anos) e executar determinado código para cada valor.
* Utilizar exceções para lidar com erros e garantir a continuidade do programa mesmo quando ocorrem problemas.

### 3.Encriptação da senha do cadastro de Usuário
* Importância da segurança das senhas dos usuários.
* Utilização do Spring Security para proteger o acesso aos recursos do aplicativo.
* Utilização do algoritmo BCrypt para codificar e comparar senhas.
* Necessidade de armazenar senhas codificadas no banco de dados.
* Importância da segurança dos dados sensíveis dos usuários.
* Boas práticas de segurança ao trabalhar com senhas e informações confidenciais.
* Autenticação de usuários com base na comparação de senhas codificadas.

### 4.Mapeamento das Tabelas do banco

* Com o Spring JPA, aprendi a mapear as tabelas do meu banco de dados com facilidade. Descobri que posso usar anotações como @Entity, @Table, @Column e @Id para definir como minhas entidades Java serão persistidas no banco de dados.

* Além disso, aprendi como mapear relacionamentos entre as entidades, como um-para-um, um-para-muitos e muitos-para-muitos. Usando anotações como @OneToOne, @OneToMany e @ManyToMany, consigo definir esses relacionamentos e deixar que o JPA cuide das associações no banco de dados.

* Outra coisa interessante é que o Spring JPA me permite definir chaves primárias e identificadores usando a anotação @Id. Aprendi sobre diferentes estratégias de geração de identificadores, como @GeneratedValue e @SequenceGenerator, o que me dá flexibilidade ao lidar com as chaves primárias das minhas entidades.

* Com relação às consultas, descobri que posso escrever consultas personalizadas usando a linguagem JPQL ou consultas nativas SQL. Para isso, basta utilizar as anotações @Query e @NamedQuery. Isso me proporciona flexibilidade para realizar consultas complexas de maneira eficiente.

  


## Tecnologias utilizadas:

<details>
<summary>Front-End</summary>

* [JavaScript](https://www.javascript.com)
* [HTML](https://www.w3schools.com/css/)
* [CSS](https://www.w3schools.com/css/)
 

</details>

<details>
<summary>Back-End</summary>

* [Java](https://www.java.com/pt-BR/?msclkid=7faa842eb8f811ecab39772d4c1ae90b)
 
* [Python](https://www.python.org/downloads/)

* [Spring boot](https://spring.io/projects/spring-boot)

</details>

<details>
<summary>Banco de Dados</summary>

* [PostgreSQL](https://www.postgresql.org/download/)
</details>
<details>
<summary>Reuniões e Comunicação</summary>

* [Discord](https://discord.com/?msclkid=b4f5af84b8f811ecbd81c127a0ae68a7)

* [Whatsapp](https://www.whatsapp.com/)

* [Slack](https://slack.com/intl/pt-br/?msclkid=c00e628eb8f811ecaef374bb86d7f056)
</details>

<details>
<summary>Outras Ferramentas</summary>

* [Github](https://github.com/)

* [Eclipse IDE](https://www.eclipse.org/downloads/)

* [IntelliJ IDE](https://www.jetbrains.com/idea/promo/?msclkid=6ae44e88c2811d86c0ae2cdbd94ffcfb&utm_source=bing&utm_medium=cpc&utm_campaign=AMER_en_BR_IDEA_Branded&utm_term=intellij&utm_content=intellij%20idea)

* [Azure DevOps](https://dev.azure.com/iacitAPI/iacitAPI/)

* [Photoshop](https://www.adobe.com/br/products/photoshop.html?sdid=KQPOM&mv=search&ef_id=d67181c6b224183a4875e395ae54f4bf:G:s&s_kwcid=AL!3085!10!79302406606568!79302288716688&msclkid=d67181c6b224183a4875e395ae54f4bf)
</details>
