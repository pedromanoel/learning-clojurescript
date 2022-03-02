# Learning ClojureScript

I'm following the tutorial at [https://clojurescript.org/guides/quick-start][cljs-quick-start].

## Setup using deps.edn

[deps.edn](./deps.edn)
```clojure
{:deps {org.clojure/clojurescript {:mvn/version "LATEST.VERSION"}}}
```

## Useful aliases

* `clj -M:dev/repl` - compile and run the REPL, serving the app on [http://localhost:9000](http://localhost:9000)
* `clj -M:dev/serve` - serve the app on [http://localhost:9000](http://localhost:9000)
* `clj -M:compile/browser` - compile the program to the browser
* `clj -M:compile/node` - compile the program to node, to file main.js
* `clj -M:compile/prod` - compile the program to the browser optimized for production
* `clj -M:test` - compile the tests to run on node, to file test.js

This is a breakdown of the options used in the deps.edn aliases

* `-m cljs.main` call the `cljs.main/-main` function
* `-c hello-world.core` will compile the file `hello_world/core.cljs` to javascript
* `-r` will run the REPL

## Running tests

To run tests, you must compile then call node

```shell
clj -M:test && node test.js
```
