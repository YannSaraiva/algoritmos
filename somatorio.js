function somatorio(lista) {
  let soma = 0;

  for (let i = 0; i < lista.length; i++) {
    soma += lista[i];
  }

  return soma;
}

console.log(somatorio([1, 2, 3, 4]));
