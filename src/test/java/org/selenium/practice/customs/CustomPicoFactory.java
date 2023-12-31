package org.selenium.practice.customs;


import io.cucumber.core.backend.ObjectFactory;
import io.cucumber.picocontainer.PicoFactory;
import org.selenium.practice.controller.SauceLabController;
import org.selenium.practice.helpers.ReadConfigHelper;
import org.selenium.practice.controller.ChromeController;
import org.selenium.practice.pages.TaxCalculatePageImpl;


public class CustomPicoFactory implements ObjectFactory
{
    private PicoFactory delegate = new PicoFactory();
    private ReadConfigHelper readConfigHelper =new ReadConfigHelper();



    public CustomPicoFactory()
    {
        setDriver();
        addClass(TaxCalculatePageImpl.class);
    }


    @Override
    public void start() {
        delegate.start();
    }

    @Override
    public void stop() {
        delegate.stop();
    }

    @Override
    public boolean addClass(Class<?> aClass) {
        return delegate.addClass(aClass);
    }

    @Override
    public <T> T getInstance(Class<T> aClass) {
        return delegate.getInstance(aClass);
    }

    private void setDriver()

    {
    boolean runOnLocal=Boolean.parseBoolean(readConfigHelper.readRunOnLocal());
            if(runOnLocal){
                addClass(ChromeController.class);
                return;
            }
        addClass(SauceLabController.class);
    }
}