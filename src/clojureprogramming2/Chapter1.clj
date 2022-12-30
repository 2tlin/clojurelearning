(ns clojureprogramming2.Chapter1)


; functions
(defn somefunction [numbers] (/ (apply + numbers) (count numbers))) ; "Applies fn f to the argument list formed by prepending intervening arguments to args."

(println (average [1,2,3,4,5])) ; 3

; 42 Механизм чтения
(println (read-string "42")) ; 42
(println (read-string "(+ 1 2)")) ;(+ 1 2)

; Числа
(println 2r111) ; 7
(println 8r40) ; 32
(println 16rff) ; 255

; Regex
(println (class #"(p|h)ail")) ; java.util.regex.Pattern
(println (re-seq #"(...) (...)" "foo bar")) ; ([foo bar foo bar])
(println (re-seq #"(\d+)-(\d+)" "1-3") ) ;; превратится в "(\\d+)-(\\d+)" в Java
;; ([1-3 1 3])

; Комментарии #_
(println (read-string "(+ 1 2 #_(* 2 2) 8)")) ; (+ 1 2 8)