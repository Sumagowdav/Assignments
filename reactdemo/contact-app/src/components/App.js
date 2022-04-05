
import React ,{useState , useEffect} from "react"; //import react library
import './App.css';
import Header from "./Header";
import ContactList from "./ContactList";
import AddContact from "./AddContact";
function App() {
  const LOCAL_STORAGE_KEY = "contacts";
  const [contacts,setContacts] =useState([]);
  const addContactHandler = (contact) =>{
    console.log(contact);
    setContacts([...contacts,contact]);
  }
  useEffect(() => {
    const retrieveContacts = JSON.parse(localStorage.getItem(LOCAL_STORAGE_KEY));
    if(retrieveContacts) setContacts(retrieveContacts);
    }, []);
    // when refreshed, it must fetch data from local storage
    useEffect(() => {
    localStorage.setItem(LOCAL_STORAGE_KEY, JSON.stringify(contacts));
  }, [contacts]);
  return (
    <div className = "ui container">
      <Header/>
      <AddContact addContactHandler = {addContactHandler}/>
    {<><AddContact />
    <ContactList contacts ={contacts}/></>}
   </div>

  );
}

export default App;
