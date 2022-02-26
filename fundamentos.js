/**
 * Nesse cenário recebemos 2 notas, e após achar a média entre eles temos o resultado:
 *  Média maior que 7 e menor que 9.5 --> Aluno Aprovado
 *  Média maior que 9.5 --> Aprovado com Excelencia
 *  Média menor que 7 --> Aluno Reprovado 
 */


let nota1 = 10;
let nota2 = 1;

let media = (nota1 + nota2) / 2;

if (media >= 7 && media <= 9.5) {
    console.log("Aluno Aprovado  com a média: " + media + " parabéns nos vemos ano que vem");
} else if (media > 9.5) {
    console.log("Aluno aprovado com louvor com a média : " + media + " parabens você foi excelente");
} else {
    console.log("Aluno reprovado com a média: " + media + " ano que vem você repetirá de ano");


}