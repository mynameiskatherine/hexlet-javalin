@import org.example.hexlet.dto.CoursePage
@param CoursePage page

<!doctype html>
<html lang="en">
<main>
    <h1>${page.getCourse().getName()}</h1>
    <p>${page.getCourse().getDescription()}</p>
</main>
</html>