<!DOC TYPE html>
<html>
<head>
    <title>Песня</title>
</head>
<body>
    <h1>Песня</h1>
    <hr>
    <h4>Подробная информация о песне</h4>
    <b>Название: </b>${song.title}<br>
    <b>Исполнитель: </b>${song.singer}<br>
    <b>Жанр: </b>${song.genre}<br>
    <b>Длительность: </b>${song.duration} секунд<br>
    <b>Альбом: </b>${song.album}<br>
    <hr>
    <h3>Удалить песню</h3>
    <form action="/songs/delete/${song.id}" method="post">
        <input type="submit" value="Удалить песню">
    </form>
</body>
</html>