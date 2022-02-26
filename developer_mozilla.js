/* Criando uma array.
let frutas = ["Pera", "Morango", "Pitaya"];
*/

let frutas = ["Morango", "Pitaya", "Abacate"];
//console.log(frutas.length);

let primeiro = frutas[0];
let ultimo = frutas[frutas.length - 1];
//console.log(primeiro);
//console.log(ultimo);

frutas.forEach(function(item, indice, frutas) {
    console.log(item, indice);
});
/** 
//for (let i = 0; i < frutas.length; i++) {
    console.log(frutas[i] + " " + i);
}
*/
let adicionar = frutas.push("Caju");
console.log(frutas);
frutas.pop();
console.log(frutas);
let frutaRemovida = frutas.shift();
console.log(frutas);
console.log(" A fruta removida foi " + frutaRemovida);
frutas.push("Uva");
console.log(frutas);
let pos = frutas.indexOf("Abacate");
console.log("indexof de Abacate é " + pos);
let removedItem = frutas.splice(pos, 1);
console.log(frutas);