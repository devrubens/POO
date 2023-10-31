
---

# SISHora

Sistema de Gerenciamento de Atividades Complementares como trabalho para conclusão da primeira etapa do semetre da disciplina de Programação Orientada a Objetos (POO), ministrada pelo Prof.Me Raphael Torres do IFCE _campus_ Canindé.


## Contextualização

O estudo de programação de computadores é uma atividade desafiadora para a ampla maioria dos alunos. Para alcançar um bom nível de maturidade em programação, os estudantes tipicamente necessitam desenvolver um conjunto bastante amplo de programas. Quanto maior a exposição do estudante a problemas, preferencialmente com níveis de complexidade distintos, maior tende a ser o acúmulo de experiências e, consequentemente, sua desenvoltura em programação.

O coordenador do curso de Análise e Desenvolvimento de Sistemas deseja implementar um programa para auxiliá-lo no gerenciamento das atividades complementares dos alunos do curso. O professor deseja que os alunos da disciplina de Programação Orientada a Objetos desenvolvam um programa que permita que o aluno cadastre suas atividades para que o coordenador valide o aproveitamento.

Propõe-se este trabalho, portanto, como mais uma ação da trajetória de formação discente em programação de computadores, partindo de situações reais presentes em algum ramo da computação.

## Objetivos

Implementar um programa orientado a objetos, em linguagem Java, com as funcionalidades listadas a seguir. O programa principal deve ter uma interface que permite apresentar as
funcionalidades a seguir em um formato de menu. Devem ser criada as classes, com os respectivos atributos e métodos, que permitam implementar as funcionalidades abaixo:

1. **Cadastrar Aluno:** Permite cadastrar um novo aluno informando nome completo, matrícula e curso.

2. **Cadastrar Atividade:** Permite cadastrar uma nova atividade complementar vinculada a um aluno. Informações como grupo de atividade e descrição são necessárias.

3. **Visualizar atividades a partir da matrícula:** Permite pesquisar e visualizar todas as atividades cadastradas para um aluno específico usando a matrícula.

4. **Alterar status de aproveitamento da atividade:** Permite alterar o status de aproveitamento de uma atividade, marcando-a como aprovada ou não aprovada e preenchendo a carga horária considerada.

5. **Mostrar carga horária total das atividades complementares dos alunos:** Exibe a carga horária total das atividades complementares de todos os alunos cadastrados.

6. **Mostrar carga horária total das atividades complementares de um aluno:** Permite pesquisar e visualizar a carga horária total das atividades complementares de um aluno específico usando a matrícula.

## Como Usar

1. **Pré-requisitos:**
   - Java instalado
   - Terminal de linha de comando

2. **Clone o repositório:**
   ```bash
   git clone https://github.com/devrubens/POO.git

   git checkout trabalhon1
   ```

3. **Execute o programa:**
   ```bash
   cd POO
   javac App.java
   java App
   ```
