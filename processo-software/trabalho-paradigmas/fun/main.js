// Criando objeto xicara (Tipo de dado, não é o mesmo conceito de POO) 
// com valor da quantidadeCafe em 10%
let xicara = {
  quantidadeCafe: 0.1
}

// Função que encherá a xicara
function encherXicara(xicara) {
  //Copia o objeto xicara recebido via parametro
  let newXicara = {...xicara}

  //Altera a quantidade de café no novo objeto
  newXicara.quantidadeCafe = 1

  //Retorna o novo objeto
  return newXicara
}

let novaXicara = encherXicara(xicara)

//Irá exibir 10%, por conta da imutabilidade a entrada não deve ser alterada
console.log(`Quantidade de café, objeto original: ${xicara.quantidadeCafe}`)

//Irá exibir 100%, pois `novaXicara` é o valor obtido do resultado da função
console.log(`Quantidade de café, novo objeto: ${novaXicara.quantidadeCafe}`)


