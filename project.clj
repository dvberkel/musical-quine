(defproject musical-quine "1.0.0-SNAPSHOT"
  :description "A musical quine."
  :url "https://github.com/dvberkel/musical-quine"
  :license {:name "The MIT License (MIT)"
            :url "http://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot musical-quine.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
