(ns projecteuler.clj-test
  (:require [clojure.test :refer :all]
            [projecteuler.clj :refer :all]))

(deftest problem1-test-1
  (testing "Problem 1"
    (is (= (problem1 10) (+ 3 5 6 9)))
    (is (= (problem1 15) 45))))
