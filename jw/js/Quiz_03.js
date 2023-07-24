function main() {
  for (x = 0; x < 16; x++) {
    for (y = 0; y < 13; y++) {
      if (x * 4 + y * 5 == 60) {
        console.log(x, y);
      }
    }
  }
}

//   console.log("!!!(" + a + "," + b + ")!!!");
// }

main();
