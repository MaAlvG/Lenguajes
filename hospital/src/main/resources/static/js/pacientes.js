// Call the dataTables jQuery plugin
$(document).ready(function() {
  cargarPacientes();
  $('#pacientes').DataTable();
});

async function cargarPacientes(){
  
    const request = await fetch('api/pacientes', {
      method: 'GET',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      }
    });
    const pacientes = await request.json();
    
    console.log(pacientes);

    let listadoHTML = '';
    for(let paciente of pacientes){
      let pacienteHTML = '<tr><td>'+paciente.nombre
      +'</td><td>'+paciente.apellido
      +'</td><td>'+paciente.cedula
      +'</td><td>'+paciente.mail
      +'</td><td>'+paciente.medicoCabecera
      +'</td><td><a href="#" class="btn btn-success btn-circle btn-sm"><i class="fas fa-check"></i></a></td></tr>';

      listadoHTML += pacienteHTML;
    }
    

        document.querySelector('#pacientes tbody').outerHTML = listadoHTML;

}