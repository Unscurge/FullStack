import React,{Component} from "react";
class Uncontrolled extends Component{

    constructor(props)
    {
        super(props);
            this.updateSubmit = this.updateSubmit.bind(this);
            this.input = React.createRef();
    }
    updateSubmit(event) {
        alert("Successfully entered Data!");
        event.preventDefault();
    }

    render() {
        return (
            <form onSubmit={this.updateSubmit} >
                <label>Username</label>
                <input type="text" ref={this.input} />
                <label>Company Name</label>
                <input type="text" ref={this.input} />
                <input type="submit" value="Submit"/>
            </form>
        );
    }
    
}
export default Uncontrolled;