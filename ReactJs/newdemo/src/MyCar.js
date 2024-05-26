import { Component } from "react";

class Mycar extends Component{
    constructor(props) {
        super(props)
        this.state = {
            brand: "AUDI",
            color: "Black",

        };
    }
    render() {
        return (
            <div>
                <h2>My Car {this.state.brand} { this.state.color}</h2>
            </div>
        );
    }
}
export default Mycar;