package gg.jte.generated.ondemand.users;
import org.example.hexlet.dto.users.UserPage;
public final class JteshowGenerated {
	public static final String JTE_NAME = "users/show.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,3,3,7,7,8,8,8,9,9,9,9,12,12,12,13,13,13,14,14,14,15,15,15,18,18,18,18,20,20,20,21};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, UserPage page) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <title>User Id ");
				jteOutput.setContext("title", null);
				jteOutput.writeUserContent(page.getUser().getId());
				jteOutput.writeContent("</title>\n");
			}
		}, null, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <table>\n        <tr>\n            <td>");
				jteOutput.setContext("td", null);
				jteOutput.writeUserContent(page.getUser().getId());
				jteOutput.writeContent("</td>\n            <td>");
				jteOutput.setContext("td", null);
				jteOutput.writeUserContent(page.getUser().getFirstName());
				jteOutput.writeContent("</td>\n            <td>");
				jteOutput.setContext("td", null);
				jteOutput.writeUserContent(page.getUser().getLastName());
				jteOutput.writeContent("</td>\n            <td>");
				jteOutput.setContext("td", null);
				jteOutput.writeUserContent(page.getUser().getEmail());
				jteOutput.writeContent("</td>\n        </tr>\n    </table>\n");
			}
		}, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <p>bye-bye footer</p>\n");
			}
		});
		jteOutput.writeContent("\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		UserPage page = (UserPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
