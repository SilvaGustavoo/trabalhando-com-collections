
# Trabalhando com List

***Mentora:*** [Camilla Calvacante](https://www.linkedin.com/in/cami-la/)

***Curso:*** [DIO Bootcamp Claro - Java Spring Boot](https://web.dio.me/track/2e52ad2d-0a3b-4ade-a4ae-17830f528834)

***Repositório GitHub:*** [collections-java-api-2023](https://github.com/cami-la/collections-java-api-2023)

## Estrutura dos arquivos

Ao decorrer das pastas foram realizadas diversas atividades em torno do uso dos utilitários `List` e ``ArrayList``, `Comparable`, ``Comparator`` e ``Collections``. As atividades foram organizadas em packages para cada um dos conteúdos:

- OperacoesBasicas
- Ordenacao
- Pesquisa

Para as atividades **<u>OperacoesBasicas</u>** foi realizado a classes solicitadas no projeto e utilizada no arquivo `ConjuntoPalavrasUnicas.java`.

Ja as atividades do package **<u>Pesquisa</u>** foi realizado a criação da classe e do main executor no mesmo arquivo `ListaTarefa`.

Por fim a **<u>Ordenacao</u>** possui a classe executora main localizada diretamente no arquivo `GerenciadorAlunos.java`.
Os **Comparators personalizados** estão localizados na classe auxiliar  `Comparators.java`.


## Operações Básicas com Set

### 1. Conjunto de Palavras Únicas

<p>
Crie uma classe chamada "ConjuntoPalavrasUnicas" que possui um conjunto de palavras únicas como atributo. Implemente os seguintes métodos:

- `adicionarPalavra(String palavra)`: Adiciona uma palavra ao conjunto.
- `removerPalavra(String palavra)`: Remove uma palavra do conjunto.
- `verificarPalavra(String palavra)`: Verifica se uma palavra está presente no conjunto.
- `exibirPalavrasUnicas()`: Exibe todas as palavras únicas do conjunto.
</p>


## Pesquisa em Set


### 1. Lista de Tarefas

<p>
Crie uma classe chamada "ListaTarefas" que possui um conjunto de objetos do tipo "Tarefa" como atributo. Cada tarefa possui um atributo de descrição e um atributo booleano para indicar se a tarefa foi concluída ou não. Implemente os seguintes métodos:

- `adicionarTarefa(String descricao)`: Adiciona uma nova tarefa ao Set.
- `removerTarefa(String descricao)`: Remove uma tarefa do Set de acordo com a descrição, se estiver presente. 
- `exibirTarefas()`: Exibe todas as tarefas da lista de tarefas.
- `contarTarefas()`: Conta o número total de tarefas na lista de tarefas.
- `obterTarefasConcluidas()`: Retorna um Set com as tarefas concluídas.
- `obterTarefasPendentes()`: Retorna um Set com as tarefas pendentes.
- `marcarTarefaConcluida(String descricao)`: Marca uma tarefa como concluída de acordo com a descrição.
- `marcarTarefaPendente(String descricao)`: Marca uma tarefa como pendente de acordo com a descrição.
- `limparListaTarefas()`: Remove todas as tarefas da lista de tarefas.
</p>


## Ordenação em Set

### 1. Lista de Alunos

<p>
Crie uma classe chamada "GerenciadorAlunos" que irá lidar com uma lista de alunos. Cada aluno terá atributos como nome, matrícula e nota. Implementaremos os seguintes métodos:

- `adicionarAluno(String nome, Long matricula, double media)`: Adiciona um aluno ao conjunto.
- `removerAluno(long matricula)`: Remove um aluno ao conjunto a partir da matricula, se estiver presente.
- `exibirAlunosPorNome()`: Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
- `exibirAlunosPorNota()`: Exibe todos os alunos do conjunto em ordem crescente de nota.
- `exibirAlunos()`: Exibe todos os alunos do conjunto.
</p>