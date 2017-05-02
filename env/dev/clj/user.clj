(ns user
  (:require [mount.core :as mount]
            ci-dummy.core))

(defn start []
  (mount/start-without #'ci-dummy.core/repl-server))

(defn stop []
  (mount/stop-except #'ci-dummy.core/repl-server))

(defn restart []
  (stop)
  (start))


