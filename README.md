# Biblioteca

Um sistema de gerenciamento de biblioteca que permite o empréstimo e devolução de livros, criado
para fixar os conhecimentos sobre testes JUnit e organização de dependencias com Maven.

## Instalação

Instalação e Inicialização de um Projeto Maven com JUnit
1. Instalar Maven
    - Windows: Baixe o Maven do site oficial Apache Maven e siga as instruções de instalação.
2. Criar um Novo Projeto Maven
    - Abra o terminal e execute o comando abaixo para criar um novo projeto Maven:
      ```
      mvn archetype:generate -DgroupId=com.exemplo.biblioteca -DartifactId=biblioteca -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
      ```
3. Estrutura do Projeto
    - Após a criação, a estrutura do projeto será:
      biblioteca
      ```
      ├── src
      │   ├── main
      │   │   └── java
      │   │       └── com
      │   │           └── exemplo
      │   │               └── biblioteca
      │   │                   └── App.java
      │   └── test
      │       └── java
      │           └── com
      │               └── exemplo
      │                   └── biblioteca
      │                       └── AppTest.java
      ├── pom.xml
      └── ...
      ```
4. Configurar JUnit no pom.xml
   - Abra o arquivo pom.xml e adicione a dependência do JUnit:
   ```
   <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>
    <groupId>com.exemplo.biblioteca</groupId>
    <artifactId>biblioteca</artifactId>
    <version>1.0-SNAPSHOT</version>
    <dependencies>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
   </project>
   ```
5. Executar o Projeto
   - Para compilar e executar o projeto, use os comandos:
   ```
   mvn compile
   mvn exec:java -Dexec.mainClass="com.exemplo.biblioteca.App"
   ```
6. Executar os Testes
   - Para rodar os testes, use o comando:
   ```
   mvn test
   ```
## Exemplos de uso   
- Testar Inicializar Biblioteca
  ```
  @Test
  public void testInicializarBiblioteca() {
    Biblioteca biblioteca = App.inicializarBiblioteca();
    assertNotNull(biblioteca);
    assertEquals(2, biblioteca.getLivros().size());
  }
  ```
