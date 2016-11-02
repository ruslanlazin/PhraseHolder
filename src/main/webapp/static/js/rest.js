window.onload = function () {
    document.getElementById('addThought').onclick = addThought;
    console.log("load")
}


function addThought() {
    console.log("add")

    var thought = document.getElementById('thoughtarea').value;

    if (thought.length > 0) {
        var xmlhttp = getXmlHttp(); // Создаём объект XMLHTTP
        xmlhttp.open('POST', '/la', true); // Открываем асинхронное соединение
        xmlhttp.setRequestHeader('Content-Type', 'application/x-www-form-urlencoded'); // Отправляем кодировку
        xmlhttp.setRequestHeader('accept', 'application/json'); // Отправляем тип
        xmlhttp.send('thought=' + encodeURIComponent(thought)); // Отправляем POST-запрос

        var newTr = document.createElement('tr');
        newTr.innerHTML = '<td>' + thought + '</td><td> a moment ago </td>';
        var thoughtsTable = document.getElementById('thoughtsTable');
        thoughtsTable.insertBefore(newTr, thoughtsTable.firstChild);
        document.getElementById('thoughtarea').value = '';

        xmlhttp.onreadystatechange = function () { // Ждём ответа от сервера
            if (xmlhttp.readyState == 4) { // Ответ пришёл

                console.log(xmlhttp.responseText)
                if (xmlhttp.status == 200) { // Сервер вернул код 200 (что хорошо)
                    console.log("200")

                } else if (xmlhttp.status == 401) { // Сервер вернул код 401 (неавторизован)
                    console.log("401")
                    console.log(xmlhttp.responseText)
                } else if (xmlhttp.status == 404) { // Сервер вернул код 404 (нет такой новости)
                    console.log("404")
                    console.log(xmlhttp.responseText)
                }
            }
        }
    }

    function getXmlHttp() {
        var xmlhttp;
        try {
            xmlhttp = new ActiveXObject('Msxml2.XMLHTTP');
        } catch (e) {
            try {
                xmlhttp = new ActiveXObject('Microsoft.XMLHTTP');
            } catch (E) {
                xmlhttp = false;
            }
        }
        if (!xmlhttp && typeof XMLHttpRequest != 'undefined') {
            xmlhttp = new XMLHttpRequest();
        }
        return xmlhttp;
    }
}