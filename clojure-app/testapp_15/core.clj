(ns testapp-15.core
  (:require clojure.string)
	)

(defn test-fn [] 
	(do
		(println "Testing clojure 1.5 app")
    (println "Invocation of 'clojure.string/re-quote-replacement' function (introduced in 1.5):")
    (let [test-str "aaa $1 bbb"]
      (println "Test string: " test-str)
      (println "After escaping replacement string: " (clojure.string/re-quote-replacement test-str)))
  )
)