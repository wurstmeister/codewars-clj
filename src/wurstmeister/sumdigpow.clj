(ns wurstmeister.sumdigpow)

(defn as-int [s]
  (Integer/parseInt s))

(defn num-to-digits [num]
  (into [] (map (comp as-int str) (str num))))

(defn single-sum-dig-pow [num]
  (->> (num-to-digits num)
       (map-indexed #(Math/pow %2 (+ 1 %1)))
       (reduce +)
       (int)))
;(int (reduce + (map-indexed #(Math/pow %2 (+ 1 %1)) (num-to-digits num)))))

(defn sum-dig-pow [a b]
  (let [r (range a b)
        sum-dig-pows (map #(single-sum-dig-pow %) r)]
    (filter some? (map #(when (= %1 %2) %1) r sum-dig-pows))))

(sum-dig-pow 1 10)

(sum-dig-pow 1 100)

