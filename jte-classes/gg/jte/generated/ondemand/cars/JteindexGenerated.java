package gg.jte.generated.ondemand.cars;
import org.example.hexlet.dto.car.CarsPage;
public final class JteindexGenerated {
	public static final String JTE_NAME = "cars/index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,3,3,8,8,10,10,10,10,12,12,12,12,13,13,15,15,16,16,19,19,19,20,20,20,21,21,21,22,22,22,22,25,25,26,26,27,27,27,27,29,29,29,31};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, CarsPage page) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <title>title</title>\n");
			}
		}, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    <h1>header</h1>\n");
			}
		}, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n    ");
				if (page.getCars().isEmpty()) {
					jteOutput.writeContent("\n        <p>No cars found</p>\n    ");
				} else {
					jteOutput.writeContent("\n        ");
					for (var car : page.getCars()) {
						jteOutput.writeContent("\n            <table>\n                <tr>\n                    <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(car.getId());
						jteOutput.writeContent("</td>\n                    <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(car.getMake());
						jteOutput.writeContent("</td>\n                    <td>");
						jteOutput.setContext("td", null);
						jteOutput.writeUserContent(car.getModel());
						jteOutput.writeContent("</td>\n                    <td><a href = \"/cars/");
						jteOutput.setContext("a", "href");
						jteOutput.writeUserContent(car.getId());
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
		CarsPage page = (CarsPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
