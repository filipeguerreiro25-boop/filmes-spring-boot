$(document).ready(function() {

    // EXCLUIR
    $(".btnExcluir").click(function() {

        let id = $(this).data("id");

        $.ajax({
            url: "/api/filmes/" + id,
            type: "DELETE",

            success: function() {
                alert("Filme excluído!");
                location.reload();
            },

            error: function() {
                alert("Erro ao excluir filme.");
            }
        });

    });

    // EDITAR
    $("#btnSalvar").click(function() {

        let id = $("#id").val();

        let filme = {
            titulo: $("#titulo").val(),
            sinopse: $("#sinopse").val(),
            genero: $("#genero").val(),
            anoLancamento: $("#anoLancamento").val()
        };

        $.ajax({
            url: "/api/filmes/" + id,
            type: "PUT",
            contentType: "application/json",
            data: JSON.stringify(filme),

            success: function() {
                alert("Filme atualizado!");
                window.location.href = "/";
            },

            error: function() {
                alert("Erro ao atualizar filme.");
            }
        });

    });

});