@import org.example.hexlet.dto.car.CarsPage
@param CarsPage page

@template.layout.page(
title = @`
    <title>title</title>
`,
header = @`
    <h1>header</h1>
`,
main = @`
    @if(page.getCars().isEmpty())
        <p>No cars found</p>
    @else
        @for(var car : page.getCars())
            <table>
                <tr>
                    <td>${car.getId()}</td>
                    <td>${car.getMake()}</td>
                    <td>${car.getModel()}</td>
                    <td><a href = "/cars/${car.getId()}">link</a></td>
                </tr>
            </table>
        @endfor
    @endif
`,
footer = @`
    <p>bye-bye footer</p>
`
)

