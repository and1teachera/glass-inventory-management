package com.zlatenov.glasswarehouse;

import javafx.fxml.FXMLLoader;
import javafx.util.Callback;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.lang.reflect.Constructor;

@Component
public class SpringFXMLLoader {
    private final ApplicationContext context;

    public SpringFXMLLoader(ApplicationContext context) {
        this.context = context;
    }

    public <T> T load(String fxmlPath) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(fxmlPath));
        loader.setControllerFactory(new SpringControllerFactory());
        return loader.load();
    }

    private class SpringControllerFactory implements Callback<Class<?>, Object> {
        @Override
        public Object call(Class<?> type) {
            try {
                for (Constructor<?> constructor : type.getConstructors()) {
                    if (constructor.getParameterCount() > 0) {
                        return context.getBean(type);
                    }
                }
                return type.getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                throw new RuntimeException("Failed to create controller instance", e);
            }
        }
    }
}