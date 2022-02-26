/**let a = 11;
let b = 20;


if (a > 10) {
    console.log(resultSomaGrande(a, b));

} else {
    console.log(resultSoma(a, b));

}


function resultSoma(param1, param2) {
    let result = param1 + param2;

    if (result > 20) {
        return "Puxa esse numero é grande"
    } else {
        return "Ahh é pequeno"
    }

}


function resultSomaGrande(param1, param2) {
    let result = param1 + param2;

    if (result > 20) {
        return "Puxa como é muuuuiiitoooo grande "
    } else {
        return "Ahh é pequeno demassssiiiiiii"
    }

}
**/



/* Declare a função 'minhaFunção' */
function minhaFuncao(objeto) {
    objeto.marca = "Toyota";
}

/*
 * Declare a variável 'meucarro';
 * crie e inicialize um novo Objeto;
 * atribua referência para 'meucarro'
 */
var meucarro = {
    marca: "Honda",
    modelo: "Accord",
    ano: 1998
};

/* Exibe 'Honda' */
console.log(meucarro.marca);

/* Passe a referência do objeto para a função */
this.minhaFuncao(meucarro);

/*
 * Exibe 'Toyota' como valor para a propriedade 'marca'
 * do objeto, mudado pela função.
 */
console.log(meucarro.marca);