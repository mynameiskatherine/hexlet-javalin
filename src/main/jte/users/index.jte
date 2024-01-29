@import org.example.hexlet.dto.users.UsersPage
@param UsersPage page

@template.layout.page(
title = @`
    <title>page title</title>
`,
header = @`
    <h1>page header</h1>
`,
main = @`
    @for(var user : page.getUserList())
        <table>
            <tr>
                <td>${user.getId()}</td>
                <td>${user.getName()}</td>
                <td>${user.getEmail()}</td>
            </tr>
        </table>
    @endfor
`,
footer = @`
    <p>bye-bye footer</p>
`
)

