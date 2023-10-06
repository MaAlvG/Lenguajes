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
      +'</td><td><a href="#" onclick="mostrarExpediente('+paciente.cedula+')" class="btn btn-success btn-circle btn-sm"><i class="fas fa-check"></i></a></td></tr>';

      listadoHTML += pacienteHTML;
    }
    document.getElementById("tableHeader").outerHTML = "Pacientes";
    document.querySelector('#pacientes thead').outerHTML = '<tr><th>Apellido</th>'
                                                            +'<th>Nombre</th>'
                                                            +'<th>Cedula</th>'
                                                            +'<th>Email</th>'
                                                            +'<th>Medico de cabecera</th>'
                                                            +'<th>Ver expediente</th></tr>';

    document.querySelector('#pacientes tbody').outerHTML = listadoHTML;

}

async function mostrarExpediente(id){
  alert(id); 

  const request = await fetch('api/expediente/'+id, {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
  });
  const expedientes = await request.json();

  let listadoHTML = '';
    for(let expediente of expedientes){
      let pacienteHTML = '<tr><td>'+expediente.fecha
      +'</td><td>'+expediente.padecimiento
      +'</td><td>'+expediente.procedimiento
      +'</td><td>'+expediente.medicamentos
      +'</td><td><a href="#" class="btn btn-success btn-circle btn-sm"><i class="fas fa-check"></i></a></td></tr>';

      listadoHTML += pacienteHTML;
    }
  document.querySelector('#pacientes thead').outerHTML = '<tr><th>Fecha</th>'
                                                            +'<th>Padecimiento</th>'
                                                            +'<th>Procedimiento</th>'
                                                            +'<th>Medicamentos</th>'
                                                            +'<th>Hacer consulta</th></tr>';
  document.querySelector('#pacientes tbody').outerHTML = listadoHTML;   
}