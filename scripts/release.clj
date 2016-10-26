(require '[cljs.build.api :as b])

(println "Building ...")

(def version (-> "project.clj" slurp read-string (nth 2)))

(def filename (str "release/cljs_apps_script_" version ".js"))

(let [start (System/nanoTime)]
  (b/build "src"
    {:output-to filename
     :output-dir "release/scratch"
     :optimizations :advanced
     :verbose true})
  (println "... done. Elapsed" (/ (- (System/nanoTime) start) 1e9) "seconds"))

(->> (slurp filename)
  (str "// release v" version "\n\n")
  (spit filename))
