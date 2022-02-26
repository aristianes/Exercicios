/*
custo final = custo de fábrica +
              (custo de fábrica * percentual do distribuidor) +
              (custo de fábrica * percentual de impostos)
Custo de fábrica = 10.000,00
Percentual do distribuidor = 28%
Percentual dos Impostos  = 45%



let custoFinal = 0;
let custoFabrica = 10000;
let custoDistribuidor = 28;
let custoImpostos = 45;

custoFinal = custoFabrica + (custoFabrica * custoDistribuidor / 100) + (custoFabrica * custoImpostos / 100);
console.log("Valor " + custoFinal);


**NOVO **

Exercício de lógica de programação
Crie duas funções para conversão de temperaturas.

Uma converterá celsius em fahrenheit e a outra fará o inverso.

Saiba que 100c é igual a 212f, veja fórmula:

 C          F - 32
-------  =  ---------
   5            9



let c = 100;
let qdtF = 0;
let f = 0;


qdtF = c / 5 * 9 + 32;
console.log("Resultado " + qdtF + "F ");


** NOVO **

5 * (fahrenheit - 32) / 9;
*/

let f = 212;
let qdtF = 0;
let c = 0;
console.log(5 * (f - 32) / 9);
qdtF = 5 * (f - 32) / 9;
console.log("Resultado " + qdtF);