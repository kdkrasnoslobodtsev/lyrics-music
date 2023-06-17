<!DOC TYPE html>
<html>
<head>
    <title>Плейлист</title>
</head>
<body>
    <h1>Плейлист</h1>
    <hr>
    <h4>Подробная информация о плейлисте</h4>
    <b>Название: </b>${playlist.title}<br>
    <hr>
<#list songs as song>
        <div>
            <p><b>${song.title}</b> ${song.singer} ${song.genre}} | <a href="/songs/${song.id}">Подробнее...</a></p>
        </div>
        <#else>
            <h3>Песен нет</h3>
    </#list>
    <hr>
</body>
</html>