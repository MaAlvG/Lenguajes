// Call the dataTables jQuery plugin
$(document).ready(function() {
  cargarMedicos();
  $('#medicos').DataTable();
});

async function cargarMedicos(){
  
    const request = await fetch('api/medicos', {
      method: 'GET',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      }
    });
    const medicos = await request.json();
    
    console.log(medicos);

    let listadoHTML = '';
    for(let medico of medicos){
      let medicoHTML = '<tr><td>'+medico.nombre
      +'</td><td>'+medico.apellido
      +'</td><td>'+medico.cedula
      +'</td><td>'+medico.mail
      +'</td><td>'+medico.especialidad
      +'</td><td><a href="#" class="btn btn-success btn-circle btn-sm"><i class="fas fa-check"></i></a></td></tr>';

      listadoHTML += medicoHTML;
    }
    

        document.querySelector('#medicos tbody').outerHTML = listadoHTML;

}