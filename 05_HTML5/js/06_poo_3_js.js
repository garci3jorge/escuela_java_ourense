//notacion JSON: java script object notation
// lo que se puede almacenar en xml se puede convertir a json y viceversa
// todo se puede almacenar como json


var unObjeto = {};// new object();
var otroObjeto = {
    "prop_1": "Propiedad uno",
    "prop_2": "Propiedad dos",
    'prop_3': 'Propiedad tres',
    prop_4: "Propiedad cuatro",
    toString: function () {
        return "propiedades--- " + this.prop_1 + "; " + this.prop_2 + "; " + this.prop_3 + "; " + this.prop_4 + "; " + this.prop_5;
    },
    toStringAll: function () {
        var strProp = "<br/>------lista de propiedades---- ";
        for (var i = 0; i < 20; i++) {
            if (typeof (this["prop_" + i]) !== "undefined") {
                strProp += this["prop_" + i] + " ; ";
            }


        }
        return strProp;
    },
    toStringAllProp: function () {
        var strAllProp = "<br/>------lista de propiedades All---- ";
        for (key in this) {
            if (key.indexOf("prop_") >= 0) {
                strAllProp += this[key] + " ; ";
            }

        }
        return strAllProp;
    },
    toStringJorge: function () {
        var strAllPropJorge = "<br/>------lista de propiedades All Jorge---- ";
        for (const prop in otroObjeto) {
            if (prop.indexOf("prop_") >= 0) {
                //strAllPropJorge = otroObjeto[prop];
                strAllPropJorge+= otroObjeto[prop]+" ; ";
            }

        }
        return strAllPropJorge;
    }

}
/*for (const property in otroObjeto) {
    console.log(`${property}: ${otroObjeto[property]}`);
}
for (let index = 0; index < otroObjeto.size; index++) {
    
    
}*/

otroObjeto.prop_5 = "propiedad cinco";
var divTris = document.getElementById("contenido_tris");
divTris.innerHTML += otroObjeto.toString();


divTris.innerHTML += otroObjeto.toStringAll();
divTris.innerHTML += otroObjeto.toStringAllProp();
divTris.innerHTML += otroObjeto.toStringJorge();