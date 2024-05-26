import './App.css';
import Home1 from './Home1';
import About from './About';
import Contact from './Contact';
import {Link, Route, Routes } from 'react-router-dom';

function App() {
  return (
    <div className="App">
      <h1>Routing: </h1>
      <Routes>
        <Route path='/Home' Component={Home1}></Route>
        <Route path='/About' Component={About}></Route>
        <Route path='/Contact' Component={Contact}></Route>
      </Routes>
      <Link to="/Home">Home</Link>
      <Link to="/About">About</Link>
      <Link to="/Contact">Contact</Link>  
    </div>
  );
}

export default App;
