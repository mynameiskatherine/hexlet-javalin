package gg.jte.generated.ondemand.cars;
import org.example.hexlet.dto.car.CarPage;
public final class JteshowGenerated {
	public static final String JTE_NAME = "cars/show.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,3,3,7,7,9,9,9,9,12,12,12,13,13,13,14,14,14,17,17,17,17,19,19,19,20};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, CarPage page) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <title>title</title>\n");
			}
		}, null, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <table>\n        <tr>\n            <td>");
				jteOutput.setContext("td", null);
				jteOutput.writeUserContent(page.getCar().getId());
				jteOutput.writeContent("</td>\n            <td>");
				jteOutput.setContext("td", null);
				jteOutput.writeUserContent(page.getCar().getMake());
				jteOutput.writeContent("</td>\n            <td>");
				jteOutput.setContext("td", null);
				jteOutput.writeUserContent(page.getCar().getModel());
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
		CarPage page = (CarPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
