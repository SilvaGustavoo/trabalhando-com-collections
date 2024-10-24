
# Trabalhando com Set

***Mentora:*** [Camilla Calvacante](https://www.linkedin.com/in/cami-la/)

***Curso:*** [DIO Bootcamp Claro - Java Spring Boot](https://web.dio.me/track/2e52ad2d-0a3b-4ade-a4ae-17830f528834)

***Repositório GitHub:*** [collections-java-api-2023](https://github.com/cami-la/collections-java-api-2023)

## Estrutura dos arquivos

Ao decorrer das pastas foram realizadas diversas atividades em torno do uso dos utilitários `List` e ``ArrayList``, `Comparable`, ``Comparator`` e ``Collections``. As atividades foram organizadas em packages para cada um dos conteúdos:

- OperacoesBasicas
- Ordenacao
- Pesquisa

Para as atividades **<u>OperacoesBasicas</u>** foi realizado cada uma das classes solicitadas no projeto e utilizadas no arquivo `Main.java`.

Ja as atividades do package **<u>Pesquisa</u>** foi realizado a criação da classe e do main executor no mesmo arquivo `SomaNumeros`.

Por fim a **<u>Ordenacao</u>** foram criados packages específicos a cada atividade. A classe executora main fica localizada ao final de todos os arquivos que possuem final `[Nome]Ordenacao.java`.
O **Comparator personalizado** fica localizado no fim das classes auxiliares, como, `Produto.java`e `Funcionario.java`


## Operações Básicas com List

### 1. Lista de Tarefas
<p>Crie uma classe chamada "ListaTarefas" que possui uma lista de tarefas como atributo. Cada tarefa é representada por uma classe chamada "Tarefa" que possui um atributo de descrição. Implemente os seguintes métodos:

- `adicionarTarefa(String descricao)`: Adiciona uma nova tarefa à lista com a descrição fornecida.
- `removerTarefa(String descricao)`: Remove uma tarefa da lista com base em sua descrição.
- `obterNumeroTotalTarefas()`: Retorna o número total de tarefas na lista.
- `obterDescricoesTarefas()`: Retorna uma lista contendo a descrição de todas as tarefas na lista.
</p>

### 2. Carrinho de Compras:

<p>Crie uma classe chamada "CarrinhoDeCompras" que representa um carrinho de compras online. O carrinho deve ser implementado como uma lista de itens. Cada item é representado por uma classe chamada "Item" que possui atributos como nome, preço e quantidade. Implemente os seguintes métodos:

- `adicionarItem(String nome, double preco, int quantidade)`: Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
- `removerItem(String nome)`: Remove um item do carrinho com base no seu nome.
- `calcularValorTotal()`: Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
- `exibirItens()`: Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.
</p>



## Pesquisa em List

### 1. Soma de Números

<p>Crie uma classe chamada "SomaNumeros" que possui uma lista de números inteiros como atributo. Implemente os seguintes métodos:

- `adicionarNumero(int numero)`: Adiciona um número à lista de números.
- `calcularSoma()`: Calcula a soma de todos os números na lista e retorna o resultado.
- `encontrarMaiorNumero()`: Encontra o maior número na lista e retorna o valor.
- `encontrarMenorNumero()`: Encontra o menor número na lista e retorna o valor.
- `exibirNumeros()`: Retorna uma lista contendo todos os números presentes na lista.



## Ordenação em List

### 1. Ordenação de Funcionários

<p>Crie uma classe chamada "OrdenacaoFuncionario" que possui uma lista de objetos do tipo "Funcionario" como atributo. Cada funcionario possui atributos como nome, idade e cargo. Implemente os seguintes métodos:

- `adicionarFuncionario(String nome, int idade, String cargo)`: Adiciona um funcionário à lista.
- `getFuncionariosOrdenadosPorIdade()`: Ordena os funcionários da lista por idade usando a interface Comparable.
- `getFuncionariosOrdenadosPorNome()`: Ordena os funcionários da lista em ordem alfabética usando um Comparator personalizado.
</p>

### 2. Ordenação de Números

<p>Crie uma classe chamada "OrdenacaoNumeros" que possui uma lista de números inteiros como atributo. Implemente os seguintes métodos:

- `adicionarNumero(int numero)`: Adiciona um número à lista.
- `ordenarAscendente()`: Ordena os números da lista em ordem ascendente usando a interface Comparable e a class Collections.
- `ordenarDescendente()`: Ordena os números da lista em ordem descendente usando um Comparable e a class Collections.
</p>

### 3. Organizando Produtos

<p>Crie uma classe chamada "OrdenacaoProduto" que possui uma lista de objetos do tipo "Produto" como atributo. Cada produto possui como atributos nome, preço e código de barras. Implemente os seguintes métodos:

- `adicionarProduto(String nome, double preco, String codBarra)`: Adiciona um produto à lista.
- `getProdutosOrdenadosPorNome`: Ordena os produtos da lista em ordem alfabética usando um Comparator personalizado.
- `getProdutosOrdenadosPorPreco`: Ordena os produtos da lista em ordem ascendente usando um Comparable e a class Collections.
- `getProdutosOrdenadosPorCodBarra`: Ordena os produtos da lista em ordem alfanumérica usando um Comparator personalizado.
</p>