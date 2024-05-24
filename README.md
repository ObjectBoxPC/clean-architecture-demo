# Clean Architecture Demo

This is a simple demonstration of the [Clean Architecture](https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html).

One of the primary principles of this architecture is that source code (classes here) should depend only on more abstract code. However, the flow of control goes from concrete input to abstract processing to concrete output.

The way to resolve this is to apply the dependency inversion principle, which leads to the UML diagram in the bottom-right corner of the first picture.

However, it was a bit difficult for me to reason about the diagram abstractly, so I decided to make it concrete with this program.

## Technical Details

The main class is CleanArchitectureDemo. It handles all the dependency injection and starts the controller.

A small test of the interactor is in the `test` directory.

## License

I am releasing this code into the public domain using [Creative Commons CC0 1.0 Universal](https://creativecommons.org/publicdomain/zero/1.0/). A copy of the dedication is included at `LICENSE-CC0.txt`.

I am also releasing the code under the MIT License, in case the previous dedication cannot be recognized as an open-source license. A copy is included at `LICENSE-MIT.txt`.