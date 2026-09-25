
# ☕ Java OOPs — Complete Learning Repository

Welcome to my **Java OOPs (Object-Oriented Programming)** learning repository.

This repository contains my Java programs, notes, examples, and practice questions covering the fundamental concepts of **Object-Oriented Programming in Java**.

> 👨‍💻 **Author:** Ahmed Hussain
> 📚 **Language:** Java
> 🎯 **Focus:** Object-Oriented Programming
> 🚀 **Level:** Beginner → Intermediate

---

## 📌 Table of Contents

* [About This Repository](#-about-this-repository)
* [Java OOPs](#-java-oops)
* [1. Class](#1-class)
* [2. Object](#2-object)
* [3. Constructor](#3-constructor)
* [4. `this` Keyword](#4-this-keyword)
* [5. Encapsulation](#5-encapsulation)
* [6. Inheritance](#6-inheritance)
* [7. Types of Inheritance](#7-types-of-inheritance)
* [8. `super` Keyword](#8-super-keyword)
* [9. Polymorphism](#9-polymorphism)
* [10. Method Overloading](#10-method-overloading)
* [11. Method Overriding](#11-method-overriding)
* [12. Abstraction](#12-abstraction)
* [13. Abstract Class](#13-abstract-class)
* [14. Interface](#14-interface)
* [15. Access Modifiers](#15-access-modifiers)
* [16. Static Keyword](#16-static-keyword)
* [17. Final Keyword](#17-final-keyword)
* [18. Packages](#18-packages)
* [19. Exception Handling](#19-exception-handling)
* [20. Getters and Setters](#20-getters-and-setters)
* [21. Composition](#21-composition)
* [22. Association](#22-association)
* [23. Aggregation](#23-aggregation)
* [24. OOPs Example](#24-complete-oops-example)
* [How to Run](#-how-to-run)
* [Repository Structure](#-repository-structure)
* [Learning Roadmap](#-learning-roadmap)
* [Practice](#-practice)
* [Author](#-author)

---

# 📖 About This Repository

The purpose of this repository is to understand Java's **Object-Oriented Programming concepts through practical code**.

Instead of learning only theory, each concept is demonstrated with simple Java programs.

### Topics Covered

```text
Class
Object
Constructor
Encapsulation
Inheritance
Polymorphism
Abstraction
Interface
Method Overloading
Method Overriding
Access Modifiers
this
super
static
final
Packages
Exception Handling
Association
Aggregation
Composition
```

---

# 🧠 Java OOPs

**OOP** stands for **Object-Oriented Programming**.

Java is primarily an object-oriented programming language.

The four main pillars of OOP are:

```text
1. Encapsulation
2. Inheritance
3. Polymorphism
4. Abstraction
```

---

# 1. Class

A **class** is a blueprint or template used to create objects.

### Example

```java
class Student {

    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
```

A class can contain:

* Variables
* Methods
* Constructors
* Blocks
* Nested classes

---

# 2. Object

An **object** is an instance of a class.

### Example

```java
class Student {

    String name;
    int age;

    void display() {
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Ahmed";
        s1.age = 20;

        s1.display();
    }
}
```

### Output

```text
Ahmed
20
```

### Object Creation

```java
Student s1 = new Student();
```

Here:

* `Student` → Class
* `s1` → Reference variable
* `new Student()` → Object creation

---

# 3. Constructor

A **constructor** is a special method used to initialize an object.

Important properties:

* Constructor name must be the same as the class name.
* It does not have a return type.
* It is automatically called when an object is created.

### Example

```java
class Student {

    String name;
    int age;

    Student() {
        name = "Ahmed";
        age = 20;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.display();
    }
}
```

---

## Parameterized Constructor

```java
class Student {

    String name;
    int age;

    Student(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        Student s1 = new Student("Ahmed", 20);

        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}
```

---

# 4. `this` Keyword

The `this` keyword refers to the **current object**.

### Example

```java
class Student {

    String name;
    int age;

    Student(String name, int age) {

        this.name = name;
        this.age = age;
    }

    void display() {

        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
```

Here:

```java
this.name
```

refers to the instance variable.

---

# 5. Encapsulation

**Encapsulation** means wrapping data and methods together inside a class and controlling access to the data.

Usually we use:

```text
private variables
+
public getters/setters
```

### Example

```java
class Student {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
```

### Using the class

```java
class Main {

    public static void main(String[] args) {

        Student s = new Student();

        s.setName("Ahmed");
        s.setAge(20);

        System.out.println(s.getName());
        System.out.println(s.getAge());
    }
}
```

---

# 6. Inheritance

**Inheritance** allows one class to acquire properties and methods of another class.

Keyword:

```java
extends
```

### Example

```java
class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

class Main {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();
        d.bark();
    }
}
```

### Output

```text
Animal is eating
Dog is barking
```

---

# 7. Types of Inheritance

Java supports several inheritance structures.

### Single Inheritance

```text
Animal
   ↓
  Dog
```

```java
class Animal {
    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking");
    }
}
```

---

## Multilevel Inheritance

```text
Animal
   ↓
  Dog
   ↓
 Puppy
```

```java
class Animal {

    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Barking");
    }
}

class Puppy extends Dog {

    void play() {
        System.out.println("Playing");
    }
}
```

---

## Hierarchical Inheritance

```text
       Animal
       /    \
     Dog    Cat
```

```java
class Animal {

    void eat() {
        System.out.println("Eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Barking");
    }
}

class Cat extends Animal {

    void meow() {
        System.out.println("Meowing");
    }
}
```

### Multiple Inheritance

Java does **not support multiple inheritance through classes**.

For example:

```text
Class A
   ↘
     Class C
   ↗
Class B
```

Instead, Java can achieve this using **interfaces**.

---

# 8. `super` Keyword

The `super` keyword is used to refer to the **parent class**.

It can be used to:

* Access parent variables
* Call parent methods
* Call parent constructor

### Example

```java
class Animal {

    String name = "Animal";

    void display() {
        System.out.println("Parent class");
    }
}

class Dog extends Animal {

    String name = "Dog";

    void show() {

        System.out.println(super.name);

        super.display();

        System.out.println(name);
    }
}
```

---

# 9. Polymorphism

**Polymorphism** means:

> One name, many forms.

There are two major types:

```text
1. Compile-time Polymorphism
2. Runtime Polymorphism
```

---

# 10. Method Overloading

Method overloading means having multiple methods with the **same name but different parameters**.

### Example

```java
class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}
```

### Calling methods

```java
class Main {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println(c.add(10, 20));

        System.out.println(c.add(10, 20, 30));

        System.out.println(c.add(10.5, 20.5));
    }
}
```

This is **compile-time polymorphism**.

---

# 11. Method Overriding

Method overriding occurs when a child class provides its own implementation of a method already defined in the parent class.

### Example

```java
class Animal {

    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
```

### Runtime Polymorphism

```java
class Main {

    public static void main(String[] args) {

        Animal a = new Dog();

        a.sound();
    }
}
```

### Output

```text
Dog barks
```

The method that executes is determined at **runtime**.

---

# 12. Abstraction

**Abstraction** means hiding unnecessary implementation details and showing only the important functionality.

Java provides abstraction using:

```text
1. Abstract classes
2. Interfaces
```

Example:

```text
User
 ↓
Car
 ↓
start()
```

The user knows that the car starts but does not need to know every internal engine operation.

---

# 13. Abstract Class

An abstract class is declared using:

```java
abstract
```

### Example

```java
abstract class Animal {

    abstract void sound();

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class Main {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
        d.eat();
    }
}
```

An abstract class can contain:

* Abstract methods
* Normal methods
* Variables
* Constructors
* Static methods

---

# 14. Interface

An interface is used to define a contract that classes can implement.

Keyword:

```java
implements
```

### Example

```java
interface Animal {

    void sound();
}

class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Main {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
    }
}
```

---

## Multiple Interfaces

A class can implement multiple interfaces.

```java
interface A {

    void showA();
}

interface B {

    void showB();
}

class C implements A, B {

    public void showA() {
        System.out.println("A");
    }

    public void showB() {
        System.out.println("B");
    }
}
```

This is one way Java supports multiple inheritance of type.

---

# 15. Access Modifiers

Java provides four main access levels:

| Modifier    | Same Class | Same Package | Subclass | Everywhere |
| ----------- | ---------- | ------------ | -------- | ---------- |
| `private`   | ✅          | ❌            | ❌        | ❌          |
| default     | ✅          | ✅            | Depends  | ❌          |
| `protected` | ✅          | ✅            | ✅        | ❌          |
| `public`    | ✅          | ✅            | ✅        | ✅          |

### Example

```java
class Student {

    private int age;

    int marks;

    protected String name;

    public void display() {

        System.out.println("Student");
    }
}
```

---

# 16. Static Keyword

The `static` keyword belongs to the **class rather than an individual object**.

### Static Variable

```java
class Student {

    static String college = "ABC College";

    String name;

    Student(String name) {
        this.name = name;
    }
}
```

### Static Method

```java
class Test {

    static void hello() {

        System.out.println("Hello");
    }

    public static void main(String[] args) {

        Test.hello();
    }
}
```

---

# 17. Final Keyword

The `final` keyword can be used with:

* Variables
* Methods
* Classes

### Final Variable

```java
class Test {

    final int MAX = 100;

    public static void main(String[] args) {

        Test t = new Test();

        System.out.println(t.MAX);
    }
}
```

A final variable cannot be reassigned.

### Final Method

```java
class Parent {

    final void display() {
        System.out.println("Hello");
    }
}

class Child extends Parent {

    // Cannot override final method
}
```

### Final Class

```java
final class Vehicle {

    void drive() {
        System.out.println("Driving");
    }
}

// Cannot extend Vehicle
```

---

# 18. Packages

A package is used to organize related classes.

### Creating a package

```java
package mypackage;

public class Student {

    public void display() {

        System.out.println("Hello Student");
    }
}
```

### Importing a package

```java
import mypackage.Student;

class Main {

    public static void main(String[] args) {

        Student s = new Student();

        s.display();
    }
}
```

---

# 19. Exception Handling

Exception handling is used to handle runtime errors without stopping the entire program unexpectedly.

Important keywords:

```text
try
catch
finally
throw
throws
```

### try-catch

```java
class Main {

    public static void main(String[] args) {

        try {

            int result = 10 / 0;

            System.out.println(result);

        } catch (ArithmeticException e) {

            System.out.println("Cannot divide by zero");
        }
    }
}
```

### finally

```java
try {

    System.out.println("Try block");

} catch (Exception e) {

    System.out.println("Exception");

} finally {

    System.out.println("Finally block");
}
```

---

# 20. Getters and Setters

Getters and setters are commonly used with encapsulation.

### Example

```java
class Student {

    private String name;
    private int marks;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {

        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        }
    }
}
```

---

# 21. Composition

Composition represents a strong **HAS-A relationship**.

If the main object is destroyed, the contained object is generally considered part of that object's lifecycle.

### Example

```java
class Engine {

    void start() {
        System.out.println("Engine started");
    }
}

class Car {

    private Engine engine = new Engine();

    void startCar() {

        engine.start();

        System.out.println("Car started");
    }
}
```

Here:

```text
Car HAS-A Engine
```

---

# 22. Association

Association represents a relationship between two independent objects.

### Example

```java
class Teacher {

    String name;

    Teacher(String name) {
        this.name = name;
    }
}

class Student {

    String name;

    Student(String name) {
        this.name = name;
    }

    void studyWith(Teacher teacher) {

        System.out.println(
            name + " is studying with " + teacher.name
        );
    }
}
```

The `Student` and `Teacher` objects can exist independently.

---

# 23. Aggregation

Aggregation is a weaker **HAS-A relationship** where the contained object can exist independently.

### Example

```java
class Teacher {

    String name;

    Teacher(String name) {
        this.name = name;
    }
}

class Department {

    Teacher teacher;

    Department(Teacher teacher) {
        this.teacher = teacher;
    }

    void display() {

        System.out.println(
            "Teacher: " + teacher.name
        );
    }
}
```

The `Teacher` can exist even if the `Department` object is removed.

---

# 24. Complete OOPs Example

The following program combines several OOP concepts.

```java
class Student {

    private String name;
    private int marks;

    Student(String name, int marks) {

        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    void display() {

        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

class CollegeStudent extends Student {

    private String course;

    CollegeStudent(
        String name,
        int marks,
        String course
    ) {

        super(name, marks);
        this.course = course;
    }

    @Override
    void display() {

        System.out.println("Name: " + getName());
        System.out.println("Marks: " + getMarks());
        System.out.println("Course: " + course);
    }
}

public class Main {

    public static void main(String[] args) {

        Student student =
            new CollegeStudent(
                "Ahmed",
                98,
                "B.Tech"
            );

        student.display();
    }
}
```

### Concepts Used

```text
Class
Object
Constructor
this
Encapsulation
Inheritance
super
Method Overriding
Polymorphism
Access Modifiers
```

---

# 🗂️ Repository Structure

A possible structure for this repository:

```text
Java-OOPs/
│
├── README.md
│
├── 01-Class-and-Object/
│   ├── Class.java
│   └── Object.java
│
├── 02-Constructor/
│   ├── DefaultConstructor.java
│   └── ParameterizedConstructor.java
│
├── 03-This-Keyword/
│   └── ThisKeyword.java
│
├── 04-Encapsulation/
│   └── Encapsulation.java
│
├── 05-Inheritance/
│   ├── SingleInheritance.java
│   ├── MultilevelInheritance.java
│   └── HierarchicalInheritance.java
│
├── 06-Super-Keyword/
│   └── SuperKeyword.java
│
├── 07-Polymorphism/
│   ├── MethodOverloading.java
│   └── MethodOverriding.java
│
├── 08-Abstraction/
│   ├── AbstractClass.java
│   └── Interface.java
│
├── 09-Access-Modifiers/
│   └── AccessModifiers.java
│
├── 10-Static/
│   └── StaticKeyword.java
│
├── 11-Final/
│   └── FinalKeyword.java
│
├── 12-Packages/
│   └── PackageExample.java
│
├── 13-Exception-Handling/
│   └── ExceptionHandling.java
│
├── 14-Association/
│   └── Association.java
│
├── 15-Aggregation/
│   └── Aggregation.java
│
└── 16-Composition/
    └── Composition.java
```

---

# ▶️ How to Run

## 1. Install Java

Check whether Java is installed:

```bash
java --version
```

Check the Java compiler:

```bash
javac --version
```

---

## 2. Compile Java Program

For example:

```bash
javac Main.java
```

---

## 3. Run Java Program

```bash
java Main
```

### Example

```bash
javac Student.java
java Student
```

> Make sure the public class name and file name match.

For example:

```java
public class Student {
}
```

should be saved as:

```text
Student.java
```

---

# 💻 Running in VS Code

You can run Java programs using the terminal.

```bash
javac Main.java
java Main
```

Or use the **Run** button provided by the Java extension.

---

# 🧭 Learning Roadmap

A recommended order for learning Java OOP:

```text
Java Basics
    ↓
Variables & Data Types
    ↓
Conditions & Loops
    ↓
Arrays
    ↓
Methods
    ↓
Class & Object
    ↓
Constructor
    ↓
this
    ↓
Encapsulation
    ↓
Inheritance
    ↓
super
    ↓
Polymorphism
    ↓
Method Overloading
    ↓
Method Overriding
    ↓
Abstraction
    ↓
Abstract Class
    ↓
Interface
    ↓
Access Modifiers
    ↓
static & final
    ↓
Packages
    ↓
Exception Handling
    ↓
Advanced OOP
```

---

# 📝 Practice Questions

## Beginner

### Question 1

Create a `Student` class with:

```text
name
age
marks
```

Create an object and print all values.

---

### Question 2

Create a `Car` class with:

```text
brand
model
price
```

Create a parameterized constructor.

---

### Question 3

Create a `Calculator` class and implement:

```text
add()
subtract()
multiply()
divide()
```

---

## Intermediate

### Question 4

Create:

```text
Animal
   ↓
Dog
```

Add methods:

```text
eat()
bark()
```

---

### Question 5

Demonstrate method overloading using:

```java
add(int, int)
add(int, int, int)
add(double, double)
```

---

### Question 6

Demonstrate method overriding using:

```text
Animal
   ↓
Dog
```

---

## Advanced

### Question 7

Create an abstract class:

```java
abstract class Shape
```

with:

```java
abstract void area();
```

Create:

```text
Circle
Rectangle
```

as child classes.

---

### Question 8

Create an interface:

```java
interface Payment
```

and implement it using:

```text
UPI
CreditCard
Cash
```

---

# 🔥 OOPs Quick Revision

| Concept       | Meaning                                                       |
| ------------- | ------------------------------------------------------------- |
| Class         | Blueprint for objects                                         |
| Object        | Instance of a class                                           |
| Constructor   | Initializes an object                                         |
| `this`        | Refers to current object                                      |
| `super`       | Refers to parent class                                        |
| Encapsulation | Binding data and methods + controlled access                  |
| Inheritance   | Acquiring properties from another class                       |
| Polymorphism  | One interface/name, multiple forms                            |
| Overloading   | Same method name, different parameters                        |
| Overriding    | Child provides a new implementation                           |
| Abstraction   | Hiding implementation details                                 |
| Interface     | Defines a contract for implementing classes                   |
| `static`      | Belongs to the class                                          |
| `final`       | Prevents reassignment/overriding/inheritance depending on use |
| Package       | Organizes related classes                                     |
| Exception     | Runtime or checked problem handled by exception mechanisms    |

---

# ⭐ Four Pillars of OOP

```text
             OOP
              │
     ┌────────┼────────┐
     │        │        │
Encapsulation Inheritance Polymorphism
              │
         Abstraction
```

### Encapsulation

```text
Data + Methods
      ↓
   Class
```

### Inheritance

```text
Parent
  ↓
Child
```

### Polymorphism

```text
One Name
   ↓
Many Forms
```

### Abstraction

```text
Hide Details
     ↓
Show Essentials
```

---

# 📚 What I Am Learning

This repository represents my journey of learning Java and Object-Oriented Programming.

```text
✅ Java Basics
✅ Methods
✅ Classes & Objects
✅ Constructors
✅ Encapsulation
✅ Inheritance
✅ Polymorphism
✅ Abstraction
✅ Interfaces
✅ Exception Handling
🔄 Data Structures & Algorithms
🔄 Advanced Java
```

---

# 🚀 Future Goals

* Improve Java programming skills
* Practice Data Structures and Algorithms
* Build Java projects
* Learn advanced OOP
* Learn Git & GitHub
* Develop backend applications
* Become a Full-Stack Developer

---

# 🤝 Contributions

This repository is primarily created for learning and practice.

Suggestions, improvements, and educational contributions are welcome.

---

# 📄 License

This project is created for educational and learning purposes.

---

# 👨‍💻 Author

## Ahmed Hussain

**Java Learner | Full-Stack Developer in Progress | Problem Solver**

Learning:

```text
☕ Java
🌐 HTML
🎨 CSS
⚡ JavaScript
🧠 Data Structures & Algorithms
🔧 Git & GitHub
💻 Full-Stack Development
```

---

## ⭐ Support

If you find this repository useful for learning Java OOPs, consider giving it a ⭐ on GitHub.

**Keep Learning. Keep Coding. Keep Building. 🚀**

---

This is ready to save as **`README.md`** in your OOPs GitHub repository.
