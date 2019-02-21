package pom;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class getTagApplication extends Application<getTagConfiguration> {

    public static void main(final String[] args) throws Exception {
        new getTagApplication().run(args);
    }

    @Override
    public String getName() {
        return "getInfo";
    }

    @Override
    public void initialize(final Bootstrap<getTagConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final getTagConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
