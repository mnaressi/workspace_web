function gerarRelatorio(){
    var tipoAlarme = document.getElementById("tipoAlarme").value;
   
    var url = "http://localhost:8080/eventosporalarme?id="+tipoAlarme;

    fetch(url).then(res => res.json()).then(listaEventos => preencheTabela(listaEventos));

}

function preencheTabela(listaEventos){
    var strTabela = `<table class="table">
                        <thead>
                            <th> numSeq </th>
                            <th> data </th>
                            <th> Alarme </th>
                            <th> Hostname </th>
                            <th> IP </th>
                        </thead>
                        
                        <tbody> `;
    for (i=0;i<listaEventos.length;i++){
        let evento = listaEventos[i];
    
        strTabela = strTabela + `<tr>
                                 <td> ${evento.numSeq}</td>
                                 <td> ${evento.dataEvento}</td>
                                 <td> ${evento.alarme.nome}</td>
                                 <td> ${evento.equipamento.hostname}</td>
                                 <td> ${evento.equipamento.ipaddr}</td>
                                </tr>`;
    
    }
    
    strTabela = strTabela + `</tbody>
                            </table>`;
    
    document.getElementById("relatorio").innerHTML = strTabela;
    
    
    }