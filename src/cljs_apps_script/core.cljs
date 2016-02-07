(ns cljs-apps-script.core)

(.log js/Logger "eggs!")

(.log js/Logger (str "Should be 2... "(+ 1 1)))
