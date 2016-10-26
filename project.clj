(defproject cljs-apps-script "0.2.0-SNAPSHOT"
  :description "Using ClojureScript and Google Apps Script"
  :url "https://github.com/whitecoop/cljs-apps-script"
  :license {:name "MIT"
            :url "https://opensource.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.225"]]
  :jvm-opts ^:replace ["-Xmx1g" "-server"]
  :plugins [[lein-npm "0.6.1"]
            [lein-figwheel "0.5.6"]]
  :npm {:dependencies [[source-map-support "0.4.0"]]}
  :source-paths ["src" "target/classes"]
  :clean-targets ["out" "release/scratch"]
  :target-path "target"
  :cljsbuild
  {:builds
   [{:id "dev"
     :source-paths ["src/"]
     :figwheel true
     :compiler
     {:main "cljs-apps-script.core"
      :asset-path "js/out"
      :output-to "resources/public/js/cljs_apps_script.js"
      :output-dir "resources/public/js/out"}}]})
