/**
 * Uma dica importante os 2 exercicios acima irão utilizar a estrutura 
 * 
 * if(condicional com &&  segunda condicional){// Se aqui for verdadeiro ele entra na linha abaixo e ignora o restante
 * 
 * } else if (condicional && segunda condicional) { Se chegar aqui significa que a condição acima foi falsa, 
 *  Se entrar aqui significa que o IF Else foi verdadeiro
 * } else {
 *     só entrará aqui se as 2 condicões acima forem falsa
 * }
 * 
 * 
 * Ou seja:
 * - entrará no if se a condição de entrada for verdadeira, caso entre os outros testes serão ignorados 
 * - irá ***TESTAR**** o if else se o if for falso, caso a condiçaõ seja verdadeiro ele entra e ignora o else, se for falso ele entrará no else sem testar
 * - irá ***ENTRAR*** no Else se o if e o if else não for verdadeiro
 */


if (condicao && segunda_condicao) {
    entra aqui se verdadeiro
} else if (condicao && segunda_condicao) { //só irá testar se o if acima der falso, caso contrário será ignorado
    entra aqui se a linha 43 der verdadeiro
} else { // só chegará aqui se o if e o if else for falso
    //****Lembre-se o ELSE NÂO POSSUI TESTE ele entra sem perguntar, ele é o escape do if e do if else

}