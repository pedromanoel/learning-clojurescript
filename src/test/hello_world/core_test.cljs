(ns hello-world.core-test
  (:require [clojure.test :refer-macros [deftest is testing]]))

(deftest simple-test
  (is (= 1 1)))
