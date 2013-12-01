(ns uwo.views
  (:require [hiccup.core :refer (html)]))

(defn layout [title & content]
  (html
    [:head [:title title]]
    [:body content]))

(defn main-page []
  (layout "My Blog"
          [:h1 "My Blog"]
          [:p "Welcome to my page"]))
