package common;

import ru.qatools.properties.Property;
import ru.qatools.properties.Resource;

@Resource.Classpath("config.properties")
public interface TestConfig {
    @Property("baseURL")
    String getBaseURL();

    @Property("username")
    String getUsername();

    @Property("password")
    String getPassword();

    @Property("baseURI")
    String getBaseURI();
}