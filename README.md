# Lista04Programa06

Este programa em Java lê notas de alunos inseridas pelo usuário e calcula estatísticas como:

- Média das notas
- Maior nota
- Menor nota
- Quantidade de aprovados
- Quantidade em recuperação
- Quantidade de reprovados

A entrada das notas continua até que o usuário digite **-1**, indicando o fim da leitura.

---

## 🧠 Funcionamento do Programa

1. O usuário digita várias notas entre **0 e 100**.
2. Notas inválidas são ignoradas.
3. A classificação de cada aluno segue as regras:
   - **Aprovado:** nota ≥ 70  
   - **Recuperação:** nota ≥ 40 e < 70  
   - **Reprovado:** nota < 40
4. Ao final, o programa exibe:
   - Média das notas
   - Maior nota
   - Menor nota
   - Totais de aprovados, recuperação e reprovados

---

## ▶️ Como executar

1. Certifique-se de ter o **Java instalado**.
2. Compile o arquivo:

```bash
javac Lista04Programa06.java
