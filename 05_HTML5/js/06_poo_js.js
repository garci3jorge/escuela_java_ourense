var div = document.getElementById("contenido");

var bebida = new Object();

bebida.tipo = "Cerveza";
bebida.cantidad = "3 litros";

div.innerHTML += "Bebida es" + bebida.tipo + "</br>";
//en js los objetos son mapas como el HashMap<String,Object> de java

div.innerHTML += "Cantidad es " + bebida["cantidad"];

bebida["propiedades"] = "tiene alcohol, gas y emborracha";
div.innerHTML += "</br>Propiedades: " + bebida.propiedades;

function suma(x, y) {
    return x + y;

}

div.innerHTML += "<br/>suma(5+3) = " + suma(5, 3);
div.innerHTML += "<br/>suma(5+3) = " + suma('5', '3');

function Bebida(tipo, cant, prop) {
    this.tipo = tipo;
    this.cantidad = cant;
    this.propiedades = prop;
    function funmostrar() {
        div.innerHTML += "<p> Bebida: " + this.tipo + ", " + this.cantidad + ", " + this.propiedades + "</p>";
    }
    this.mostrar= funmostrar;


}

var zumo= new Bebida("zumo de naranja","1L","Vitamina C");
zumo["propiedades"]+=", y es de color naranja";
zumo.mostrar();