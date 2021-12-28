<h1 align="center">:file_cabinet: Programa Formação em SalesForce :computer: :rocket: </h1>

<h1 align="center">
<img src="https://w7.pngwing.com/pngs/352/457/png-transparent-logo-organization-brand-infojobs-others-blue-text-logo.png"  alt="Foto Logo"/><br>
  </div>

## :memo: Desafios em JAVA:
>## 1 - Escreva um método que faça a encriptação de uma senha trocando cada letra que aparece na sequencia
abaixo pelo índice da sequência.
Sequência = ‘acdfgijloprtuvx’
         Entrada        |      Saída
Luiza                   |     L125z0
Florianópolis           |  F781050nó9875s

>## 2 - Quadrado Mágico é uma tabela quadrada de números em progressão aritmética em que a soma de cada
coluna, de cada linha e das duas diagonais são iguais (Wikipédia). Crie um método que receba uma
matriz bidimensional e valide se é um quadrado mágico.

Somatório de todos os lados: 15

Quadrado: 4 | 9 | 2
          3 | 5 | 7
          8 | 1 | 6

>## 2 - Encontre uma palavra de 7 letras que contenha apenas as letras ‘bdeginoprstuw’ de forma que
hash(string) é 687759396014. Onde o hash é definido pelo seguinte código:

private static final int HASH = 7;
private static final int FACTOR = 37;
private static final String LETTERS = "bdeginoprstuw";
private static long getHash( String s )
{
long h = HASH;
int lLen = s.length();
for ( int i = 0; i < lLen; i ++ )
h = h * FACTOR + LETTERS.indexOf( s.charAt( i ) );
return h;
}

<br>

[⬆ Voltar ao topo](#nome-do-projeto)<br>
