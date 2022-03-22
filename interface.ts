interface doll
{
    fname:string;
    lname:string;
    getfullname() :string;
}

class interfacedemo implements doll{
    fname:string;
    lname:string;
    constructor(fname:string,lname:string)
    {
        this.fname=fname;
        this.lname=lname;

    }

    getfullname() {
        return this.fname+this.lname;
    }
    message()
    {
        console.log("happy holi");
    }

}
var object = new interfacedemo("hello","suma");
console.log(this.object.getfullname());
object.message();