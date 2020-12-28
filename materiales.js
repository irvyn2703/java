
  // filtro de letras
  var contador = 0;
  var material = document.querySelectorAll('.material');
  var $herreria = document.getElementById('herre');
  var $aluminio = document.getElementById('alum');
  var saludo = function(e){
    contador = 0;
    var palabra = e.target.value.toLowerCase();
    
    console.log(palabra);
    
    document.querySelectorAll('.nombre').forEach(x => {
      if (x.textContent.toLowerCase().includes(palabra) ){
        material[contador].classList.remove("ocultar");
      } 
      else material[contador].classList.add("ocultar");

      contador++;
    })
  }

  // llamada al filtro de letras
  var filtrado = document.getElementById('filtro');
  filtrado.addEventListener("keyup",saludo);
  
  // filtro de herreria
  var verHerreria = false;
  var tipo1 = function(){
    if (verHerreria === true){
      verHerreria = false;
    }
    else
    verHerreria = true;

    if (verHerreria == true) {
      $herreria.classList.remove("ocultar");
    }
    else $herreria.classList.add("ocultar");
  }

  // filtro de Aluminio
  var verAluminio = false;
  var tipo2 = function(){
    if (verAluminio === true){
      verAluminio = false;
    }
    else
    verAluminio = true;

    if (verAluminio == true) {
      $aluminio.classList.remove("ocultar");
    }
    else $aluminio.classList.add("ocultar");
  }

  // llamada al filtro de herreria
  var herreria = document.getElementById('herreria');
  herreria.addEventListener("click",tipo1);

  // llamada al filtro de aluminio
  var aluminio = document.getElementById('aluminio');
  aluminio.addEventListener("click",tipo2);
  