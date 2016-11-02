<html>
<head>
    <title>PhraseHolder</title>
    <meta charset="utf-8"/>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="/static/js/rest.js"></script>
    <link href="/static/css/style.css" rel="stylesheet" type="text/css"/>
</head>

<body>
<h2>Page1</h2>
<div class="thoughts">
    <div>
        <h1> What are you thinking about?</h1>
        <textarea id="thoughtarea" cols="110" rows="8" name="thought"></textarea>
        <button id="addThought" type="button">Add</button>
    </div>
    <h1>Last thoughts</h1>
    <table id="thoughtsTable">
        <tr id="tr">
            <td>Why People Don't Fly? This is a question.</td>
            <td>10 Oct 2016 22:15</td>
        </tr>
    </table>
</div>

</body>
</html>
