
let colors=["red","blue","green","black","pink","brown"] 

let x=0

const change = () => {
    
    document.body.style.backgroundColor= colors[x]
    x++;
    if(x>colors.length){
        x=0;
    }
}