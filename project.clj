(defproject cljs-apps-script "0.1.0-SNAPSHOT"
  :description "Testing meshing ClojureScript and Google Apps Script"
  :url "https://github.com/whitecoop/cljs-apps-script"
  :license {:name "MIT"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.7.228"]]
  :plugins [[lein-cljsbuild "1.1.2"]]
  :main ^:skip-aot cljs-apps-script.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}}
  :cljsbuild {
    :builds [{
        ; The path to the top-level ClojureScript source directory:
        :source-paths ["src/cljs_apps_script/core.cljs"]
        ; The standard ClojureScript compiler options:
        ; (See the ClojureScript compiler documentation for details.)
        :compiler {
          :output-to "out/main.js"  ; default: target/cljsbuild-main.js
          :optimizations :none
          :pretty-print true}}]})
