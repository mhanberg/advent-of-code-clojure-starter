(ns advent-of-code.core
  (:require [advent-of-code.day-01]
            [advent-of-code.day-02]
            [advent-of-code.day-03]
            [advent-of-code.day-04]
            [advent-of-code.day-05]
            [advent-of-code.day-06]
            [advent-of-code.day-07]
            [advent-of-code.day-08]
            [advent-of-code.day-09]
            [advent-of-code.day-10]
            [advent-of-code.day-11]
            [advent-of-code.day-12]
            [advent-of-code.day-13]
            [advent-of-code.day-14]
            [advent-of-code.day-15]
            [advent-of-code.day-16]
            [advent-of-code.day-17]
            [advent-of-code.day-18]
            [advent-of-code.day-19]
            [advent-of-code.day-20]
            [advent-of-code.day-21]
            [advent-of-code.day-22]
            [advent-of-code.day-23]
            [advent-of-code.day-24]
            [advent-of-code.day-25]))

(defn read-input
  [day]
  (slurp (clojure.java.io/resource day)))

(defn -main
  "Used to dispatch tasks from the command line.
  
  lein run d01.p1"
  [part]
  (case part
    "d01.p1" (println (advent-of-code.day-01/part-1 (read-input "day-01.txt")))
    "d01.p2" (println (advent-of-code.day-01/part-2 (read-input "day-01.txt")))
    "d02.p1" (println (advent-of-code.day-02/part-1 (read-input "day-02.txt")))
    "d02.p2" (println (advent-of-code.day-02/part-2 (read-input "day-02.txt")))
    "d03.p1" (println (advent-of-code.day-03/part-1 (read-input "day-03.txt")))
    "d03.p2" (println (advent-of-code.day-03/part-2 (read-input "day-03.txt")))
    "d04.p1" (println (advent-of-code.day-04/part-1 (read-input "day-04.txt")))
    "d04.p2" (println (advent-of-code.day-04/part-2 (read-input "day-04.txt")))
    "d05.p1" (println (advent-of-code.day-05/part-1 (read-input "day-05.txt")))
    "d05.p2" (println (advent-of-code.day-05/part-2 (read-input "day-05.txt")))
    "d06.p1" (println (advent-of-code.day-06/part-1 (read-input "day-06.txt")))
    "d06.p2" (println (advent-of-code.day-06/part-2 (read-input "day-06.txt")))
    "d07.p1" (println (advent-of-code.day-07/part-1 (read-input "day-07.txt")))
    "d07.p2" (println (advent-of-code.day-07/part-2 (read-input "day-07.txt")))
    "d08.p1" (println (advent-of-code.day-08/part-1 (read-input "day-08.txt")))
    "d08.p2" (println (advent-of-code.day-08/part-2 (read-input "day-08.txt")))
    "d09.p1" (println (advent-of-code.day-09/part-1 (read-input "day-09.txt")))
    "d09.p2" (println (advent-of-code.day-09/part-2 (read-input "day-09.txt")))
    "d10.p1" (println (advent-of-code.day-10/part-1 (read-input "day-10.txt")))
    "d10.p2" (println (advent-of-code.day-10/part-2 (read-input "day-10.txt")))
    "d11.p1" (println (advent-of-code.day-11/part-1 (read-input "day-11.txt")))
    "d11.p2" (println (advent-of-code.day-11/part-2 (read-input "day-11.txt")))
    "d12.p1" (println (advent-of-code.day-12/part-1 (read-input "day-12.txt")))
    "d12.p2" (println (advent-of-code.day-12/part-2 (read-input "day-12.txt")))
    "d13.p1" (println (advent-of-code.day-13/part-1 (read-input "day-13.txt")))
    "d13.p2" (println (advent-of-code.day-13/part-2 (read-input "day-13.txt")))
    "d14.p1" (println (advent-of-code.day-14/part-1 (read-input "day-14.txt")))
    "d14.p2" (println (advent-of-code.day-14/part-2 (read-input "day-14.txt")))
    "d15.p1" (println (advent-of-code.day-15/part-1 (read-input "day-15.txt")))
    "d15.p2" (println (advent-of-code.day-15/part-2 (read-input "day-15.txt")))
    "d16.p1" (println (advent-of-code.day-16/part-1 (read-input "day-16.txt")))
    "d16.p2" (println (advent-of-code.day-16/part-2 (read-input "day-16.txt")))
    "d17.p1" (println (advent-of-code.day-17/part-1 (read-input "day-17.txt")))
    "d17.p2" (println (advent-of-code.day-17/part-2 (read-input "day-17.txt")))
    "d18.p1" (println (advent-of-code.day-18/part-1 (read-input "day-18.txt")))
    "d18.p2" (println (advent-of-code.day-18/part-2 (read-input "day-18.txt")))
    "d19.p1" (println (advent-of-code.day-19/part-1 (read-input "day-19.txt")))
    "d19.p2" (println (advent-of-code.day-19/part-2 (read-input "day-19.txt")))
    "d20.p1" (println (advent-of-code.day-20/part-1 (read-input "day-20.txt")))
    "d20.p2" (println (advent-of-code.day-20/part-2 (read-input "day-20.txt")))
    "d21.p1" (println (advent-of-code.day-21/part-1 (read-input "day-21.txt")))
    "d21.p2" (println (advent-of-code.day-21/part-2 (read-input "day-21.txt")))
    "d22.p1" (println (advent-of-code.day-22/part-1 (read-input "day-22.txt")))
    "d22.p2" (println (advent-of-code.day-22/part-2 (read-input "day-22.txt")))
    "d23.p1" (println (advent-of-code.day-23/part-1 (read-input "day-23.txt")))
    "d23.p2" (println (advent-of-code.day-23/part-2 (read-input "day-23.txt")))
    "d24.p1" (println (advent-of-code.day-24/part-1 (read-input "day-24.txt")))
    "d24.p2" (println (advent-of-code.day-24/part-2 (read-input "day-24.txt")))
    "d25.p1" (println (advent-of-code.day-25/part-1 (read-input "day-25.txt")))
    "d25.p2" (println (advent-of-code.day-25/part-2 (read-input "day-25.txt")))
    (println "not found")))

