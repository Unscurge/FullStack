import { Component } from "react";
class Eventapp extends Component
{
    constructor(props) {
        super(props);
        this.state = { cname: "" };

    }
    changeText(event) {
        this.setState({ cname: event.target.value });
    }

    render() {
        return (
            <div className="">
            <label>Enter Company Name</label><br/>
            <input type="text" id="cname" onChange={this.changeText.bind(this)} />
            <p>You Entered : { this.state.cname}</p>
        </div>
        );
        
    }
    
}
export default Eventapp;