(require 'cljs.build.api)

(cljs.build.api/build "src"
  {:main 'cljs_apps_script.core
   :output-to "out/main.js"})
