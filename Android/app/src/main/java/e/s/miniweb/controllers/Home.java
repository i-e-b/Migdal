package e.s.miniweb.controllers;

import android.webkit.WebResourceRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import e.s.miniweb.core.ControllerBase;
import e.s.miniweb.core.ControllerBinding;
import e.s.miniweb.core.template.TemplateResponse;
import e.s.miniweb.models.CharacterInfoModel;
import e.s.miniweb.models.NestedObjectModel;

/*
    This controller provides the app://home path
    The app://home/index method is where your app will start.

    You could put log-in screens here etc.

    There is no requirement to name controller classes
    the same as the url routing name, but it can be
    confusing if you don't.

    It's not required to `extends ControllerBase`,
    but it is helpful.
 */

@SuppressWarnings("unused")
public class Home extends ControllerBase {
    /**
     * The constructor of your controller should bind all it's routes.
     * The constructor should be called in ControllerBindings::BindAllControllers()
     */
    public Home() {
        String controller = "home";
        ControllerBinding.BindMethod(controller, "index", this::index);
        ControllerBinding.BindMethod(controller, "details", this::details);
    }

    /**
     * Show complete details of a single character
     */
    private TemplateResponse details(Map<String, String> parameters, WebResourceRequest request) {
        return Page("home/details", new CharacterInfoModel("0041", "Latin Capital Letter A"));
    }

    /**
     * "index" is the default route method if a url only gives a controller name.
     * "home/index" is the special landing page (feel free to use the url "app://home" anywhere)
     */
    public TemplateResponse index(Map<String, String> parameters, WebResourceRequest request) {
        // viewPath is required, but model is optional.


        List<CharacterInfoModel> list = new ArrayList<>();
        list.add(new CharacterInfoModel("0041", "Latin Capital Letter A"));
        list.add(new CharacterInfoModel("0042", "Latin Capital Letter B"));
        list.add(new CharacterInfoModel("0043", "Latin Capital Letter C"));
        list.add(new CharacterInfoModel("0044", "Latin Capital Letter D"));
        list.add(new CharacterInfoModel("0045", "Latin Capital Letter E"));

        Object model = new Object() {
            public final List<CharacterInfoModel> characterList = list;
        };

        return Page("home/index", model);
    }
}
