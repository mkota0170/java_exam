"user strict"


console.log("問題1 "+"松花虎太郎");

let firstName = "KOTARO";
let lastName = "MATSUHANA";

console.log("問題2 "+firstName + " " + lastName);

let item1 = 200;
let item2 = 250;

let sum = item1*3 + item2*4;
let tax = sum * 0.1;

console.log("問題3")
console.log("小計：" + sum);
console.log("消費税：" + tax);
console.log("合計金額：" + (sum + tax));

console.log("問題4")
let testScore = 90;
console.log("入力した数値：" + testScore);
if(testScore >= 0 && testScore <= 79){
  console.log("追試です");
} else if(testScore >= 80 && 100 >= testScore){
  console.log("合格です");
} else {
  console.log("死になさい")
}

console.log("問題5");
let total = 0;
for (let n = 0; n <= 100; n++) {
  total = total + n;
}
console.log(total);


function add(x,y) {
  return x + y;
}
function sub(x,y) {
  return x - y;
}
function multi(x,y) {
  return x * y;
}
function div(x,y) {
  return x / y;
}

console.log("問題6");
console.log("5 + 3 = " + add(5,3));
console.log("5 - 3 = " + sub(5,3));
console.log("5 * 3 = " + multi(5,3));
console.log("5 / 3 = " + div(5,3));
