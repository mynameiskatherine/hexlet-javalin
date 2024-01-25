@import org.example.hexlet.dto.users.UsersPage
@param UsersPage page

@template.layout.page(
title = @`
    <title>${page.getTitle()}</title>
`,
header = @`
    <h1>${page.getTitle()}</h1>
`,
main = @`
    @if(page.getUserList().isEmpty())
        <p>No Users added</p>
    @else
        @for(var user : page.getUserList())
            <table>
                <tr>
                    <td>${user.getId()}</td>
                    <td>${user.getFirstName()}</td>
                    <td>${user.getLastName()}</td>
                    <td>${user.getEmail()}</td>
                    <td><a href = "/users/${user.getId()}">link</a></td>
                </tr>
            </table>
        @endfor
    @endif
`,
footer = @`
    <p>bye-bye footer</p>
`
)

