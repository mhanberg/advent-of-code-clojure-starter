(ns advent-of-code.day-12-test
  (:require [clojure.test :refer [deftest testing is]]
            [advent-of-code.day-12 :refer [part-1 part-2]]
            [clojure.java.io :refer [resource]]))

(deftest part1
  (let [expected nil]
    (is (= expected (part-1 (slurp (resource "day-12-example.txt")))))))

(deftest part2
  (let [expected nil]
    (is (= expected (part-2 (slurp (resource "day-12-example.txt")))))))
