@import gg.jte.Content
@param Content title
@param Content header = null
@param Content main
@param Content footer


<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
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