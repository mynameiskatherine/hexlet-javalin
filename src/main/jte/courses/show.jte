@import org.example.hexlet.dto.courses.CoursePage
@param CoursePage page

@template.layout.page(
title = @`
    <title>${page.getCourse().getName()}</title>
`,
header = @`
    <h1>${page.getCourse().getName()}</h1>
`,
main = @`
    <p>${page.getCourse().getDescription()}</p>
`,
footer = @`
    <p>bye-bye footer</p>
`
)
