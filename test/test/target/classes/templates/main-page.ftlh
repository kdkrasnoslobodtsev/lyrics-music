<!DOC TYPE html>
<html>
<head>
    <title>Песни</title>
</head>
<body>
    <h1>Песни</h1>
    <hr>
    <h4>Все песни</h4>
        <#list songs as song>
            <div>
                <p><b>${song.title}</b> ${song.singer} ${song.genre} | <a href="/songs/${song.id}">Подробнее...</a></p>
            </div>
            <#else>
                <h3>Песен нет</h3>
        </#list>
        <hr>
        <h3>Создать песню</h3>
            <form action="/songs/create" method="post">
                Название : <input type="text" name="title"/> <br><br>
                Исполнитель : <input type="text" name="singer"/> <br><br>
                Жанр : <input type="text" name="genre"/> <br><br>
                Продолжительность : <input type="number" name="duration"/> <br><br>
                Альбом : <input type="text" name="album"/> <br><br>
                <input type="submit" value="Добавить песню">
            </form>
</body>
</html>