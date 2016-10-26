# cljs-apps-script
Example usage of ClojureScript in Google Apps Script.

## Setup and Usage
1. Clone this repo.
2. Write your cljs code like normal in `src/*`.
3. For functions you want to expose to the outside world, `^:export` their symbols (see [src/cljs_apps_script/core.cljs](src/cljs_apps_script/core.cljs) for examples).
4. To run/test your code locally, build with `source scripts/build` (run from the project root) and open `index.html` in your browser. To auto-rebuild on changes to `src/*`, do `source scripts/watch`.
5. To use your code in Google Apps Script, first build it with `source scripts/release`, then copy-and-paste the compiled JavaScript from `release/cljs_apps_script_<current-project-version>.js` into your Google Apps script.

### Note on `scripts/release`
I've tweaked the `scripts/release.clj` to do the following:
1. Add the current project version (from [project.clj](project.clj)) as a comment at the top the compiled JS – that way you can keep track of what version is in Google Apps Script.
2. Add the release version to the filename of the compiled JS, like so: `release/cljs_apps_script_<current-project-version>.js`

If you don't update your project version between builds *it will overwrite the previous build* since the version is in the build filename. Also, since the release version number is baked into filename, you'll need to change the version number in [index_release.html](index_release.html) to test the most recent version.

### Using `^:export`ed Functions
Exported functions can be found at `<namespace>.<namespace-qualifier>.<function-name>`, e.g. `cljs_apps_script.core.say_hello()`. The `-` (dashes) in any function names are replaced with `_` (underscores).

If you wanted to, say, use an `^:export`ed function as a custom function in Google Apps Script, include something like:

```js
/** @customfunction */
function sayHello(x) {
  return cljs_apps_script.core.say_hello(x);
}
```

at the bottom of your code in Google Apps Script.

## To Do
- Automate export of compiled JS into Google Apps Script directly (ref.: [https://developers.google.com/apps-script/import-export](https://developers.google.com/apps-script/import-export)).

## Attribution
This Leiningen project was initially created with the [Mies template](https://github.com/swannodette/mies) and so I got all the [scripts](scripts/) from there and tweaked them to my use.

## License
MIT (see [LICENSE](LICENSE))
