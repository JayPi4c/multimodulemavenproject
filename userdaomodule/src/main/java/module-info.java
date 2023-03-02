module com.jaypi4c.userdaomodule {
    requires static lombok;

    requires com.jaypi4c.entitymodule;
    requires com.jaypi4c.daomodule;

    provides com.jaypi4c.dao.Dao with com.jaypi4c.userdao.UserDao;

    exports com.jaypi4c.userdao;
}