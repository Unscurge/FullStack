import "./external.css";
export default function Holla() {
    const CssStyle = {
        color: "Red",
        fontSize: "150px",
        fontFamily: "cursive"
    };
    return (
        <>
            <h1 style={CssStyle}>Holla Amigos</h1>
            <p className="externalStyle">Chaitanya</p> {/*  External Css */}
        </>
    )
}