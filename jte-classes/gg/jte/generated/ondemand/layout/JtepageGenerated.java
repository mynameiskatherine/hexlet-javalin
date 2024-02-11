package gg.jte.generated.ondemand.layout;
import gg.jte.Content;
public final class JtepageGenerated {
	public static final String JTE_NAME = "layout/page.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,1,1,16,16,16,16,19,19,21,21,21,23,23,25,25,25,27,27,29,29,29,31,31,33};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, Content title, Content header, Content main, Content footer) {
		jteOutput.writeContent("\n\n<!doctype html>\n<html lang=\"en\">\n<head>\n    <meta charset=\"utf-8\" />\n    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/css/bootstrap.min.css\"\n          rel=\"stylesheet\"\n          integrity=\"sha384-KyZXEAg3QhqLMpG8r+8fhAXLRk2vvoC2f3B09zVXn8CA5QIVfZOJ3BCsw2P0p/We\"\n          crossorigin=\"anonymous\">\n    ");
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
