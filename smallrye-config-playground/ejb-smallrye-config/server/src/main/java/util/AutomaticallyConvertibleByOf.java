package util;

/**
 * @author <a href="mailto:mjurc@redhat.com">Michal Jurc</a> (c) 2018 Red Hat, Inc.
 */
public class AutomaticallyConvertibleByOf {

    private String wrappedString;

    public AutomaticallyConvertibleByOf() {
        wrappedString = "Nothing in here yet.";
    }

    public String getWrappedString() {
        return wrappedString;
    }

    public void setWrappedString(String wrappedString) {
        this.wrappedString = wrappedString;
    }

    public static AutomaticallyConvertibleByOf of(String wrappedString) {
        if (wrappedString != null || !wrappedString.isEmpty()) {
            AutomaticallyConvertibleByOf accessor = new AutomaticallyConvertibleByOf();
            accessor.setWrappedString(wrappedString + " automatically converted by public static T of(String) method.");
            return accessor;
        } else throw new IllegalArgumentException("Parameter wrappedString cannot be null or empty.");
    }

    @Override
    public String toString() {
        return "AutomaticallyConvertibleByOf{" +
                "wrappedString='" + wrappedString + '\'' +
                '}';
    }
}
