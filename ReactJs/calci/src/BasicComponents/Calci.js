import "./calci.css";
export default function Calci() {
    return (
        <>
        <div class="calci_body">

<div class="screen">
    <div id="operation">536 + 250</div>
    <div id="typed">= 786</div>
</div>

<div class="calci_row">
    <button class="ac">AC</button>
    <button class="del">&#8592;</button>
    <button class="opt">&#37;</button>
    <button class="opt">&#247;</button>
    <button>7</button>
    <button>8</button>
    <button>9</button>
    <button class="opt">&#215;</button>
    <button>4</button>
    <button>5</button>
    <button>6</button>
    <button class="opt">&#8722;</button>
    <button>1</button>
    <button>2</button>
    <button>3</button>
    <button class="opt">&#43;</button>
    <button>&#160;</button>
    <button>0</button>
    <button>.</button>        
    <button class="opt">&#61;</button>
</div>
</div>
        </>
    )
}