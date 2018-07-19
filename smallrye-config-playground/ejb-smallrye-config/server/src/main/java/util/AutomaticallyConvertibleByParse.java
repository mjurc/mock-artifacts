package util;

/**
 * @author <a href="mailto:mjurc@redhat.com">Michal Jurc</a> (c) 2018 Red Hat, Inc.
 */
public class AutomaticallyConvertibleByParse {

    private String wrappedString;

    public AutomaticallyConvertibleByParse() {
        wrappedString = "Nothing in here yet.";
    }

    public String getWrappedString() {
        return wrappedString;
    }

    public void setWrappedString(String wrappedString) {
        this.wrappedString = wrappedString;
    }

    public static AutomaticallyConvertibleByParse parse(CharSequence wrappedString) {
        if (wrappedString != null || wrappedString.length() != 0) {
            AutomaticallyConvertibleByParse accessor = new AutomaticallyConvertibleByParse();
            accessor.setWrappedString(wrappedString + " automatically converted by public static T parse(CharSequence) method.");
            return accessor;
        } else throw new IllegalArgumentException("Parameter wrappedString cannot be null or empty.");
    }

    @Override
    public String toString() {
        return "AutomaticallyConvertibleByParse{" +
                "wrappedString='" + wrappedString + '\'' +
                '}';
    }
}
