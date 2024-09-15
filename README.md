# def-sub

Macro that produces callable function from re-frame subscription. Advantages are that you will get function linting with arity, unused functions, typos in names and such.

## Installation

[![Clojars Project](https://img.shields.io/clojars/v/org.clojars.ralii/def-sub.svg)](https://clojars.org/org.clojars.ralii/def-sub)


## Usage

Define def-sub
``` clojure
(def-sub subscription-name
 (fn [db [_ arg1]]
   ...))
```

Call

``` clojure
@(subscription-name arg1)

```

Subscriptions using other subscriptions

``` clojure
(def-sub another-subscription
  (fn []
    (subscription-name arg1))
  (fn []
    ...))
```
## License

Copyright © 2024 Lari Saukkonen

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
