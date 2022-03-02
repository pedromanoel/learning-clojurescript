(ns hello-world.core-test
  (:require [clojure.test :refer-macros [deftest is]]))

(deftest simple-test
  (is (= 1 1)))
