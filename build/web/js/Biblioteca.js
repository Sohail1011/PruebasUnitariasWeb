//creamos una funcion para validad
function Validar() {
    var txtN1 = document.getElementById("txtN1");
    var txtN2 = document.getElementById("txtN2");
    if (txtN1.value == "") {
        alert("Ingrese el numero 1");
        txtN1.focus();
    } else if (txtN2.value == "") {
        alert("Ingrese el numero 2");
        txtN2.focus();
    } else {
        frmOperacion.submit();
    }
}