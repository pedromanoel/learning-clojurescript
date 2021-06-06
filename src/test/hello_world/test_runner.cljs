(ns hello-world.test-runner
  (:require [cljs.test :refer-macros [run-tests]]
            [hello-world.core-test]))

(set! *print-newline* false)

(run-tests
 'hello-world.core-test)
