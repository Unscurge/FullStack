import './App.css';
import MyComponent from './components/ClassComp';
import FunComp1 from './components/FunComp1';
function App() {
  // const name = "Chaitanya Bankar";
  // const city = "Nagpur"
  const user = "Unscurge"
  const plat = "Discord"
  return (
    <div className="App">
      {/* <FunComp1 value={ name } ct={city} no ="7066785314" /> used when prop function is used */}
      {/* <Message name={user} Platform={plat} />  Arrow function*/}
      <MyComponent/>
    </div>
  );
}
// Arrow Function
const Message=({name,Platform})=><h2>User : {name} <br/> Platform : {Platform} </h2>
export default App;
