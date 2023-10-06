// Call the dataTables jQuery plugin
$(document).ready(function() {
  cargarExpedientes();
  $('#expedientes').DataTable();
});

async function cargarExpedientes(){
  
    const request = await fetch('api/expedientes', {
      method: 'GET',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      }
    });
    const expedientes = await request.json();
    
    console.log(expedientes);

    let listadoHTML = '';
    for(let expediente of expedientes){
      let expedienteHTML = '<tr><td>'+expediente.nombre
      +'</td><td>'+expediente.apellido
      +'</td><td>'+expediente.cedula
      +'</td><td>'+expediente.mail
      +'</td><td>'+expediente.especialidad
      +'</td><td><a href="#" class="btn btn-success btn-circle btn-sm"><i class="fas fa-check"></i></a></td></tr>';

      listadoHTML += expedienteHTML;
    }
    

        document.querySelector('#expedientes tbody').outerHTML = listadoHTML;

}