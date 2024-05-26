import React from "react";
function Holla() {
    return React.createElement("h4", { style: { textAlign: "right", color: "green",margin:"20px" } },"Hola Amigos1", React.createElement("h2",{style:{textAlign:"left",color:"pink"}},"Holla Amigos"), React.createElement("p",{style:{textAlign:"center",color:"yellow",background:"black"}},"Nested Amigos"));
}
export default Holla;
