package pl.akomar.clj_java_interop_demo;

import java.net.MalformedURLException;

public class App {
    public static void main(String[] args) throws MalformedURLException {
        Clojure12Runner runner12 = new Clojure12Runner();
        runner12.executeClojure();

        Clojure15Runner runner15 = new Clojure15Runner();
        runner15.executeClojure();
    }
}
