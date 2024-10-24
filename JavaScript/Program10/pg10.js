const list = {
    "Canada": "Ottawa",
    "Brazil": "Brasília",
    "Germany": "Berlin",
    "France": "Paris",
    "Australia": "Canberra",
    "India": "Delhi",
    "China": "Beijing",
  };

  let selectBox = document.getElementById("country");
  let textBox = document.getElementById("capital");
  selectBox.addEventListener("change",(event)=>{
    textBox.value = list[event.target.value] 
  })