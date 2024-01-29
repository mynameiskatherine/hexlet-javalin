@import org.example.hexlet.dto.employee.EmployeePage
@param EmployeePage page

@template.layout.page(
title = @`
    <title>Employee Id ${page.getEmployee().getId()}</title>
`,
main = @`
    <table>
        <tr>
            <td>${page.getEmployee().getId()}</td>
            <td>${page.getEmployee().getFirstName()}</td>
            <td>${page.getEmployee().getLastName()}</td>
            <td>${page.getEmployee().getEmail()}</td>
        </tr>
    </table>
`,
footer = @`
    <p>bye-bye footer</p>
`
)
