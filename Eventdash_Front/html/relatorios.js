function carregaInfo(){
    // antes de mais nada... vou verificar se tenho o objeto no LocalStorage
    var userSTR = localStorage.getItem("userDASH"); // tento recuperar do localStorage
    if (!userSTR) {  // se esse cara não existir
        window.location = "index.html";
    }

    // então o usuario existe.

    var user = JSON.parse(userSTR);  // como eu gravei em fomato texto, vou reconverter para objeto em memória

    document.getElementById("fotoUser").innerHTML = `<img src="${user.linkfoto}"  width="100%"><br><br>`;
    document.getElementById("bioUser").innerHTML = `<h5> <b> Nome do Usuario: </b> ${user.nome} </h5>
                                                    <hr>
                                                    <b> RACF: </b> ${user.racf} <br>
                                                    <b> Email: </b> ${user.email} <br>
                                                    <b> Departamento: </B> ${user.departamento} <hr><br><br>`;}
                                                    


function logout(){
    localStorage.removeItem("userDASH");
    window.location = "index.html";
}


