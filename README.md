musical-quine
=============

A musical quine.

Quine
-----

A [*quine*][quine], as popularized by [Douglas Hofstadter][douglas],
is a

> non-empty computer program which takes no input and produces a copy
> of its own source code as its only output.

### Variant

A variation on the quine theme is to allow for a *musical quine*.

A musical quine

> is non-empty computer program which takes sound as input and
> produces a copy of its own source code while it is allowed to
> produce sounds while executing.

Idea
----

The idea explored in this project is to [sonify][sonification]
characters of source code into tones and use a
[Fourier transformation][fourier] to associate a tone of musical
input to characters.

Background
----------

At [Joy of Coding][joc] 2015 I spoke with the brilliant
[Bonnie Eisenman][bonnie]. She had given a workshop on musical
programming with [ChucK][chuck]. We came to discuss an idea she
attributed to [Chris Granger][chris], who gave the morning key note.

The idea Chris had mentioned in his key note wat that of a *musical
quine*. This idea really appealed to Bonnie so she ended up discussing
it with me.

I found it a really cute idea, but had a hard time coming up with an
angle of attack at the moment. Over the next few days a solution path
presented itself to me.

[quine]: http://en.wikipedia.org/wiki/Quine_%28computing%29
[douglas]: http://en.wikipedia.org/wiki/Douglas_Hofstadter
[sonification]: http://en.wikipedia.org/wiki/Sonification
[fourier]: http://en.wikipedia.org/wiki/Fourier_transform
[joc]: http://joyofcoding.org/
[bonnie]: https://twitter.com/brindelle
[chuck]: http://chuck.cs.princeton.edu/
[chris]: https://twitter.com/ibdknox
