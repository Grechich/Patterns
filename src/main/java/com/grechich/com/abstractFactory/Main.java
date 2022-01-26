package com.grechich.com.abstractFactory;

import com.grechich.com.abstractFactory.factories.ColaDrinksFactory;
import com.grechich.com.abstractFactory.factories.PepsiDrinksFactory;

public class Main {
    private static Application configureApp() {
        PepsiDrinksFactory pdf = new PepsiDrinksFactory();
        ColaDrinksFactory cdf = new ColaDrinksFactory();
        Application app = new Application(cdf);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApp();
        app.breaks();
        app.loksLike();
    }

}
