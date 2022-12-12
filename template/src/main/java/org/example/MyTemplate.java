package org.example;


import dev.hephaestus.proximity.app.api.Parent;
import dev.hephaestus.proximity.mtg.MTGOptions;
import dev.hephaestus.proximity.mtg.MTGTemplate;
import dev.hephaestus.proximity.mtg.cards.SingleFacedCard;

public class MyTemplate extends MTGTemplate<SingleFacedCard> {
    public MyTemplate() {
        super("Base Template", 2176, 2960, 800, true);
    }

    @Override
    public boolean canHandle(Object object) {
        return object instanceof SingleFacedCard;
    }

    @Override
    public void createLayers(Parent<SingleFacedCard> layers) {
        layers.image("bg");

        addArt(layers);

        layers.group("text", text -> {
            addNamePlateText(text);
            addCardName(text);
            addTypeLine(text);
            addTextbox(text);
            addPowerAndToughness(text);
            addCollectorInfo(text);
        });
    }

    @Override
    public void createOptions(Options<SingleFacedCard> options) {
        options.add(MTGOptions.SHOW_REMINDER_TEXT);
        options.add(MTGOptions.TRUNCATE_FLASH);
        options.add(MTGOptions.FLAVOR_BAR);
        options.add(MTGOptions.CUSTOM_ART);
        options.add(MTGOptions.ARTIST);
    }
}
