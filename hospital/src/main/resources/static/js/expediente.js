// Call the dataTables jQuery plugin
$(document).ready(function() {
  cargarExpediente();
  $('#expediente').DataTable();
});

async function cargarExpediente(){
  
    const request = await fetch('api/expediente', {
      method: 'GET',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      }
    });
    const expediente = await request.json();
    
    console.log(expediente);

    let listadoHTML = '';
    for(let exp of expediente){
      let expHTML = '<tr><td>'+exp.fecha
      +'</td><td>'+exp.padecimiento
      +'</td><td>'+exp.procedimiento
      +'</td><td>'+exp.medicamentos
      +'</td><td><a href="#" class="btn btn-success btn-circle btn-sm"><i class="fas fa-check"></i></a></td></tr>';

      listadoHTML += expHTML;
    }
    

    document.querySelector('#expediente tbody').outerHTML = listadoHTML;

}