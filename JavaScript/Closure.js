function outer() {
  var b = 20;

  function inner() {
    var a = 10;
    console.log("a = ", a, "b = ", b);
    a++;
    b++;
  }
  
  return inner;
}

let X = outer();
let Y = outer();

X();
X();
Y();

X();
Y(); 
