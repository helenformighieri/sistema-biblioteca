# Biblioteca

Um sistema de gerenciamento de biblioteca que permite o empréstimo e devolução de livros, criado
para fixar os conhecimentos sobre testes com JUnit e Mockito, instalação e organização de dependencias com Maven.

## Instalação

1. Instalação e Inicialização de um Projeto Maven com JUnit
   - Instalar Maven  
   - Windows: Baixe o Maven do site oficial Apache Maven e siga as instruções de instalação.
2. Criar um Novo Projeto Maven  
   - Abra o terminal e execute o comando abaixo para criar um novo projeto Maven:
   - mvn archetype:generate -DgroupId=com.exemplo.biblioteca -DartifactId=biblioteca -DarchetypeArtifactId=maven-archetype-quickstart -DinteractiveMode=false
   - Estrutura do Projeto
   ```
    Após a criação, a estrutura do projeto será: 
    biblioteca
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
3. Configurar JUnit e Mockito no pom.xml  
   - Abra o arquivo pom.xml e adicione as dependências do JUnit e Mockito:
   ```
    <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
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
      <dependency>
        <groupId>org.mockito</groupId>
        <artifactId>mockito-core</artifactId>
        <version>5.13.0</version>
        <scope>test</scope>
      </dependency>
      <dependency>
        <groupId>org.mockito</groupId>
        <artifactId>mockito-junit-jupiter</artifactId>
        <version>5.13.0</version>
        <scope>test</scope>
      </dependency>
    </dependencies>
    </project>
    ```
4. Atualizar o Projeto Maven  
   - No terminal, navegue até o diretório do seu projeto e execute o comando:
   ```
   mvn clean install
    ```
5. Configurar Mockito nas Classes de Teste  
   - Utilize a anotação @ExtendWith(MockitoExtension.class) para habilitar o suporte ao Mockito em suas classes de teste.
   - Exemplo de configuração em uma classe de teste:
   ```
   import org.junit.jupiter.api.extension.ExtendWith;
   import org.mockito.junit.jupiter.MockitoExtension;

   @ExtendWith(MockitoExtension.class)
   public class SeuTeste {
   // Seu código de teste aqui
   }
    ```
6. Criar Mocks e Usar Mockito  
   - Utilize as anotações @Mock para criar mocks e @InjectMocks para injetar mocks.
   - Exemplo:
   ```
   import org.mockito.Mock;
   import org.mockito.InjectMocks;

   public class SeuTeste {
     @Mock
     private Dependencia dependencia;

   @InjectMocks
     private ClasseTeste classeTeste;
     // Métodos de teste
   }
   ```
7. Executar o Projeto  
  - Para compilar e executar o projeto, use os comandos:
   ```
   mvn compile
   mvn exec:java -Dexec.mainClass="com.exemplo.biblioteca.App"
   ```
8. Executar os Testes
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
