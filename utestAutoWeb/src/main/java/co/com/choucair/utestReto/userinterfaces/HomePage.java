package co.com.choucair.utestReto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
public class HomePage {
    public static final Target REGISTER = Target.the("register").
            locatedBy("//a[@class=\"unauthenticated-nav-bar__sign-up\"]");

}
