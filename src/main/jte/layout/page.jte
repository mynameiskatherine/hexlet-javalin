@import gg.jte.Content
@param Content title
@param Content header = null
@param Content main
@param Content footer


<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We"
          crossorigin="anonymous">
    ${title}
</head>
<body>
@if (header != null)
<header>
    ${header}
</header>
@endif
<main>
    ${main}
</main>
@if (footer != null)
    <header>
        ${footer}
    </header>
@endif
</body>
</html>