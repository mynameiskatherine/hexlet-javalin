package gg.jte.generated.ondemand.users;
import org.example.hexlet.dto.users.UsersPage;
public final class JteindexGenerated {
	public static final String JTE_NAME = "users/index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,3,3,8,8,9,9,9,10,10,10,10,11,11,11,12,12,12,12,13,13,15,15,16,16,19,19,19,20,20,20,21,21,21,22,22,22,23,23,23,23,26,26,27,27,28,28,28,28,30,30,30,32};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, UsersPage page) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <title>");
				jteOutput.setContext("title", null);
				jteOutput.writeUserContent(page.getTitle());
				jteOutput.writeContent("</title>\n");
			}
		}, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <h1>");
				jteOutput.setContext("h1", null);
				jteOutput.writeUserContent(page.getTitle());
				jteOutput.writeContent("</h1>\n");
			}
		}, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    ");
				if (page.getUserList().isEmpty()) {
					jteOutput.writeContent("\n        <p>No Users added</p>\n    ");
				} else {
					jteOutput.writeContent("\n        ");
					for (var user : page.getUserList()) {
						jteOutput.writeContent("\n            <table>\n                <tr>\n                    <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(user.getId());
						jteOutput.writeContent("</td>\n                    <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(user.getFirstName());
						jteOutput.writeContent("</td>\n                    <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(user.getLastName());
						jteOutput.writeContent("</td>\n                    <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(user.getEmail());
						jteOutput.writeContent("</td>\n                    <td><a href = \"/users/");
						jteOutput.setContext("a", "href");
						jteOutput.writeUserContent(user.getId());
						jteOutput.setContext("a", null);
						jteOutput.writeContent("\">link</a></td>\n                </tr>\n            </table>\n        ");
					}
					jteOutput.writeContent("\n    ");
				}
				jteOutput.writeContent("\n");
			}
		}, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <p>bye-bye footer</p>\n");
			}
		});
		jteOutput.writeContent("\n\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		UsersPage page = (UsersPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
