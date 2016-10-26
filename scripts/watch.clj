(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'cljs-apps-script.core
   :output-to "out/cljs_apps_script.js"
   :output-dir "out"})
