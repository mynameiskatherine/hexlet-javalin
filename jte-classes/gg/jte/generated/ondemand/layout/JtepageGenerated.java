package gg.jte.generated.ondemand.layout;
import gg.jte.Content;
public final class JtepageGenerated {
	public static final String JTE_NAME = "layout/page.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,11,11,11,11,14,14,16,16,16,18,18,20,20,20,22,22,24,24,24,26,26,28};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Content title, Content header, Content main, Content footer) {
		jteOutput.writeContent("\n\n<!doctype html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"utf-8\">\n    ");
		jteOutput.setContext("head", null);
		jteOutput.writeUserContent(title);
		jteOutput.writeContent("\n</head>\n<body>\n");
		if (header != null) {
			jteOutput.writeContent("\n<header>\n    ");
			jteOutput.setContext("header", null);
			jteOutput.writeUserContent(header);
			jteOutput.writeContent("\n</header>\n");
		}
		jteOutput.writeContent("\n<main>\n    ");
		jteOutput.setContext("main", null);
		jteOutput.writeUserContent(main);
		jteOutput.writeContent("\n</main>\n");
		if (footer != null) {
			jteOutput.writeContent("\n    <header>\n        ");
			jteOutput.setContext("header", null);
			jteOutput.writeUserContent(footer);
			jteOutput.writeContent("\n    </header>\n");
		}
		jteOutput.writeContent("\n</body>\n</html>");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		Content title = (Content)params.get("title");
		Content header = (Content)params.getOrDefault("header", null);
		Content main = (Content)params.get("main");
		Content footer = (Content)params.get("footer");
		render(jteOutput, jteHtmlInterceptor, title, header, main, footer);
	}
}
