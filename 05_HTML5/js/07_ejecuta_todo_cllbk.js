let array_A = [1, 2, 3, 4, 5];
let array_B = [2, 3, 4, 5, 6];

let arraysumaAB = operarArrays(array_A, array_B, suma);
arrayEnTabla(arraysumaAB);
let arrayMultiAB = operarArrays(array_A, array_B, multiplica);
arrayEnTabla(arrayMultiAB);
let arrayDivideAB = operarArrays(array_A, array_B, (x, y) => x / y);
arrayEnTabla(arrayDivideAB);
let arrayRestaAB = operarArrays(array_A, array_B, resta);
arrayEnTabla(arrayRestaAB);
let arrayPuntoAB = operarArrays(array_A, array_B, funCllBkPunto);
arrayEnTabla(arrayPuntoAB);

function arrayEnTabla(array) {
    let tabla = "<table border=2><tr>";
    for (let index = 0; index < array.length; index++) {
        const element = array[index];
        tabla += "<td>" + element + "</td>";
    }

    document.getElementById("contenido").innerHTML += tabla + "</tr></table>";
}
