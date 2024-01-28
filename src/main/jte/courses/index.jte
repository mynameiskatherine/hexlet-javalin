@import org.example.hexlet.dto.courses.CoursesPage
@param CoursesPage page

@template.layout.page(
title = @`
    <title>${page.getHeader()}</title>
`,
header = @`
    <h1>${page.getHeader()}</h1>
`,
main = @`
    <form action="/courses" method="get">
        <input type="search" required name="search" value="${page.getSearch()}">
        <input type="submit" value="Search">
    </form>
    @if(page.getCourses().isEmpty())
        @if(page.getSearch() != null)
            <p>Курсов не найдено</p>
        @else
            <p>Пока не добавлено ни одного курса</p>
        @endif
    @else
        @for(var course : page.getCourses())
            <div>
                <h2><a href="/courses/${course.getId()}">${course.getName()}</a></h2>
                <p>${course.getDescription()}</p>
            </div>
        @endfor
    @endif
`,
footer = @`
    <p>bye-bye footer</p>
`
)
