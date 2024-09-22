(defproject org.clojars.ralii/def-sub "0.1.4"
  :description "Def sub"
  :url "http://example.com/Ralii/def-sub"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [org.clojure/clojurescript "1.11.60"]
                 [re-frame "1.4.3"]
                 [day8.re-frame/test "0.1.5"]]
  :main ^:skip-aot def-sub.core
  :target-path "target/%s"
  :repositories [["releases" {:url "https://repo.clojars.org"
                              :sign-releases false}]]
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
