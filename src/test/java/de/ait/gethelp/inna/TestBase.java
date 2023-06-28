package de.ait.gethelp.inna;

import de.ait.gethelp.BackendDemoApplication;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {
    public static BackendDemoApplication application;

    @BeforeAll
    public static void init(){
        System.out.println("Init @BeforeAll");
        application= new BackendDemoApplication();
    }
}
