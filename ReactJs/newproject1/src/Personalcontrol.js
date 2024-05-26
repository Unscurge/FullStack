import { Component } from "react";
class Personalcontrol extends Component{
    constructor(props) {
        super(props);
        this.state = {
            value1: "",
            value2: "",
            value3: "",
            value4: "",
            value5: ""
        };
        this.handleChange = this.handleChange.bind(this);
        this.submitChange = this.submitChange.bind(this);

    }
    handleChange(event) {
        this.setState(
            { value1: event.target.value1 },
            { value2: event.target.value2 },
            { value3: event.target.value3 },
            { value4: event.target.value4 },
            { value5: event.target.value5 }
        )
    }
    submitChange(event) {
        document.write("First Name : " + this.state.value1)
        document.write("Last Name : " + this.state.value2)
        document.write("Date Of Birth : " + this.state.value3)
        document.write("Email ID : " + this.state.value4)
        document.write("Mobile Number : " + this.state.value5)
        event.preventDefault();
    }
    render() {
        return (
            <form onSubmit={this.submitChange} className="form-control">
                <label>First Name: </label><br/>
                <input type="text" value={this.state.value1} onChange={this.handleChange} /><br/>
                <label>Last Name: </label><br/>
                <input type="text" value={this.state.value2} onChange={this.handleChange}/><br/>
                <label>Date Of Birth: </label><br/>
                <input type="date" value={this.state.value3} onChange={this.handleChange}/><br/>
                <label>Email ID: </label><br/>
                <input type="email" value={this.state.value4} onChange={this.handleChange}/><br/>
                <label>Mobile Number: </label><br/>
                <input type="text" value={this.state.value5} onChange={this.handleChange}/><br/><br/>
                <input type="submit" value="Submit" className="btn btn-outline-success m-md-1"/>
                <input type="reset" value="Reset" className="btn btn-outline-danger"/>
            </form>
        );
    }
}
export default Personalcontrol;