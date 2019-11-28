"use strict";
var lenguaje = "javascript";
var textoExtra = "con tipado fuerte opcional";
console.log("typescript es " + lenguaje + textoExtra);
var UnaClase = (function () {
    function UnaClase(propiedad) {
        this.propiedad = propiedad;
    }
    UnaClase.prototype.getPropiedad = function () {
        return this.propiedad;
    };
    return UnaClase;
})();
var unObjeto = new UnaClase("tiene poo");
textoExtra = 2000;
console.log("Y " + unObjeto.getPropiedad());
