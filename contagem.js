function contagem(lista, primeiro, N) {
  let count = 0;

  for (let i = 0; i < lista.length; i++) {
    if (lista[i] >= primeiro && lista[i] <= N) {
      count++;
    }
  }

  return count;
}

console.log(contagem([1,5,10,15], 5, 15));
