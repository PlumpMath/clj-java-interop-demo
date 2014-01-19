(ns testapp-12.core
	(:require clojure.contrib.string)
	)

(defn test-fn [] 
	(do
		(println "test clojure app")
		(println (clojure.contrib.string/butlast 3 "aaa bbb ccc"))
	)
)