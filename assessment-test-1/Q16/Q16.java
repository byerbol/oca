package Q16;

// Remove the default method modifier and method implementation on lines 1 and 2.
public interface Animal { public default String getName() { return null; } }

interface Mammal { public default String getName() { return null; } }

// Override the getName() method with an abstract method in the Otter class.
// Override the getName() method with a concrete method in the Otter class.
abstract class Otter implements Mammal, Animal {  }

/**

The code does not compile, since a class cannot inherit two interfaces that
both define default methods with the same signature, unless the class implementing
the interfaces overrides it with an abstract or concrete method. see Chapter 5.


*/