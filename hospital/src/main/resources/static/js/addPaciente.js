// Call the dataTables jQuery plugin
$(document).ready(function() {
    
  });
  
  async function addPaciente(){
        let datos ={};
        datos.nombre = document.getElementById('nMed').value;
        datos.apellido= document.getElementById('aMed').value;
        datos.cedula = document.getElementById('cedula').value;
        datos.correos = document.getElementById('correo').value;
        datos.medicoCabecera= document.getElementById('medCab').value;
        

      const request = await fetch('api/addPaciente', {
        method: 'POST',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)
      });
      const paciente = await request.json();
      
      console.log(paciente);

  
  }