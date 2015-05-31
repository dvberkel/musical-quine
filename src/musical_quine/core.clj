(ns musical-quine.core
  (:gen-class))

(defn -main
  "A quine"
  [& args]
  (let [s "(ns musical-quine.core\n  (:gen-class))\n\n(defn -main\n  \"A quine\"\n  [& args]\n  (let [s %s]\n    (format s (pr-str s))))"]
    (format s (pr-str s))))
