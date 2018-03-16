;; IMPORTANT: When bumping the version number here, be sure to bump it also in
;; src/drift/drift_version.clj!
(defproject waffletower/drift "1.5.3"
  :description "Drift is a rails like migration framework for Clojure."
  :dependencies [[waffletower/clojure-tools "1.1.3"]
                 [org.clojure/tools.logging "0.2.3"]]
  :profiles {:dev {:dependencies [[log4j/log4j "1.2.16"]]}}
  :aot [drift.listener-protocol drift.Drift])
