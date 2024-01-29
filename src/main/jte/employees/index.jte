@import org.example.hexlet.dto.employee.EmployeesPage
@param EmployeesPage page

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
    @if(page.getEmployeeList().isEmpty())
        @if(page.getSearch() != null)
            <p>No users found</p>
        @else
            <p>No Users added</p>
        @endif
    @else
        @for(var empl : page.getEmployeeList())
            <table>
                <tr>
                    <td>${empl.getId()}</td>
                    <td>${empl.getFirstName()}</td>
                    <td>${empl.getLastName()}</td>
                    <td>${empl.getEmail()}</td>
                    <td><a href = "/users/${empl.getId()}">link</a></td>
                </tr>
            </table>
        @endfor
    @endif
`,
footer = @`
    <p>bye-bye footer</p>
`
)

