(ns fun.core
  (:require ["react" :as react]
            ["react-dom" :as react-dom]))

(defn my-counter []
  (let [[count set-count] (react/useState 0)]
    (react/createElement "button"
                         #js{:onClick #(set-count (inc count))}

                         (str "Clicked " count " times"))))

(defn main! []
  (react-dom/render
    (react/createElement my-counter)
    (js/document.getElementById "app")))

(defn reload! []
  (main!))

