package ejb;

import javax.annotation.Resource;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;
import javax.inject.Inject;

import org.eclipse.microprofile.config.Config;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import util.AutomaticallyConvertibleByConstructor;
import util.AutomaticallyConvertibleByOf;
import util.AutomaticallyConvertibleByParse;
import util.AutomaticallyConvertibleByValueOf;

@Stateless
public class HelloBean implements HelloBeanRemote {

    @Inject
    Config config;

    @Inject
    @ConfigProperty(name = "annotationDefault", defaultValue = "Default value from ejb.HelloBean annotation")
    String defaultProperty;

    @Inject
    @ConfigProperty(name = "propfileDefault", defaultValue = "Default value from ejb.HelloBean annotation")
    String overridenProperty;

    @Inject
    @ConfigProperty(name = "managementDefault", defaultValue = "Default value from ejb.HelloBean annotation")
    String wildflymodelProperty;

    @Inject
    @ConfigProperty(name = "property_converted_by_constructor", defaultValue = "Automatically converted property 1")
    AutomaticallyConvertibleByConstructor propertyConvertedByConstructor;

    @Inject
    @ConfigProperty(name = "property_converted_by_of", defaultValue = "Automatically converted property 2")
    AutomaticallyConvertibleByOf propertyConvertedByOf;

    @Inject
    @ConfigProperty(name = "property_converted_by_parse", defaultValue = "Automatically converted property 3")
    AutomaticallyConvertibleByParse propertyConvertedByParse;

    @Inject
    @ConfigProperty(name = "property_converted_by_value_of", defaultValue = "Automatically converted property 4")
    AutomaticallyConvertibleByValueOf propertyConvertedByValueOf;

    @Inject
    @ConfigProperty(name = "nonzero_int_converted_to_zero_by_priority_of_custom_converter", defaultValue = "42")
    int convertedToZero;

    @Inject
    @ConfigProperty(name = "directoryProperty")
    String directoryProperty;

    @Resource
    SessionContext ctx;

    public HelloBean() {
    }

    @Override
    public String hello() {
        System.out.println("method hello() invoked");
        StringBuilder sb = new StringBuilder();
        sb.append("annotationDefault = " + defaultProperty + "\n");
        sb.append("propfileDefault = " + overridenProperty + "\n");
        sb.append("managementDefault = " + wildflymodelProperty + "\n");
        sb.append("directoryProperty = " + directoryProperty + "\n");
        sb.append("property_converted_by_constructor = " + propertyConvertedByConstructor + "\n");
        sb.append("property_converted_by_of = " + propertyConvertedByOf + "\n");
        sb.append("property_converted_by_parse = " + propertyConvertedByParse + "\n");
        sb.append("property_converted_by_value_of = " + propertyConvertedByValueOf + "\n");
        sb.append("nonzero_int_converted_to_zero_by_priority_of_custom_converter = " + convertedToZero);
        return sb.toString();
    }

}
