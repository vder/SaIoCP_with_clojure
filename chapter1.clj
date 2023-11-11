(+ 1 2)
(+ 137 349)
(+ 21 35 12 7)
(+ (* 3 5) (- 10 6))

(def size 2)

size

(def pi 3.14159)
(def radius 10)
(* pi (* radius radius))
(def circumrefence (* 2 pi radius))
circumrefence

(defn square [x] (* x x) )

(square 21)
(square (+ 2 5))
(square (square 3))

(defn sum-of-squares [x y]
  (+ (square x) (square y)))

(sum-of-squares 3 4)

(defn f [a]
  (sum-of-squares (+ a 1) (* a 2)))

(f 5)

(defn myabs [x] (cond 
                  (> x 0) x 
                  (= x 0) 0 
                  (< x 0) (- x))
)

(myabs -5)

(defn myabs2 [x] 
  (if (< x 0) (- x) x))

(myabs2 -5)

(defn gteq [x y] (or (> x y) (= x y )))

(gteq 10 5)

(defn gteq2 [x y] (not (< x y )))

(gteq2 10 50)

; Ex.1
10
(+ 5 3 4)
(- 9 1)
(/ 6 2)
(+ (* 2 4) (- 4 6))

(def a 3)
a
(def b (+ a 1))
b

(+ a b (* a b))
(= a b)

(if (and (> b a) (< b (* a b)))
  b
  a)

(cond (= a 4) 6
      (= b 4) (+ 6 7 a)
      :else 25
      )

; Ex. 2
(/ (+ 5 4 (- 2 (- 3 (+ 6 (/ 4 5)))))
   (* 3 (- 6 2) (- 2 7)))

; Ex.3

(defn greatest_square_sum [x y z] 
  (cond (and (<= x y) (<= x z)) (+ (* y y) (* z z)) 
        (and (<= y x) (<= y z)) (+ (* x x) (* z z))
        :else (+ (* x x) (* y y))
        ) 
  )

(greatest_square_sum 3 4 5)
(greatest_square_sum 4 3 5)
(greatest_square_sum 4 5 3)
(greatest_square_sum 5 4 3)
(greatest_square_sum 5 3 4)
(greatest_square_sum 3 5 4)

; Ex. 4

(defn a_plus_abs_b [a b]
  ((if (> b 0) +  -) a b) 
  )

(a_plus_abs_b 10 -1)

; Ex. 5

(defn p [] (p))

(defn test [x y]
  (if (= x 0) 0 y)
  )

(test 0 (p))