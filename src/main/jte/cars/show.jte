@import org.example.hexlet.dto.car.CarPage
@param CarPage page

@template.layout.page(
title = @`
    <title>title</title>
`,
main = @`
    <table>
        <tr>
            <td>${page.getCar().getId()}</td>
            <td>${page.getCar().getMake()}</td>
            <td>${page.getCar().getModel()}</td>
        </tr>
    </table>
`,
footer = @`
    <p>bye-bye footer</p>
`
)
