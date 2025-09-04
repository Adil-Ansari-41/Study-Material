// import logo from './logo.svg';
import './App.css';
import Navbar from './Components/Navbar';
import TextForm from './Components/TextForm';

// let name = prompt("Enter Your Name");

function App() {
  return (
    // <>
    // <h1>This Heading and use fragment </h1>
    // <div classNameName="App">
    //   <header classNameName="App-header">
    //     <img src={logo} classNameName="App-logo" alt="logo" />
    //     <p>
    //       Edit <code>src/App.js</code> and save to reload.
    //     </p>
    //     <a
    //       classNameName="App-link"
    //       href="https://reactjs.org"
    //       target="_blank"
    //       rel="noopener noreferrer"
    //     >
    //       Learn React With Me
    //     </a>
    //   </header>
    // </div>
    // </>


    // <div classNameName="App">
    //   React
    //   <div classNameName="new">
    //     Hello {name}
    //   </div>
    // </div>



    // Project

    <>
  <Navbar title="TextUtitls"/>
  <div className="container my-3">
      <TextForm heading="Enter The Text"/>
  </div>
  </>
  );
}

export default App;
