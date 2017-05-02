(ns ci-dummy.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[ci-dummy started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[ci-dummy has shut down successfully]=-"))
   :middleware identity})
