function gerarRelatorio(){
    var dtIni = document.getElementById("txtDataIni").value;
    var dtFim = document.getElementById("txtDataFim").value;

    var url = "http://localhost:8080/eventos?ini="+dtIni+"&fim="+dtFim;

    fetch(url).then(res => res.json()).then(listaEventos => preencheTabela(listaEventos));

}

function preencheTabela(listaEventos){
var strTabela = `<table class="table">
                    <thead>
                        <th> ID Alarme </th>
                        <th> Data </th>
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
