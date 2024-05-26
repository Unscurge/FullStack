import React from 'react';
import './App.css';
import './Header.js';
import Header from './Header.js';
import Sidebar from './Sidebar.js';
import EmailList from './EmailList.js'
import { BrowserRouter as Router, Route, Routes, Switch } from 'react-router-dom';
import Mail from './Mail.js';


function App() {
  return (
    <Router>
    <div className="App">
        <Header />
        <div className='app_body'>
          <Sidebar />
            <Switch>
              <Route path='/mail'>
                <Mail/>
            </Route>
            <Route path='/'>
                <EmailList/>
            </Route>
            </Switch>
          
            
          
        </div>
    </div>
    </Router>
  );
}

export default App;
