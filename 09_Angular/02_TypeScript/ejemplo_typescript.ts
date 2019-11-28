"use strict";
var lenguaje="javascript";

let textoExtra: String ="con tipado fuerte opcional";

console.log("typescript es "+ lenguaje + textoExtra);

class UnaClase{
	private propiedad:String;
	constructor(private propiedad: String){
	}
	public getPropiedad():String{
		return this.propiedad;
	}
}
let unObjeto: UnaClase= new UnaClase("tiene poo")

textoExtra=2000;
console.log("Y "+unObjeto.getPropiedad())