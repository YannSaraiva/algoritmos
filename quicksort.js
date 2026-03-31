function quicksort(arr) {
  if (arr.length <= 1) return arr;

  let pivo = arr[0];
  let menores = [];
  let maiores = [];

  for (let i = 1; i < arr.length; i++) {
    if (arr[i] < pivo) menores.push(arr[i]);
    else maiores.push(arr[i]);
  }

  return [...quicksort(menores), pivo, ...quicksort(maiores)];
}

console.log(quicksort([5,3,8,1]));
