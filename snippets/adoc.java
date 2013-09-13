import static org.asciidoctor.AttributesBuilder.attributes;
import static org.asciidoctor.OptionsBuilder.options;

...

Attributes attributes = attributes().backend("docbook").get();
Options options = options().inPlace(true).attributes(attributes).get();

String render = asciidoctor.renderFile("sample.asciidoc", options);

...