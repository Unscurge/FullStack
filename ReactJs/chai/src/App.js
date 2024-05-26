
import { useEffect, useState } from 'react';
import './App.css';

function App() {
  let [counter, setCounter] = useState(15);
  useEffect(()=> {
    console.log("counter changed");
  }, [counter]);
  const addValue = () => {
    setCounter(counter + 1);
    if (counter>=20) {
      setCounter(counter)
    }
    
  }
  const removeValue = () => {
    setCounter(counter - 1);
    if (counter <= 0) {
      setCounter(counter)
    }

  }
  return (
    
    <div className='App'>
    <h1>Chai aur react</h1>
    <h2>counter value:{counter}</h2>
    <button onClick={addValue}>Add value</button><br/><br/>
    <button onClick={removeValue}>remove value</button>
    </div>
    
  );
}

export default App;
