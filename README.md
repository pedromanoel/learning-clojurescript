# Learning ClojureScript

I'm following the tutorial at [https://clojurescript.org/guides/quick-start][cljs-quick-start].

## Setup using deps.edn

[deps.edn](./deps.edn)
```clojure
{:deps {org.clojure/clojurescript {:mvn/version "1.10.758"}}}
```

## Compiling

Call cljs compiler:

```shell
clj -M -m cljs.main -c hello-world.core -r
```

This command will:

* `-M` run clojure.main
* `-m cljs.main` call the `cljs.main/-main` function
* `-c hello-world.core` will compile the file `hello_world/core.cljs` to javascript
* `-r` will run the REPL

To compile to production:

```shell
clj -M -m cljs.main -O advanced -c hello-world.core
```
This command will:

* `-O advanced` optimize the output code
* `-c hello-world.core` will compile the file `hello_world/core.cljs` to javascript

[cljs-quick-start]: https://clojurescript.org/guides/quick-start

## Serving

To serve the `out/main.js` file, run:

```shell
clj -M -m cljs/main --serve
```
