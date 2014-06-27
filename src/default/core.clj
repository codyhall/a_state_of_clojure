(ns default.core)

(require '[clojure.data.csv :as csv]
         '[clojure.java.io :as io])

;; what -text?
;;

(def file-name "./resources/patients.csv")

(defn accumulate [m [p-id mnem ts Var Val]]
  (assoc m Var Val))

(with-open [in-file (io/reader file-name)]
  (into []
  (reductions
      accumulate
      {}
      (csv/read-csv in-file))))



(defn accumulate [last_Patient_DW_ID m] [patient_DW_ID _ Var Val]
  (if (!= patient_DW_ID last_Patient_DW_ID)
    [patient_DW_ID {Var Val}]
    [patient_DW_ID (assoc m Var Val)]))

(? read)



(assoc {} :key1 "value" :key2 "another value")

(def test-map {:account-no 12345678 :lname "Jones" :fnam "Fred"})
(assoc test-map :fnam "Sue")



(last (assoc {} :1 1 :2 2 :3 3))


