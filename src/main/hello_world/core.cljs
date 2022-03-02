(ns hello-world.core
  (:require react-dom))

(defonce root (->> (.getElementById js/document "app")
                   (.createRoot js/ReactDOM)))

(.render root
         (.createElement js/React "h2" nil "Hello, React 1!"))

(comment
  (js/alert "Oi")
  (println "oi"))