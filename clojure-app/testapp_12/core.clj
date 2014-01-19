(ns testapp-12.core
	(:require clojure.contrib.string)
	)

(defn test-fn [] 
	(do
		(println "Testing clojure 1.2 app")
    (println "Invocation of 'clojure.contrib.string/butlast' function (compatible with 1.2):")
    (let [test-str "aaa bbb ccc"]
      (println "Test string: " test-str)
      (println "After removing 3 last chars: " (clojure.contrib.string/butlast 3 test-str)))

    ;(println (clojure.string/re-quote-replacement "aaa $1 bbb"))
  )
)