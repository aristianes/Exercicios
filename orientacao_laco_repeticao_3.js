/**
 * laçõs de repetição são usados para percorrer uma lista ou repetir uma terefa quatas vezes for necessário
 * nesse caso vamos abordar o tipo FOR
 * 
 * sintaxe:
 * 
 * 
 * for(var i = 0; i< 10; i++){
 *  console.log("Quantas vezes vai repetir, nesse caso 10")
 * }
 * Nesse caso acima a repetição será de 0 a 9 (pq a condição de parada é i<10) logo:
 * 0,1,2,3,4,5,6,7,8,9 ****Não esqueça de 0 a 9 são 10 repetições 
 * a variável i só vale dentro do for (laço de repetição)
 *
 * 
 * let i = 0 - cria variável de controle deve iniciar em 0 ----- mais ;
 * i< valor_de_parada - ele vai rodar a quantidade que vc informou----- mais ;
 *  i++ incremento de 1 em 1 até o valor de parada
 */


for (let i = 0; i < 20; i++) {
    if (i % 2 === 0) {
        console.log("Esse numero é par: " + i);
    } else {
        console.log("Esse numero é impar: " + i);

    }
}