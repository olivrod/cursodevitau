function logar(){



    if (document.getElementById("txtemail").value.indexOf("@") < 1 && document.getElementById("txtemail").value.length !=7 ){
        window.alert("Login incorreto!");
        return null;
    }

    var mensagem = {
        email:document.getElementById("txtemail").value,
        racf:document.getElementById("txtemail").value,
        senha:document.getElementById("txtsenha").value
    };

    var cabecalho = {
        method:"POST",
        body:JSON.stringify(mensagem),
        headers:{
            "Content-type" : "application/json"
        }
    }

    fetch("http://localhost:8080/login", cabecalho)
        .then(res => res.json())
        .then(res => {
            localStorage.setItem("user", JSON.stringify(res));
            window.location = "dashboard.html";
        })
        .catch(err => {
            window.alert("Usuario ou senha incorreto");
        });

    
}

function exibirUsuario(){
 
    if (localStorage.getItem("user")){
    var usuario = JSON.parse(localStorage.getItem("user"));
 
    document.getElementById("foto").innerHTML = "<img src=img/" + usuario.foto +  " width=50px >";
    document.getElementById("dados").innerHTML = usuario.nome + "("+ usuario.racf +")";
    }
    else{
        window.location = "login.html";
    }
 
}
 
function gravar(){
    var data = document.getElementById("txtnascimento").value;
    var ano = data.substring(0,4);
    var mes = data.substring(5,7);
    var dia = data.substring(8);
    var nossadata = dia + "/" + mes + "/" + ano;
 
    var mensagem = {
        nomeartistico : document.getElementById("txtnome").value ,
        nacionalidade : document.getElementById("txtnacionalidade").value ,
        nascimento : nossadata
    }
 
    var cabecalho = {
        method:"POST",
        body: JSON.stringify(mensagem),
        headers:{
            "Content-Type": "application/json"
        }
    }
 
    fetch("http://localhost:8080/novoartista", cabecalho)
        .then(res => res.json())
        .then(res => {
            window.alert("Gravado com sucesso");
            window.location="artista.html";
        })
        .catch(err => {
            window.alert("Erro");
        });
}
 
function preencherTabela(lista){
 
    var tabela = "<table class='table-striped' style='width: 80%;'>" + 
                    "<tr>" +
                        "<th>PDV</th>"+
                        "<th>Nome Técnico</th>"+
                        "<th>Data</th>"+
                        "<th>Operadora</th>"+
                        "<th>Ação</th>"+
                    "</tr>";
       
    for (cont=0; cont < lista.length; cont++){
        tabela+=
            "<tr>" +
                "<td>" + lista[cont].pdv.nome + "</td>" +
                "<td>" + lista[cont].nomeTecnico + "</td>" +
                "<td>" + lista[cont].dataHora + "</td>" +
                "<td>" + lista[cont].operadora + "</td>" +
                "<td align='center'><input type='button' class='btn btn-success btn-sm' onclick=alterarStatus('aprovada','" + lista[cont].numSeq + "') value='Aprovar'";
                if (lista[cont].status == "aprovada") {
                    tabela+= " disabled";
                }
                tabela+= ">&nbsp;&nbsp;<input type='button' class='btn btn-warning btn-sm' onclick=alterarStatus('negada','" + lista[cont].numSeq + "') value='Negar'";
                if (lista[cont].status == "negada") {
                    tabela+= " disabled";
                }
                tabela+= ">&nbsp;&nbsp;<input type='button' class='btn btn-danger btn-sm' onclick=alterarStatus('cancelada','" + lista[cont].numSeq + "') value='Cancelar'";
                if (lista[cont].status == "cancelada") {
                    tabela+= " disabled";
                }
                tabela+= ">" +
            "</td></tr>";
    }
 
    tabela +=   "</table>" ;
            
 
    document.getElementById("solicitacoes").innerHTML=tabela;
 
    
}
 
function carregarSolicitacoes(){
    fetch ("http://localhost:8080/porstatus/" + document.getElementById("cmbstatus").value)
        .then(res => res.json())
        .then(res => preencherTabela(res));
}
 
function preencherCombo(lista){
    var dados = "";
 
    for (cont = 0; cont < lista.length; cont++){
        dados +=
            "<option value='" + lista[cont].id + "'>" + lista[cont].nomeartistico + "</option>";
    }
 
    document.getElementById("cmbartistas").innerHTML = dados;
}

function logout(){
 
    localStorage.removeItem("user");
    window.location = "login.html";
 
}