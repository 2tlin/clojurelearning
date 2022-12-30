(ns clojure4brave.chapter3.syntax)

;; functions
(defn toprint
  [x]
  (println x))

;; literals
(println (str "Hello, " "world"))


;; boolean
(if true
  "it is true"
  "it is false")

(if false
  "it is true"
  "it is false")

(if true
  (do (println "it is true"))
  "it is false")

(when true
  (println "Success")
  "Abrakadabra")

;; nil, false, equality
(toprint (nil? 1))

(toprint (if false
           "it is true"
           "it is false"))

(toprint (nil? nil))
(toprint (= 1 1))

(toprint (true? 1))