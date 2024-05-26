import { Component } from "react";
class Register extends Component
{
    render() {
        return (
            <div>
                <h1>Registeration Form</h1>
                <form action="/reg" className="form-control">
                <label>FirstName:</label><br/>
                <input type="text" name="fname" id="fname" /><br/><br/>
                <label>LastName:</label><br/>
                <input type="text" name="lname" id="lname" /><br/><br/>
                <label>Username:</label><br/>
                <input type="text" name="uname" id="uname" /><br/><br/>
                <label>Email:</label><br/>
                <input type="email" name="umail" id="umail" /><br/><br/>
                <label>Password:</label><br/>
                <input type="password" name="upass" id="upass" /><br/><br/>
                <button className="btn btn-primary">Submit</button>
            </form>
            </div>
        );
    }
}
export default Register; 