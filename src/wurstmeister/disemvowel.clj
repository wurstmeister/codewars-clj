(ns wurstmeister.disemvowel)

(def vowels #{\a \e \i \o \u})

(def vowels (set "aeiouAEIOU"))

;(defn lower [c]
;  (char (Character/toLowerCase (int c))))

;(defn vowel? [c]
;  (not (nil? (vowels (lower c)))))

(defn vowel? [c]
  (not (nil? (vowels c))))

(defn disemvowel
  [string]
  (clojure.string/join (filter #(not (vowel? %)) string)))

(vowels \a)
(vowel? \c)


(filter #(not (vowel? %)) "Hello")

(disemvowel "HelloO")

(disemvowel "This website is for losers LOL!")

(lower \C)

(clojure.string/join [\a])


(apply str (remove vowels "Hello"))

;;;;
(defn disemvowel [string]
  (->> string
       (remove (set "aeiouAEIOU"))
       (apply str)))