module mainappmodule {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.jaypi4c.entitymodule;
    requires com.jaypi4c.userdaomodule;
    requires com.jaypi4c.daomodule;

    uses com.jaypi4c.dao.Dao;

    opens com.jaypi4c to javafx.fxml;

    exports com.jaypi4c;
}