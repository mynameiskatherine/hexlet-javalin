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
    <form action="/users" method="get">
        <input type="search" required name="search" value="${page.getSearch()}">
        <input type="submit" value="Search">
    </form>
    @if(page.getUserList().isEmpty())
        @if(page.getSearch() != null)
            <p>No users found</p>
        @else
            <p>No Users added</p>
        @endif
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

