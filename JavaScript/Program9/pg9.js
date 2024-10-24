
let text = document.getElementById("text");
text.addEventListener("focus", () => {
    text.style.color = "red";
    text.style.backgroundColor = "blue";
});
text.addEventListener("blur", () => {
    text.style.color = "blue";
    text.style.backgroundColor = "red";
});