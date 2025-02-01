(defproject hello "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.12.0"]]
  :main hello.core
  :aot [hello.core]   ;; Ensure AOT compilation
  :target-path "target/%s"
  :source-path "src/%s"
  :javac-options ["-g -Dclojure.compiler.disable-locals-clearing=true"]  ;; Enable debug symbols in compiled Java bytecode
  :profiles {:uberjar {:aot :all}})
