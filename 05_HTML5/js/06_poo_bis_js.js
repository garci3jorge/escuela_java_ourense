var divBis = document.getElementById("contenido_bis");
divBis.style = "background-color: lightgrey";

var mostrarTodosParam = function (primerParam) {
    divBis.innerHTML += "primerParamero " + primerParam + "<br/>";
    for (argumento of arguments) {
        divBis.innerHTML += "Argumento: " + argumento + "<br/>";

    }
    if (typeof (primerParam) === "undefined") {
        divBis.innerHTML += "primerParam no esta definido";
    }
    if (primerParam == "1") {
        divBis.innerHTML += "---pues es parecido a 1---";

    } else {
        divBis.innerHTML += "---pues no es parecido a 1---";
    }
    if (primerParam === "1") {
        divBis.innerHTML += "<<<pues es identico a 1 numerico>>>";

    } else {
        divBis.innerHTML += "<<<pues no es identico a 1 numerico>>>";
    }
}
mostrarTodosParam("un parametro", 50, true, bebida);
mostrarTodosParam();
mostrarTodosParam("1");
mostrarTodosParam(1);

var intentoConversion = parseFloat("veinte"); // muestra NaN not a number
divBis.innerHTML += "<br/>-------Convirtiendo. Resultado = " + (intentoConversion);
divBis.innerHTML += "<br/>-------El tipo de dato es= " + typeof (intentoConversion);
if (isNaN(intentoConversion)) {
    divBis.innerHTML +="<br/>no es un numero ";
}
divBis.innerHTML += "<br/>Infinito " + 1 / 0;