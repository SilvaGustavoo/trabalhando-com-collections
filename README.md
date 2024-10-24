# Trabalhando com Collections e Ordenações

***Mentora:*** [Camilla Calvacante](https://www.linkedin.com/in/cami-la/)

***Curso:*** [DIO Bootcamp Claro - Java Spring Boot](https://web.dio.me/track/2e52ad2d-0a3b-4ade-a4ae-17830f528834)

***Repositório GitHub:*** [collections-java-api-2023](https://github.com/cami-la/collections-java-api-2023)

## Compreendendo o Projeto

Esse repositório foi utilizadoo para o aprendizado do uso das `Collections` e suas funcionalidades. Com diversos exerciocios resolvidos e pratica do inicio ao fim, o curso demonstrou a aplicabilidade das Interfaces `List`, `Set` e `Map` e suas situações de uso. Foram feitas ddiversas atividades onde estão organizadas nesse repositório ou no indicado acima. 

## Estrutura dos arquivos

Ao decorrer das pastas foram realizadas diversas atividades em torno do uso dos utilitários `List` e ``ArrayList``, `Set`, `HashSet`, `TreeSet`, `Map`, `HashMap`, `TreeMap`, `LinkedHashMap` , `Comparable`, ``Comparator`` e ``Collections``. As atividades foram organizadas em packages para cada um dos conteúdos:

- List
- Set
- Map

E para cada um desses packages existem atividades subdivididas em packages, sendo eles

- OperacoesBasicas
- Ordenacao
- Pesquisa

Para as atividades **<u>OperacoesBasicas</u>** foi realizado atividades propondo o uso das configurações basicas, como adicionar dados, edição da collections e manipulação de seus dados.

Ja as atividades do package **<u>Pesquisa</u>** ficavam em torno de realizar buscas de informações, onde cada collection tem sua maneira de busca mais adequada.

Por fim a **<u>Ordenacao</u>** como o nome ja diz foi explicado como realizar a ordenação das informações, de acordo com o que o usuário deseje. Para que fosse realizado as ordenações, foram usados as interfaces `Comparable` com o `CompareTo`, que dentro da classe referencia o atributo que será reallizado a ordem. E quando se necessita de mais de uma referência pode se utilizar um **Comparator personalizado** que assim é possivel realizar diversas ordenações de elementos, com a interface `Comparator` usado junto com o `Compare`.