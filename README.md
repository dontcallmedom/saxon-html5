This wrapper for the saxon XSLT processor makes it run on HTML5 documents, ignoring and fixing errors as they are encountered, and thus useful on HTML-as-it-is-spoken.

It's directly inspired from [Jirka Kosek](http://markmail.org/message/d3kt4l37na7l5vsp) exploration of this question.

# Installation
The [`nu.validator.htmlparser.HtmlParser`](http://about.validator.nu/htmlparser/) class must be in your classpath. You can then run
```sh
ant
```
to build the `htmlparser-saxon.jar` JAR that will be used by the wrapper. Install that JAR in your classpath.

# Running
The bash script [saxon-html5](saxon-html5) runs Saxon with the right parameters, calling the built wrapper to make it parse HTML5 as expected.

You need to have `net.nimbustier.html.HtmlParser`, `nu.validator.htmlparser.HtmlParser` and `net.sf.saxon.Transform` in your classpath.

You can then run
```sh
./saxon-html5 doc.html transform.xsl
```