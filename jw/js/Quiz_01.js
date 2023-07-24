function main() {
  let sum = 0;
  for (i = 0; i <= 100; i++) {
    if (i % 3 == 0) {
      sum += i;
    }
  }
  console.log(sum);
}

main();
