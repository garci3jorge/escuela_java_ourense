jQuery(document).ready(function () {
    jQuery("section").append("<div><p>leyenda de lo que sea</p></div>");

    $("tr").append("<td>infoz</td>");
    $("tr:nth-child(5)").attr("style", "background-color: red, color white");

    $(".h2").click(function () {
        $(this).toggle(1000);
    });

    $("article").each(function (index) {
        $(this).hide(3000).slideUp();

        let idArticulo = "articulo_29juR_" + index
        
        $(this).attr("id", idArticulo);
        $("#otro_menu").append("<a href='#" + idArticulo + "'class='enlace-articulo'>Articulo nº " + index + "</a>");

    });
    $(".enlace-articulo").each(function (index) {
        $(this).click(function () {


            $("#articulo_29juR_"+index).toggle(3000);

        });

    });


    //ahora lo que hay que haceer es lo siguiente:
    //Esconder los articulos al cargar la pagina
    //luego al pulsar en el enlace de arriba
    //que aparezcan los articulos y te lleve a el articulo abierto

});