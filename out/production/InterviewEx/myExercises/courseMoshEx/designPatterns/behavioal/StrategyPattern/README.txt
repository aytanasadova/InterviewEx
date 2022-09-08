Strategy design pattern is one of the behavioral design pattern.
Strategy pattern is used when we have multiple algorithm for a specific task and client decides the actual implementation to be used at runtime.
Strategy pattern is also known as Policy Pattern.
We define multiple algorithms and let client application pass the algorithm to be used as a parameter.
One of the best example of strategy pattern is Collections.sort() method that takes Comparator parameter.
Based on the different implementations of Comparator interfaces, the Objects are getting sorted in different ways.

The State pattern deals with what (state or type) an object is (in) -- it encapsulates state-dependent behavior, whereas
the Strategy pattern deals with how an object performs a certain task -- it encapsulates an algorithm.
