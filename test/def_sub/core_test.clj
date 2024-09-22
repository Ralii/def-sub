(ns def-sub.core-test
  (:require [clojure.test :refer :all]
            [def-sub.core :refer [def-sub]]
            [day8.re-frame.test :as rf-test]
            [re-frame.core :refer [reg-sub subscribe]]))

(deftest integration
  (testing "Whole pipeline should work")

  (rf-test/run-test-sync

   (reg-sub
    :testing
    (fn [_ _]
      1))

   (def-sub
     testing-def-sub
     (fn [_db [_ num]]
       num))

   (def-sub
     testing-def-sub-2
     (fn [_db [_]]
       3))

   (is (= 1 @(subscribe [:testing])))
   (is (= 2 @(testing-def-sub 2)))
   (is (= 3 @(testing-def-sub-2)))))
