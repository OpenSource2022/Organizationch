$(document).ready(function(){
    $.getJSON("jnu copy.json", function(data){

        let table_data = "";
        $.each(data, function(key, value){

            table_data += "<tr>";
            table_data += "<td>" + value.position + "</td>";
            table_data += "<td>" + value.name + "</td>";
            table_data += "<td>" + value.email + "</td>";
            table_data += "<td>" + value.phone + "</td>";
            table_data += "<td>" + value.work + "</td>";
            table_data += "</tr>";
        });

        $("#table").append(table_data);

    });

});