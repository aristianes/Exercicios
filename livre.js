let familia = {
    people: [{
            name: "Renato",
            lastName: "Siqueira",
            age: 38,
            maritalStatus: "married",
            fone: "41 999839714",
            renda: 4000,
            child: false
        },
        {
            name: "Aristiane",
            lastName: "Siqueira",
            age: 33,
            maritalStatus: "married",
            fone: "41 999190016",
            renda: 1100,
            child: false
        }
    ],
    costs: [{
            nameCost: "Aluguel",
            value: 900
        },
        {
            nameCost: "Condominio",
            value: 320
        },
        {
            nameCost: "Internet",
            value: 150
        },
        {
            nameCost: "Gas",
            value: 40
        },
        {
            nameCost: "Juca",
            value: 320
        }
    ],
    mudanca: "Canadá ",
    qtdMalas: 4,
    anoMudanca: 2021,
    nossasCoisas: ["Passaporte", "Work Visa", "Reserva Air Canadá", " Reserva Airbnb"],
    coisasJuca: [" Carteirinha", " Czi", " Reserva", " Casinha"]
};

let vlrRenda = 0;


for (let i = 0; i < familia.people.length; i++) {
    vlrRenda = vlrRenda + familia.people[i].renda;
}
console.log("Renda Familia é " + vlrRenda);

let vlrGastos = 0;

for (let i = 0; i < familia.costs.length; i++) {
    vlrGastos = vlrGastos + familia.costs[i].value;
}
console.log("Gastos mês Março R$ " + vlrGastos);

let economias = 0;

economias = vlrRenda - vlrGastos;
console.log("Nossas economias R$ " + economias);

console.log("Qual país iremos nos mudar --> " + familia.mudanca + " <-- ");

console.log("As coisas do Juju são: ");
familia.coisasJuca.forEach(function(item, indice, coisasJuca) {
    console.log("  " + item);
})
console.log(" As nossas coisas são: ");
familia.nossasCoisas.forEach(function(item, indice, nossasCoisas) {
    console.log("  " + item);
})