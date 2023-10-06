// Call the dataTables jQuery plugin
$(document).ready(function() {
    
  });
  
  async function addMedico(){
        let datos ={};
        datos.nombre = document.getElementById('nMed').value;
        datos.apellido= document.getElementById('aMed').value;
        datos.cedula = document.getElementById('cedula').value;
        datos.correos = document.getElementById('correo').value;
        datos.especialidad= document.getElementById('especialidad').value;
        

      const request = await fetch('api/addMedico', {
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