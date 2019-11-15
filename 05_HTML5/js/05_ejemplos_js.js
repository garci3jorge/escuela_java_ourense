console.log("Mensaje ok");
console.error("Mensaje error");
var soyUnaVarible = "Ahora soy un texto";
document.write("<h1>JavaScript</h1>");
document.write("<p>soyUnaVarible = " + soyUnaVarible + "</p>");
document.write("No mas codigo spaguetti. Es un patron de diseño ");
soyUnaVarible = 999;
//mediante el DOM generamos un p y lo rellenamos
document.write("<p>soyUnaVarible = " + soyUnaVarible + "</p>");
var parrafo = document.createElement("p");
var textoParrafo = document.createTextNode("soyUnaVarible=" + soyUnaVarible);
parrafo.append(textoParrafo);
var body = document.getElementsByTagName("body");
body.appendChild(parrafo);
var arrayParrafos = document.getElementsByTagName("p");
for (p of arrayParrafos) {
    p.setAtributte("style", "background - color: lightgrey");

}
alert(body.innerHTML);