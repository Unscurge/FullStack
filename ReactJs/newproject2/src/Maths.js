import { Component } from "react";
class Maths extends Component{
    constructor(props) {
        super(props);
        this.state = { sum: "" };

    }
    solution(event) {
        const sum = "";
        const num1 = "";
        this.setState({sum:event.target.value})
    }
    render() {
        return (
            
            <div>
                <label>Enter First Number</label><br/>
                <input type="tel" id="num1" onChange={this.solution.bind(this)} /><br/>
                <label>Enter Secong Number</label><br/>
                <input type="tel" id="num2" onChange={this.solution.bind(this)}/><br/>
                <p>Sum : { this.state.sum}</p>
            </div>
            
        );
    }
}
export default Maths;