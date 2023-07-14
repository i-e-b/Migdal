package e.s.miniweb.controllers;

import android.webkit.WebResourceRequest;

import java.util.Map;

import e.s.miniweb.core.ControllerBase;
import e.s.miniweb.core.ControllerBinding;
import e.s.miniweb.core.template.TemplateResponse;

public class TilesController extends ControllerBase {
    /**
     * The constructor of your controller should bind all it's routes.
     * The constructor should be called in ControllerBindings::BindAllControllers()
     */
    public TilesController() {
        String controller = "tiles";
        // partials
        ControllerBinding.BindMethod(controller, "CharacterTile", this::characterTile);
        ControllerBinding.BindMethod(controller, "SubstituteTile", this::substituteTile);
    }

    /**
     * Render a sample of a single character, and some info
     */
    private TemplateResponse characterTile(Map<String, String> parameters, WebResourceRequest request) {
        return Page("tiles/character-tile", parameters);
    }

    /**
     * Similar to characterTile, but lists the kind of substitution (e.g. lower case, upper case)
     */
    private TemplateResponse substituteTile(Map<String, String> parameters, WebResourceRequest request) {
        return Page("tiles/substitute-tile", parameters);
    }
}