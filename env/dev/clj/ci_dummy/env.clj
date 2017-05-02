(ns ci-dummy.env
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [ci-dummy.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[ci-dummy started successfully using the development profile]=-"))
   :stop
   (fn []
     (log/info "\n-=[ci-dummy has shut down successfully]=-"))
   :middleware wrap-dev})
