/*
3 notas
>7 chama função escreva "Reprovado"
<9 chama função escreva " Aprovado"
>9 chama função escreva " Aprovado com louvor"
*/

let notaUm = 10;
let notaDois = 10;
let notaTres = 10;

calcMedia(notaUm, notaDois, notaTres);


function calcMedia(param1, param2, param3) {
    let result = (param1 + param2 + param3) / 3;

    if (result < 7) {
        mediaRep(result)
    } else if (result > 7 && result < 9) {
        mediaAp(result)
    } else {
        mediaApp(result)
    }


}

function mediaRep(media) {
    console.log("Reprovado " + media);
}

function mediaAp(media) {
    console.log("Aprovado " + media);
}

function mediaApp(media) {
    console.log("Approvadoo " + media);
}