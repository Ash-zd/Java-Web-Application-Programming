function sumEvenNumberUsingFor() {
    let sum = 0;
    for (let i = 1; i < 50; i++) {
        if (i % 2 === 0) {
            sum += i;
        }
    }
    console.log(sum);
}

function sumEvenNumberUsingWhile() {
    let sum = 0;
    let i = 1;
    while(i < 51) {
        if (i % 2 === 0) {
            sum += i;
        }
        i++;
    }
    console.log(sum);
}
