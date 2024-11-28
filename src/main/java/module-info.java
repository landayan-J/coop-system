module dev.j {
        requires javafx.controls;
    requires javafx.fxml;
    requires transitive core.fx;
    requires transitive core.db;
    requires java.base;
    requires core.util;
    requires javafx.base;
    requires atlantafx.base;

    opens dev.j to javafx.fxml;
    opens dev.j.app to javafx.fxml;

    exports dev.j;
    exports dev.j.app;
}
    

