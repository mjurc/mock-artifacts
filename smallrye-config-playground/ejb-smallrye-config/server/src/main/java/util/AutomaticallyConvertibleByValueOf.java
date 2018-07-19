package util;

/**
 * @author <a href="mailto:mjurc@redhat.com">Michal Jurc</a> (c) 2018 Red Hat, Inc.
 */
public class AutomaticallyConvertibleByValueOf {

    private String wrappedString;

    public AutomaticallyConvertibleByValueOf() {
        wrappedString = "Nothing in here yet.";
    }

    public String getWrappedString() {
        return wrappedString;
    }

    public void setWrappedString(String wrappedString) {
        this.wrappedString = wrappedString;
    }

    public static AutomaticallyConvertibleByValueOf valueOf(String wrappedString) {
        if (wrappedString != null || !wrappedString.isEmpty()) {
            AutomaticallyConvertibleByValueOf accessor = new AutomaticallyConvertibleByValueOf();
            accessor.setWrappedString(wrappedString + " automatically converted by public static T valueOf(String) method.");
            return accessor;
        } else throw new IllegalArgumentException("Parameter wrappedString cannot be null or empty.");
    }

    @Override
    public String toString() {
        return "AutomaticallyConvertibleByValueOf{" +
                "wrappedString='" + wrappedString + '\'' +
                '}';
    }
}
