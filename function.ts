alert("hello");
function sub(a:number, b:number){
    return a - b;
}

var subValue = sub(6,2);
console.log(subValue);

function subtraction(a,b,c){
    return a - b-c;
}
var result = subtraction(6,3,0); // valid 
  var result2= subtraction(6,3,1);
console.log(result);
console.log(result2);

function sub2(a ,b,c=1)
{
    return a-b-c;
}

var res3=sub2(10,6)
console.log(res3);