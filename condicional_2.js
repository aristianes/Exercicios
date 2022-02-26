/*
Receber 4 notas
calcular a media
se a media > 9 escrever " Aprovado com louvor + nota"
se a media > 7 e < 9  escrever " aprovado"

*/

let nota_1;
let nota_2;
let nota_3;
let nota_4;
let media;

nota_1 = 7;
nota_2 = 3;
nota_3 = 7;
nota_4 = 7;
media = (nota_1 + nota_2 + nota_3 + nota_4) / 4;
if (media > 9) {
    console.log(" Aprovado com louvor " + media);
}
if (media >= 7 && media < 9) {
    console.log("Aprovado " + media);
} else {
    console.log(" Reprovado " + media);
}