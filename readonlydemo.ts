class readonly{
   // fname ="watson";string;
    lname ="jhon"; 

    constructor( readonly fname:string)
    {
        this.fname=fname;
    }
    mess()
    {
        console.log("hello man");
    }

}
var c= new readonly("jhonny");
console.log(c.fname);
console.log(c.lname);
c.mess();

alert("hello");