import { useEffect, useState } from "react";

function CountApp()
{
    const [count, setCount] = useState(0);

    useEffect(() => {
        document.title = "CountApp";
    }
    );
    
    return (
        <div>
            <p>You clicked {count} times</p>
            <button onClick={()=> setCount(count+1)} >click me</button>
        </div>
    );
}
export default CountApp;