(defproject org.travis-ci/lein2-example "1.0.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.3.0"]]
  :test-selectors {:default (fn [v] (not (:time-consuming v))),
                   :time-consuming (fn [v] (:time-consuming v)),
                   :focus (fn [v] (:focus v)),
                   :all (fn [_] true)}
  :source-paths ["src/clojure"]
  :repositories {"clojure-releases"
                 "http://build.clojure.org/releases",
                 "sonatype"
                 {:url
                  "http://oss.sonatype.org/content/repositories/releases",
                  :snapshots false,
                  :releases {:checksum :fail, :update :always}},
                 "sonatype-snapshots"
                 {:url
                  "http://oss.sonatype.org/content/repositories/snapshots",
                  :snapshots true,
                  :releases {:checksum :fail, :update :always}}}
  :java-source-paths ["src/java"]
  :min-lein-version "2.0.0"
  :warn-on-reflection true
  :description "An example Clojure project that uses Leiningen, clojure.test and uses travis-ci.org for CI")