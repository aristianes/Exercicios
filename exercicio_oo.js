let voo = {
    id: 0501,
    numeroVoo: 1121,
    horario: "20:43",
    origem: " Cwb",
    destino: "Cgh",
    aeronave: "B737-8",
    seat: 183,
    prefixo: "PR- GTG"
};

let passageiro = {
    nome: "Juca",
    dataNascimento: "26/07/2017",
    vascina: true,
    castrado: true,
    raca: "Yorkshire",
    pelagem: "Padrão"
};

let checkIn = {
    flight: voo,
    passanger: passageiro,
    isCheckIn: false
};
console.log(checkIn.flight.numeroVoo);