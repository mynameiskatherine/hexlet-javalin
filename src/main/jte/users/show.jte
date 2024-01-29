@import org.example.hexlet.dto.users.UserPage
@param UserPage page

@template.layout.page(
title = @`
    <title>page title</title>
`,
main = @`
    <p>content</p>
`,
footer = @`
    <p>bye-bye footer</p>
`
)
