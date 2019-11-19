function operarArrays(arrX, arrY, opera) {
    //comprobamos que el tamaño del os arrays es el mismo
    if (arrX.lenght == arrY.lenght) {
        //declaramos un array con la palabra var: ambito ed de funcion no de bloque
        //A diferencia de let de ES6 , que si es ambito a nivel de bloque
        var arrayResult = new Array(arrX.lenght);//Una forma de crear array
        for (let i = 0; i < arrX.length; i++) {
            arrayResult[i] = opera(arrX[i], arrY[i]);


        }
    }
    return arrayResult
}

//Otros ejemplos de array:
var arrayEjemplo = [];  //otra manera con notacion json
//no indicamos en tamaño porque en realidad los arrays de json
//son como los arrayList<Object> de java
//incluso a una HashMap<Integer,Object>
arrayEjemplo.push("primer elemento");
arrayEjemplo[10] = "lo que sea";