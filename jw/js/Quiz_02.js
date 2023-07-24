function dice() {
  return Math.floor(Math.random() * 6) + 1;
}

function main() {
  let a = dice();
  let b = dice();

  while (a + b !== 5) {
    console.log("(" + a + "," + b + ")");
    a = dice();
    b = dice();
  }

  console.log("!!!(" + a + "," + b + ")!!!");
}

main();
