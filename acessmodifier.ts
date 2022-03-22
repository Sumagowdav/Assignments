class acess
{
   private fname:string;
   private lname:string;
    constructor(firstName: string ,lastName: string){
        this.fname = firstName;
        this.lname = lastName;
    }
    getFullName(){
        return this.fname + this.lname;
    }
}
var a=new acess("hello","sumagv");
console.log(a.getFullName());

class acess2 extends acess
{
    message2()
    {
        console.log("hello baby");
    }
}
var b =new acess2("hello","hello");
b.message2();
//u cant use variable fname and lname because they are private varible