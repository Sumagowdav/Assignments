class student{
    fname :string;
    lname:string;

constructor(fname:string,lname:string) {
this.fname= fname;
this.lname= lname;
}

 getfullname()
{
    return this.fname+this.lname;
}
};

var ob1 = new student("suma","gowda");
 //var res1 =ob1.fname="suma";
//onsole.log(ob1.lname="gowda");
//console.log(res1);
console.log(ob1.getfullname());

alert("ur are beautiful");