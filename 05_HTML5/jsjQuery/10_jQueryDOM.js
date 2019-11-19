jQuery(document).read(function () {
    jQuery("section").append("<div><p>leyenda de lo que sea</p></div>");

    $("tr").append("<td>infoz</td>");
    $("tr:nth-child(5)").attr("style","background-color: red, color white");
    $ ("#otro_menu").click(function(){
        $(this).slideUp();
    });
    $(".h2").click(function(){
        $(this).slideUp();
    });
});