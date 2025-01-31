setInterval(()=>{let clock=document.getElementById("clock");
let time= new Date();
clock.textContent =time.getHours() +":" + time.getMinutes() + ":" + time.getSeconds();


})

