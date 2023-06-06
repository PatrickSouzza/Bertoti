# Portifólio - Patrick Souza
<div align="center">
<img src="https://raw.githubusercontent.com/PatrickSouzza/Bertoti/main/Metodologia/WhatsApp%20Image%202023-05-28%20at%2012.24.29.jpeg" height="500"/>
</div>

## Introdução
24 anos, estudante do 4º semestre de Banco de Dados pela FATEC de São José dos Campos (Prof. Jessen Vidal) onde por meio de seu projeto integrador que é feito em conjunto com diversas empresas, pude ter contato com clientes e desafios reais que afetam não só empresas de pequeno porte mas até mesmo as multinacionais.
Ao longo destes 4 semestres venho desenvolvendo não apenas as Hard Skill's mas também as Soft Skill's tendo trabalhado grande parte do tempo em equipes de Metodologia Ágil.

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

* Utilizo banco de dados desde 2021, já utilizei mySQL, PostgreeSQL, MariaDB e Oracle. Tenho conhecimentos em comandos DDL, DCL e DML. Tenho Experiência desenvolvendo tabelas, realizando inserção de novos registros, estabelecendo restrições e estipulando diretrizes no banco de dados, além de desempenhar funções administrativas essenciais para sua gestão eficiente.

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
