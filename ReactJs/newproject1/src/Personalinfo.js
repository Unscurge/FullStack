import React,{Component} from "react";
class Personalinfo extends Component{
    
    constructor(props) {
        super(props);
        this.submitform=this.submitform.bind(this)
        this.put = React.createRef();
    }
    
    submitform(event) {
        alert("Entered Data Successfully!!")
        event.preventDefault();
    }
    
    render() {
        return (
            <div>
                <div className="a2"><h1>Personal Info</h1></div>
            <form onSubmit={this.submitform} className="form-control ">
                <label>FullName</label><br></br>
                <input type="text" ref={this.put} /><br></br>
                <label>LastName</label><br></br>
                <input type="text" ref={this.put} /><br></br>
                <label>NickName</label><br></br>
                <input type="text" ref={this.put} /><br></br>
                <label>Email</label><br></br>
                <input type="email" ref={this.put} /><br></br>
                <label>Password</label><br></br>
                <input type="password" ref={this.put} /><br></br>
                <label>Date of Birth</label><br></br>
                <input type="date" ref={this.put} /><br></br><br></br>
                <input type="submit" value="Submit" className="btn btn-primary"/>
                </form>
            </div>
        );
    }
    
}
export default Personalinfo;