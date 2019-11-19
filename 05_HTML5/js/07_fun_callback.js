//nomenclatura tipica de funcion en variable
let suma = function (x, y) {
    return x + y;
}
//nomenclatura tipica de funcion
function multiplica(x, y) {
    return x * y;
}
//nomenclatura de objeto funcion
let divide = new Function("x", "y", "return x/y;");

//nomenclatura de funcion fecha ( expresiones lambda)
let resta = (x, y) => {
    return x - y;
}

//devuelve un conjunto de pares de posiciones de dos arrays
function funCllBkPunto(x, y) {
    let nuevoArray = [];
    nuevoArray[0] = x;
    nuevoArray[1] = y;
    return nuevoArray;
}

//otra manera de hacerlo
