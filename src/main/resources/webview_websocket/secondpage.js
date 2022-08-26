//Функция загрузки текста в текстовое поле
function insertText1() {
    document.getElementById('exampleFormControlTextarea1').value = 'Hello, this is text from js';
}
insertText1();

//Добавляем обработчик события
document.getElementById("loadtext").addEventListener("click", loadText);

function loadText() {
    //document.getElementById('exampleFormControlTextarea2').value = 'Hello, this is text from js';
}

