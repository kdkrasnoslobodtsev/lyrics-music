<!DOC TYPE html>
<html>
<head>
    <title>Плейлисты</title>
</head>
<body>
    <h1>Плейлисты</h1>
    <hr>
    <h4>Все плейлисты</h4>
        <#list playlists as playlist>
            <div>
                <p><b>${playlist.title}</b> | <a href="/playlists/${playlist.id}">Подробнее...</a></p>
            </div>
            <#else>
                 <h3>Плейлистов нет</h3>
        </#list>
        <hr>
        <h3>Создать плейлист</h3>
        <form action="/playlists/create" method="post">
            Название : <input type="text" name="title"/> <br><br>
            <input type="submit" value="Добавить плейлист">
        </form>
</body>
</html>