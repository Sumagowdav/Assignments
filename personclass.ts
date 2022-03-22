class person
{
    firstname:string;
    lastname:string;
    constructor(firstname:string,lastname:string)
    {
        this.firstname=firstname;
        this.lastname=lastname;
    }

     name2()
    {
      console.log("happy day");
           
    } 
}
var obj=new person("cool","captain");
obj.name2();


 class employee extends person{
    name()
    {
        console.log("happy holi");
    }
}
    var obj3 =new employee("dhoni","captain")
    this.obj3.name();
    obj3.name2();

    alert("hello");

