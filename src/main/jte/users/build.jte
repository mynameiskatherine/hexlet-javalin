@template.layout.page(
title = @`
    <title>Page title</title>
`,
header = @`
    <h1>Page header</h1>
`,
main = @`
<form action="/users" method="post">
    <div>
        <label>
            Name
            <input type="text" name="name" />
        </label>
    </div>
    <div>
        <label>
            Email
            <input type="email" required name="email" />
        </label>
    </div>
    <div>
        <label>
            Password
            <input type="password" required name="password" />
        </label>
    </div>
    <div>
        <label>
            Repeat password
            <input type="password" required name="passwordConfirmation" />
        </label>
    </div>
    <input type="submit" value="Register" />
</form>
`,
footer = @`
    <p>bye-bye footer</p>
`
)
