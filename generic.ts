class admin extends person
{

}
class managere extends person{

}

let adminn = new admin("hello","hii");
let manager= new managere("hii","welcome");
function  foo< T extends person >(person : T): T{
return person;

var s = foo(adminn);
var s=foo(manager);
}
