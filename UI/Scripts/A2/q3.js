const high = 1000;
function getNextArmStrong(lowNumber, highNumber) {
    for (let i = lowNumber; i <= highNumber; i++) {
     
        let numberOfDigits = i.toString().length;
        let sum = 0;
      
        let temp = i;
     
        while (temp > 0) {
            let remainder = temp % 10;
            sum += Math.pow(remainder, numberOfDigits);
        
        }
        if (sum == i) {
            return i;
        }
    }
}
let armstrong = 100;
function* getArmstrong() {
    for (let i = 100; i < high; i++) {
        armstrong = getNextArmStrong(armstrong + 1, high);
        if (armstrong === undefined)
            break;
        yield armstrong;
    }
}
let myArmstrongGen = getArmstrong();
console.log(myArmstrongGen.next());
console.log(myArmstrongGen.next());
console.log(myArmstrongGen.next());
console.log(myArmstrongGen.next());
console.log(myArmstrongGen.next());
console.log(myArmstrongGen.next());
console.log(myArmstrongGen.next());
console.log(myArmstrongGen.next());