
# Trabalhando com List

***Mentora:*** [Camilla Calvacante](https://www.linkedin.com/in/cami-la/)

***Curso:*** [DIO Bootcamp Claro - Java Spring Boot](https://web.dio.me/track/2e52ad2d-0a3b-4ade-a4ae-17830f528834)

***Repositório GitHub:*** [collections-java-api-2023](https://github.com/cami-la/collections-java-api-2023)

## Estrutura dos arquivos

Ao decorrer das pastas foram realizadas diversas atividades em torno do uso dos utilitários `List` e ``ArrayList``, `Comparable`, ``Comparator`` e ``Collections``. As atividades foram organizadas em packages para cada um dos conteúdos:

- OperacoesBasicas
- Ordenacao
- Pesquisa

Para as atividades **<u>OperacoesBasicas</u>** foi realizado cada classe solicitada no projeto e utilizada no arquivo `Dicionario.java`.

Ja as atividades do package **<u>Pesquisa</u>** foi realizado a criação da classe e do main executor no mesmo arquivo `EstoqueProduto` e `ContagemPalavras`.

Por fim a **<u>Ordenacao</u>** foram criados packages específicos a cada atividade. A classe executora main fica localizada ao final de todos os arquivos que possuem final `[Nome]Ordenacao.java`.
O **Comparator personalizado** fica localizado no fim da classe `LivrariaOnline.java`.


## Operações Básicas com List


### 2.  Dicionário

<p>
Crie uma classe chamada "Dicionario" que utilize um Map para armazenar palavras e suas respectivas definições. Implemente os seguintes métodos:

- `adicionarPalavra(String palavra, String definicao)`: Adiciona uma palavra e sua definição ao dicionário, associando a palavra à sua definição correspondente.
- `removerPalavra(String palavra)`: Remove uma palavra do dicionário, dado o termo a ser removido.
- `exibirPalavras()`: Exibe todas as palavras e suas definições do dicionário, mostrando cada palavra seguida de sua respectiva definição.
- `pesquisarPorPalavra(String palavra)`: Pesquisa uma palavra no dicionário e retorna sua definição correspondente.
</p>


## Pesquisa em List

### 1. Estoque de Produtos com Preço

<p>
Crie uma classe chamada "EstoqueProdutos" que utilize um Map para armazenar os produtos, suas quantidades em estoque e seus respectivos preços. Cada produto possui um código como chave e um objeto Produto como valor, contendo nome, quantidade e preço. Implemente os seguintes métodos:

- `adicionarProduto(long cod, String nome, int quantidade, double preco)`: Adiciona um produto ao estoque, juntamente com a quantidade disponível e o preço.
- `exibirProdutos()`: Exibe todos os produtos, suas quantidades em estoque e preços.
- `calcularValorTotalEstoque()`: Calcula e retorna o valor total do estoque, considerando a quantidade e o preço de cada produto.
- `obterProdutoMaisCaro()`: Retorna o produto mais caro do estoque, ou seja, aquele com o maior preço.
- `obterProdutoMaisBarato()`: Retorna o produto mais barato do estoque, ou seja, aquele com o menor preço.
- `obterProdutoMaiorQuantidadeValorTotalNoEstoque()`: Retorna o produto que está em maior quantidade no estoque, considerando o valor total de cada produto (quantidade * preço).
</p>

### 2. Contagem de Palavras

<p>
Crie uma classe chamada "ContagemPalavras" que utilize um Map para armazenar as palavras e a quantidade de vezes que cada palavra aparece em um texto. Implemente os seguintes métodos:

- `adicionarPalavra(String palavra, Integer contagem)`: Adiciona uma palavra à contagem.
- `removerPalavra(String palavra)`: Remove uma palavra da contagem, se estiver presente.
- `exibirContagemPalavras()`: Exibe todas as palavras e suas respectivas contagens.
- `encontrarPalavraMaisFrequente()`: Encontra a palavra mais frequente no texto e retorna a palavra e sua contagem.
</p>


## Ordenação em List

### 1. Livraria Online

<p>
Crie uma classe chamada "LivrariaOnline" que representa uma livraria online. Essa classe utiliza um Map para armazenar os livros disponíveis na livraria, utilizando o link da obra na Amazon Marketplace como chave e um objeto da classe "Livro" como valor. A classe "Livro" possui atributos como título, autor e preço. Através da classe "LivrariaOnline", implemente os seguintes métodos:

- `adicionarLivro(String link, String titulo, String autor, private double preco)`: Adiciona um livro à livraria, utilizando o ISBN como chave no Map.
- `removerLivro(String titulo)`: Remove um livro da livraria, dado o titulo do livro.
- `exibirLivrosOrdenadosPorPreco()`: Exibe os livros da livraria em ordem crescente de preço.
- `pesquisarLivrosPorAutor(String autor)`: Retorna uma lista de todos os livros escritos por um determinado autor.
- `obterLivroMaisCaro()`: Retorna o livro mais caro disponível na livraria.
- `exibirLivroMaisBarato()`: Retorna o livro mais barato disponível na livraria.
</p>
