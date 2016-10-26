(ns cljs-apps-script.core)

;; when compiled, this function will be available (because of `^:export`) at
;; `cljs_apps_script.core.say_hello()`. note the `-` (dashes) are replaced
;; with `_` (underscores)
(defn ^:export say-hello [x]
  (str "Hello, " x))

;; available at `cljs_apps_script.core.log_stuff()`
(defn ^:export log-stuff []
  (.log js/Logger (str "Should be 2... " (+ 1 1))))
