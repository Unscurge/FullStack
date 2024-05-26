import { Component } from "react";
class Student extends Component{
    constructor(props) {
        super(props)
        this.state = {
            name: "Chaitanya",
            age: "21",
            Sname: "K V S"
        };
    }
    render() {
        return (
            <div>
                <h2>School Name: {this.state.Sname}</h2>
                <h2>Student Name: {this.state.name}</h2>
                <h2>Age: { this.state.age}</h2>
            </div>
        );
    }
}
export default Student;