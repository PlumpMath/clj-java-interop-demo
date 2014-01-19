package pl.akomar.clj_java_interop_demo;

import org.projectodd.shimdandy.ClojureRuntimeShim;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws MalformedURLException {
        URL[] urls = {new URL("file:C:\\Users\\akomar\\clojure\\clj-java-interop-demo\\shimdandy-impl-1.0.2-SNAPSHOT.jar"),
//                new URL("file:C:\\Users\\akomar\\clojure\\clj-java-interop-demo\\clojure-1.5.1.jar"),
                new URL("file:C:\\Users\\akomar\\clojure\\clj-java-interop-demo\\clojure-1.2.1.jar"),
                new URL("file:C:\\Users\\akomar\\clojure\\clj-java-interop-demo\\clojure-contrib-1.2.0.jar"),
                new URL("file:C:\\Users\\akomar\\clojure\\clj-java-interop-demo\\clojure-app\\")};
        ClassLoader parentClassLoader = App.class.getClassLoader();
        ClassLoader cl = new URLClassLoader(urls, parentClassLoader);
        ClojureRuntimeShim runtime = ClojureRuntimeShim.newRuntime(cl, "my-app-name");

        runtime.require("testapp-12.core");
        Object retval = runtime.invoke("testapp-12.core/test-fn");
    }
}
