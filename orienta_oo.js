/*
Orientação objeto --> quando vc se baseia no mundo real.
Quando vc quiser chamar algum item dentro da variavel, coloca-se "variavel. nome do atributo";
ex: let pessoa = {
    nome: "Aristiane",
    idade: 33,
    cpf: "06063762914",
    rg: "90279882",
    vip: true

}
console.log(**pessoa.nome**);
if (**pessoa.vip**) {
    console.log("É VIP");
}

** Vc consegue mudar o status da variavel ( true/false/ value)**
** Em uma variavel, quando vc vai "chamar", vc consegue colocar uma dentro da outra " encapsular"

*/

let pessoa = {
    nome: "Renato",
    idade: 33,
    cpf: "06063762914",
    rg: "90279882",
    vip: true

}
let checkIn = {
    voo: 1122,
    passageiro: "Renato",
    documento: "f121680",
    categoriaSmiles: "Diamond",
    isCheckIn: false
}
let voo = {
    pessoa: pessoa,
    checkIn: checkIn
}

console.log(voo);
console.log(checkIn.voo);
if (checkIn.isCheckIn) {
    console.log("É VIP");
} else {
    checkIn.isCheckIn = true;
}
console.log(checkIn);