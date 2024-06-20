Bird Behavior Simulation
This Java project demonstrates the application of SOLID principles using various bird classes with behaviors such as flying and eating. The code utilizes interfaces and polymorphism to ensure clean, extendable, and maintainable code.

Features
Single Responsibility Principle (SRP): Each class has a single responsibility.
Open/Closed Principle (OCP): Classes are open for extension but closed for modification.
Liskov Substitution Principle (LSP): Subclasses can replace their base class objects without affecting the program.
Interface Segregation Principle (ISP): Uses multiple interfaces to ensure classes implement only the methods they need.
Dependency Inversion Principle (DIP): Depends on abstractions rather than concrete classes.
Classes and Interfaces
Bird: Abstract base class representing a bird.
Owl, Crow, Sparrow, Penguinn: Concrete classes extending Bird and implementing various interfaces.
FlyingBehaviour, Eatable, Flyable: Interfaces defining specific behaviors.
CrowSparrowFlyingBehaviour, PigeonOwlFlyingBehaviour: Concrete classes implementing FlyingBehaviour.
Usage
To run the project, compile and execute the Main class. This class demonstrates creating different bird objects and calling their respective methods.
Contributing
Contributions are welcome! Feel free to open issues or submit pull requests.
