import logo from './logo.svg';
import './App.css';
// import {Table} from 'react-bootstrap'
import { BrowserRouter as Router,Route, Link, NavLink, Redirect, Prompt} from 'react-router-dom';
import './assignment/Style1.css';
import Employee from './assignment/Assign_1';
import React, { Component } from 'react'
// import Route from 'react-router-dom/Route';


// Assignment 1

// class App extends Component {

//   render() {
//     return (
//       <div className="App">
//         <Employee/>
//       </div>
//     )
//   }
// }


// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!


// ASSIGNMENT 2

// function App()
// {
//     const professionals=[
//       {name:'Charlie',job:'janitor'},
//       {name:'Mac',job:'Bouncer'},
//       {name:'Dee',job:'Aspiring actress'},
//       {name:'Dennis',job:'Bartender'}
//     ]
//     return(
//       <div className="App">
//         <h1>Assignment 1</h1> 
//         <Table striped bordered hover variant="dark">
//           <tbody>
//           <tr>
//             <td>Name</td>
//             <td>Job</td> 
//           </tr>
//         {
//           professionals.map((item,i)=>
//            <tr key={i}>
//              <td>{item.name}</td>
//              <td>{item.job}</td>
//            </tr> 
//           )
//         }
//         </tbody>
//         </Table>
//       </div>
//     );
//   }


// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

// ASSIGNMENT 4

// class App extends Component {
//   constructor(){
//       super();

//       this.state = {
//           result: ""
//       }
//   }

//   onClick = button => {

//       if(button === "="){
//           this.calculate()
//       }

//       else if(button === "C"){
//           this.reset()
//       }
//       else if(button === "B"){
//           this.backspace()
//       }

//       else {
//           this.setState({
//               result: this.state.result + button
//           })
//       }
//   };


//   calculate = () => {
//       try {
//           this.setState({
//               // eslint-disable-next-line
//               result: (eval(this.state.result) || "" ) + ""
//           })
//       } catch (e) {
//           this.setState({
//               result: "error"
//           })

//       }
//   };

//   reset = () => {
//       this.setState({
//           result: ""
//       })
//   };

//   backspace = () => {
//       this.setState({
//           result: this.state.result.slice(0, -1)
//       })
//   };

//   render() {
//       return (
//           <div>
//               <div className="calculator-body">
//                   <h1>Simple Calculator</h1>
//                   <ResultComponent result={this.state.result}/>
//                   <KeyPadComponent onClick={this.onClick}/>
//               </div>
//           </div>
//       );
//   }
// }

// class ResultComponent extends Component {


//   render() {
//       let {result} = this.props;
//       return (
//           <div className="result">
//               <p>{result}</p>
//           </div>
//   )
//       ;
//   }
// }

// class KeyPadComponent extends Component {

//   render() {
//       return (
//           <div className="button">
//               <button name="(" onClick={e => this.props.onClick(e.target.name)}>(</button>
//               <button name="B" onClick={e => this.props.onClick(e.target.name)}>B</button>
//               <button name=")" onClick={e => this.props.onClick(e.target.name)}>)</button>
//               <button name="C" onClick={e => this.props.onClick(e.target.name)}>C</button><br/>


//               <button name="1" onClick={e => this.props.onClick(e.target.name)}>1</button>
//               <button name="2" onClick={e => this.props.onClick(e.target.name)}>2</button>
//               <button name="3" onClick={e => this.props.onClick(e.target.name)}>3</button>
//               <button name="+" onClick={e => this.props.onClick(e.target.name)}>+</button><br/>


//               <button name="4" onClick={e => this.props.onClick(e.target.name)}>4</button>
//               <button name="5" onClick={e => this.props.onClick(e.target.name)}>5</button>
//               <button name="6" onClick={e => this.props.onClick(e.target.name)}>6</button>
//               <button name="-" onClick={e => this.props.onClick(e.target.name)}>-</button><br/>

//               <button name="7" onClick={e => this.props.onClick(e.target.name)}>7</button>
//               <button name="8" onClick={e => this.props.onClick(e.target.name)}>8</button>
//               <button name="9" onClick={e => this.props.onClick(e.target.name)}>9</button>
//               <button name="*" onClick={e => this.props.onClick(e.target.name)}>x</button><br/>


//               <button name="." onClick={e => this.props.onClick(e.target.name)}>.</button>
//               <button name="0" onClick={e => this.props.onClick(e.target.name)}>0</button>
//               <button name="=" onClick={e => this.props.onClick(e.target.name)}>=</button>
//               <button name="/" onClick={e => this.props.onClick(e.target.name)}>÷</button><br/>
//           </div>
//       );
//   }
// }



// !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

// ASSIGNMENT 6

// function App() {
  
//   return (
//     <Router>
       
//     <div style={{backgroundColor:"purple"}} className="App">
//       <div className="a">
//       <NavLink to="/home"  exact activeStyle={
//         {backgroundColor:'pink'}
//       }> HOME</NavLink> 

//       <NavLink to="/projects"exact activeStyle={
//         {backgroundColor:'pink'}
//       } > PROJECTS</NavLink>

//     <NavLink to="/about"  exact activeStyle={
//         {backgroundColor:'pink'}
//       }> ABOUT</NavLink> 

//     <NavLink to="/contact"  exact activeStyle={
//         {backgroundColor:'pink'}
//       }> CONTACT</NavLink> 

//     <Route path="/home"  exact  strict render={
//       ()=>{
//         return(<h2>you choose <span> HOME</span></h2>)
//       }
//     }
   
//     />
//      </div>
//     <Route path="/Projects"  exact strict render={
//       ()=>{
//         return(<h2>you choose <span> PROJECTS</span></h2>)
//       }
//     }
    
//     />
//      <Route path="/about"  exact strict render={
//       ()=>{
//         return(<h2>you choose <span> ABOUT</span></h2>)
//       }
//     }
    
//     />
//      <Route path="/contact"  exact strict render={
//       ()=>{
//         return(<h2>you choose <span> CONTACT</span></h2>)
//       }
//     }
    
//     />
    


    
    
//     </div>
//     </Router>
//   );
// }

export default App;
