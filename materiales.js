let d=document;

export default function searchfilter (input,select){
  d.addEventListener("keyup",e => {
      if (e.target.matches(input)){
          console.log(e.key);
      }
  })
}

searchfilter(filtro,material);