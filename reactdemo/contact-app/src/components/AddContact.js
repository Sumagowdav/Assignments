import React from "react"; //import
//creating class component
class AddContact extends React.Component {
    state = {
        name: "",
        email: "",
      };
  add = (e) =>{
e.preventDefault(); //don't want to refresh
if (this.state.name === "" || this.state.email === "") {
    alert("ALl the fields are mandatory!");
    return;
  }
  this.props.addContactHandler(this.state);
this.setState({name:"",email:""});

  console.log(this.state);
  }
    //cannot simply return, need to use render method
    render() {
        //create form with name and  mail id
        return (
            <div className="ui main">
                <h2>Add Contact</h2>
                {/* on submit add method to be called */}
                <form className="ui form" onSubmit = {this.add}>
                    <div className="field">
                        <label>Name</label>
                        {/* inside onchange , arrow function */}
                        {/* it's going to return event */}
                        <input type="text" name="name" placeholder="Name"
                        value = {this.state.name} 
                        onChange={(e) => this.setState({name: e.target.value}) }/>
                    </div>
                    <div className="field">
                        <label>Email</label>
                        <input type="text" name="email" placeholder="Email"
                        value = {this.state.email} 
                        onChange={(e) => this.setState({email: e.target.value}) }/>
                    </div>
                    <button className="ui button blue">
                        Add
                    </button>
                </form>
            </div>
        );
    }
}
//exporting addcontact
export default AddContact; 