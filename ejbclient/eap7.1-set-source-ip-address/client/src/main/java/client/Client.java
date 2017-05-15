package client;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.PrivilegedActionException;
import java.security.Security;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.jboss.ejb.client.Affinity;
import org.jboss.ejb.client.EJBClient;
import org.jboss.ejb.client.EJBClientContext;
import org.wildfly.common.net.CidrAddress;
import org.wildfly.naming.client.WildFlyInitialContextFactory;
import org.xnio.Xnio;
import org.xnio.XnioWorker;

import ejb.HelloBeanRemote;

public class Client {

    public static void main(String[] args)
            throws Exception {
        InitialContext ctx = new InitialContext(getCtxProperties());
        try {
            String lookupName = "ejb:/server/HelloBean!ejb.HelloBeanRemote?stateful";
            HelloBeanRemote bean = (HelloBeanRemote)ctx.lookup(lookupName);
            System.out.println(bean.hello());
        } finally {
            ctx.close();
        }
    }

    public static Properties getCtxProperties() {
        Properties props = new Properties();
        props.put(Context.INITIAL_CONTEXT_FACTORY, WildFlyInitialContextFactory.class.getName());
        return props;
    }

}
