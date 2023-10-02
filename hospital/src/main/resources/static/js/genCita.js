// Call the dataTables jQuery plugin
$(document).ready(function() {
    
  });
  
  async function guardarCita(){
        let datos ={};
        datos.medico_id = document.getElementById('ced_medico').value;
        datos.paciente_id = document.getElementById('ced_paciente').value;
        datos.fecha = document.getElementById('fecha').value;
        datos.hora = document.getElementById('hora').value;

      const request = await fetch('api/cita', {
        method: 'POST',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)
      });
      const medicos = await request.json();
      
      console.log(medicos);

  
  }