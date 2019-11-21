$(document).ready(function () {
    $("#btn_peticion_ajax_jq").click(function () {
        //creamos la peticion ajax:
        $.ajax({
            "url": "./datosjson",
            "type": "GET",
            "success": function (respuestaJson) {
                $("#div_datos_json").html(JSON.stringify(respuestaJson));
            },
            "error": function (jqXHR, textStatus, errorThrow) {
                console.error("no se ha podido obtener info");
                console.warn(jqXHR);
                console.warn(textStatus);
                console.warn(errorThrow);
            }
        });

    });
    $("#btn_peticion_ajax_post").click(function () {
        let nombre = document.getElementById("nombre").value;
        let email = document.getElementById("email").value;
        if ("" !== nombre && nombre.length > 1 && email !== "") {
            let expresionNombre = new RegExp("^[A-Z][a-z]+ ?[A-Za-z]*$");
            let expresionEmail = /^[_a-z0-9-]+(.[_a-z0-9-]+)*@[a-z0-9-]+(.[a-z0-9-]+)*(.[a-z]{2,4})$/;
            if (expresionNombre.test(nombre) && expresionEmail.test(email)) {
                let datosUsuario = {
                    "nombre": nombre,
                    "email": email
                };

                $.post("./datosjson", datosUsuario,
                        function (resp) {
                            $("#div_datos_json").html(JSON.stringify(resp));
                        });
            } else {
                alert("primera letra mayus y minimo una letra minus, apellido opcional")
            }

        } else {
            alert("jorge no es valido para currar en viewnext");
        }

    });
});