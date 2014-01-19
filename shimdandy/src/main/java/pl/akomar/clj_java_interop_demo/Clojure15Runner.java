package pl.akomar.clj_java_interop_demo;

import org.projectodd.shimdandy.ClojureRuntimeShim;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Clojure15Runner {
    private ClojureRuntimeShim runtime;
    public Clojure15Runner() throws MalformedURLException {
        URL[] urls = {new URL("file:C:\\Users\\akomar\\clojure\\clj-java-interop-demo\\shimdandy-impl-1.0.2-SNAPSHOT.jar"),
                new URL("file:C:\\Users\\akomar\\clojure\\clj-java-interop-demo\\clojure-1.5.1.jar"),
                new URL("file:C:\\Users\\akomar\\clojure\\clj-java-interop-demo\\clojure-app\\")};
        ClassLoader parentClassLoader = App.class.getClassLoader();
        ClassLoader cl = new URLClassLoader(urls, parentClassLoader);
        runtime = ClojureRuntimeShim.newRuntime(cl, "my-app-name");

        runtime.require("testapp-15.core");
    }

    public void executeClojure(){
        Object retval = runtime.invoke("testapp-15.core/test-fn");
        System.out.println(retval);
    }
}
