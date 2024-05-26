import { Component } from "react";
class Controlled extends Component{
    constructor(props)
    {
        super(props);
        this.state = { value: "" };
        this.handleChange = this.handleChange.bind(this);
        this.submitChange = this.submitChange.bind(this);
    }

    handleChange(event) {
        this.setState({ value: event.target.value });
    }
    submitChange(event) {
        document.write("Username : "+this.state.value)
        event.preventDefault();
    }
    render() {
        return (
            <form onSubmit={this.submitChange} className="form-control">
                <label>Username</label>
                <input type="text" value={this.state.value} onChange={this.handleChange} /><br></br><br></br>
                <input type="submit" value="Submit" className="btn btn-outline-primary" />
            </form>
        );
    }
}
export default Controlled;