package util;

/**
 * @author <a href="mailto:mjurc@redhat.com">Michal Jurc</a> (c) 2018 Red Hat, Inc.
 */
public class AutomaticallyConvertibleByConstructor {

    private String wrappedString;

    public AutomaticallyConvertibleByConstructor(String wrappedString) {
        this.wrappedString = wrappedString + " automatically converted by Constructor with a string parameter.";
    }

    public String getWrappedString() {
        return wrappedString;
    }

    public void setWrappedString(String wrappedString) {
        this.wrappedString = wrappedString;
    }

    @Override
    public String toString() {
        return "AutomaticallyConvertibleByConstructor{" +
                "wrappedString='" + wrappedString + '\'' +
                '}';
    }
}
