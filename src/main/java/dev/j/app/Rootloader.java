package dev.j.app;

import dev.j.App;
import dev.sol.core.application.loader.FXLoader;
import javafx.scene.Scene;

public class Rootloader extends FXLoader {

    @Override
    public void load() {
        Scene scene = (Scene) params.get("scene");
    
    scene.setRoot(root);

    RootControllor controller =  loader.getController();
    App.CONTROLLER_REGISTER.register("ROOT", controller);
    controller.addParameter("SCENE", scene).load();
    
    }
    
}
