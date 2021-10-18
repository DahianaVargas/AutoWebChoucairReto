package co.com.choucair.utestReto.tasks;

import co.com.choucair.utestReto.userinterfaces.*;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.By;

import java.util.Locale;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterUser  implements Task {
    @Override
    public <T extends Actor> void performAs (T actor) {
        actor.attemptsTo(
                Click.on(HomePage.REGISTER),
                SendKeys.of("Emily").into(PersonalPage.FIRSTNAME),
                SendKeys.of("Arango").into(PersonalPage.LASTNAME),
                SendKeys.of("Emi@hotmail.com").into(PersonalPage.EMAIL),
                SendKeys.of("March").into(PersonalPage.MONTH),
                SendKeys.of("5").into(PersonalPage.DAY),
                SendKeys.of("1999").into(PersonalPage.YEAR),
                Click.on(PersonalPage.NEXTLOCATION),
                Click.on(Location.BUTTONLOCATION),
                Click.on(Devices.SISTEMA),
                Click.on(Devices.WINDOWS),
                Click.on(Devices.VERSION),
                Click.on(Devices.XP),
                Click.on(Devices.LANGUAJE),
                Click.on(Devices.ENGLISH),
                Click.on(Devices.BOTTONLASTFINAL),
                SendKeys.of("emilyA221152*").into(Complete.PASSWORD),
                SendKeys.of("emilyA221152*").into(Complete.CONFIRMPASSWORD),
                Click.on(Complete.CHECKONE),
                Click.on(Complete.CHECKTWO),
                Click.on(Complete.BUTTONCOMPLETE)

        );
    }
    public static RegisterUser makeinformation(){
        return  instrumented(RegisterUser.class);
    }


}
