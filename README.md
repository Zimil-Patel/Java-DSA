# Introduction to JAVA

# Short Definition of JDK (Java Development Kit)

**JDK (Java Development Kit)** is a software development environment used for building Java applications. It includes tools required to write, compile, and run Java programs.

### Components of JDK

1. **JRE (Java Runtime Environment)**: Provides libraries, Java Virtual Machine (JVM), and other components to run applications written in Java.

2. **JVM (Java Virtual Machine)**: Executes Java bytecode and enables Java programs to be platform-independent.

3. **Java Compiler (`javac`)**: Converts Java source code into bytecode (.class files) that can be executed by the JVM.

4. **Java Debugger (`jdb`)**: Helps debug Java programs by providing tools to inspect code during execution.

5. **Java Archive (`jar`) Tool**: Packages Java classes and metadata into JAR files for distribution.

6. **Java Documentation Generator (`javadoc`)**: Generates API documentation from Java source code comments.

This concise description can be used for a GitHub repository to explain the JDK and its components.

To show how to print output in Java for your GitHub documentation, you can provide an example like this:

# Printing Output in Java

In Java, you can use `System.out.println()` to print text or values to the console. Below is a basic example:

The difference between `print()` and `println()` in Java is based on how they handle output formatting:

### `print()`
- **Description**: Outputs the text or value to the console but **does not move to a new line** after printing.
- **Behavior**: The next output will appear on the same line.

**Example**:
```java
System.out.print("Hello, ");
System.out.print("World!");
```
**Output**:
```
Hello, World!
```

### `println()`
- **Description**: Outputs the text or value to the console and **moves to a new line** after printing.
- **Behavior**: The next output will appear on a new line.

**Example**:
```java
System.out.println("Hello, ");
System.out.println("World!");
```
**Output**:
```
Hello, 
World!
```

### Summary:
- **`print()`**: Prints without a new line.
- **`println()`**: Prints with a new line.

# Variables and Constants in Java

#### **1. Variables:**
A **variable** is a container that holds data which can change during the execution of a program. Java is a statically-typed language, so you must declare the variable's type before using it.

##### **Types of Variables**:
- **Local Variables**: Declared inside methods, constructors, or blocks and are accessible only within those.
- **Instance Variables**: Declared inside a class but outside any method, representing the object’s attributes.
- **Static Variables**: Declared with the `static` keyword inside a class and shared among all instances of the class.

##### **Example**:
```java
int age = 25;          // Local variable
double salary = 50000; // Instance variable
static int count = 0;  // Static variable
```

#### **2. Constants:**
A **constant** is a variable whose value cannot be changed once assigned. In Java, constants are declared using the `final` keyword. By convention, constant names are written in uppercase letters.

##### **Example**:
```java
final int MAX_USERS = 100;
final double PI = 3.14159;
```

### Key Points:
- **Variables** can be reassigned during the program.
- **Constants** (declared with `final`) cannot be modified once assigned.
- **Static variables** are shared among all objects of a class.
- **Local variables** exist only within methods or blocks. 

This short explanation covers the basic concepts of variables and constants in Java for quick reference.

In Java, each primitive data type has a specific size in bytes, which defines the range of values that can be stored in that type. Below is a summary of Java's primitive data types along with their sizes and ranges:

# Primitive Data Types in Java

| Data Type | Size (in Bytes) | Range |
|-----------|-----------------|-------|
| `byte`    | 1               | -128 to 127 |
| `short`   | 2               | -32,768 to 32,767 |
| `int`     | 4               | -2,147,483,648 to 2,147,483,647 |
| `long`    | 8               | -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 |
| `float`   | 4               | Approximately ±3.40282347E+38 (6-7 significant decimal digits) |
| `double`  | 8               | Approximately ±1.79769313486231570E+308 (15 significant decimal digits) |
| `char`    | 2               | 0 to 65,535 (unsigned, represents Unicode characters) |
| `boolean` | 1 (not precisely defined) | `true` or `false` |


