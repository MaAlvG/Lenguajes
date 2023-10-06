// Call the dataTables jQuery plugin
$(document).ready(function() {
    
  });
  
  async function addExp(){
        let datos ={};
        datos.id = document.getElementById('cedPct').value;
        datos.fecha= document.getElementById('fecha').value;
        datos.padecimiento = document.getElementById('padc').value;
        datos.procedimiento = document.getElementById('procd').value;
        datos.medicamentos= document.getElementById('meds').value;
        

      const request = await fetch('api/addExp', {
        method: 'POST',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
        body: JSON.stringify(datos)
      });
      const expedientes = await request.json();
      
      console.log(expedientes);

  
  }