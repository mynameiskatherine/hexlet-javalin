@import org.example.hexlet.dto.users.UserPage
@param UserPage page

@template.layout.page(
title = @`
    <title>User Id ${page.getUser().getId()}</title>
`,
main = @`
    <table>
        <tr>
            <td>${page.getUser().getId()}</td>
            <td>${page.getUser().getFirstName()}</td>
            <td>${page.getUser().getLastName()}</td>
            <td>${page.getUser().getEmail()}</td>
        </tr>
    </table>
`,
footer = @`
    <p>bye-bye footer</p>
`
)
