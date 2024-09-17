(ns def-sub.core)

(defn- fully-qualified-name
  [sym]
  (str *ns* "/" (name sym)))

(defmacro def-sub [fn-name & sub-fns]
  (let [sub-fn-arguments (-> sub-fns last second rest first rest)]
    `(do
       (re-frame.core/reg-sub
        ~(keyword (fully-qualified-name fn-name))
        ~@sub-fns)
       (clojure.core/defn
         ~fn-name
         [~@sub-fn-arguments]
         (re-frame.core/subscribe [~(keyword (fully-qualified-name fn-name)) ~@sub-fn-arguments])))))
