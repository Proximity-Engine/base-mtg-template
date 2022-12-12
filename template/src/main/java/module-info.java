import dev.hephaestus.proximity.app.api.Template;
import org.example.MyTemplate;

open module base_template {
    requires dev.hephaestus.proximity.app;
    requires dev.hephaestus.proximity.mtg;
    requires dev.hephaestus.proximity.scryfall;
    requires java.desktop;
    requires dev.hephaestus.proximity.json;

    provides Template with MyTemplate;
}