# Bridgelabz_Java

Java assignments and practice programs completed as part of the **BridgeLabz Training Program**. Assignments are provided through Google Classroom (GCR) and implemented using **Java in IntelliJ IDEA**. Completed solutions and JUnit tests are organized into topic-wise Git branches.

## Repository Structure

| Branch | Purpose |
| --- | --- |
| `main` | README and daily progress updates. |
| `develop` | Base Java project structure for development. |
| `feature/coreProgramming` | Core Java programming assignments. |
| `feature/object-oriented-programming` | Object-Oriented Programming assignments. |
| `feature/dataStructures` | Data Structures, searching, and sorting programs. |
| `feature/Collections-Streams` | Collections, Generics, Lambda Expressions, Streams, Regex, and Exception Handling. |
| `feature/IO-DesignPattern-MultiThreading` | File I/O, Annotations, Design Patterns, Multithreading, TDD, and JUnit test cases. |



## Daily Progress Log

### Day 30 – 18 Nov 2026

**What I did:**
- Continued studying Java Multithreading and concurrency concepts.
- Practiced thread creation and execution using `Thread` and `Runnable`.
- Worked on the `SimpleThreadedCounter` and `ProducerConsumer` programming exercises.
- Practiced synchronization concepts and thread coordination for shared data.
- Worked with JUnit test cases for multithreading programs and revised common thread-related errors.

**What I will do:**
- Revise thread synchronization, thread communication, and thread lifecycle concepts.
- Practice additional multithreading questions and explore thread pools and the Executor Framework.
- Continue preparing for technical reviews with practical Java implementations.

**Issues Faced:** Understanding how thread execution order can vary and how shared data is coordinated between threads.

---

### Day 29 – 17 Nov 2026

**What I did:**
- Started learning the fundamentals of Java Multithreading.
- Understood the differences between processes and threads and the benefits of concurrent execution.
- Studied ways to create threads using the `Thread` class and `Runnable` interface.
- Learned about thread lifecycle states and the differences between `start()` and `run()`.
- Practiced basic multithreading examples and studied race conditions and synchronization at an introductory level.

**What I will do:**
- Continue multithreading and solve thread-based programming problems.
- Learn synchronization and thread communication with practical examples.
- Practice implementing and testing concurrent Java programs.

**Issues Faced:** Initially found it difficult to understand thread scheduling and why the order of thread execution is not fixed.

---

### Day 28 – 16 Nov 2026

**What I did:**
- Continued learning Java File I/O concepts and the structure of JUnit test cases.
- Practiced file-based operations through Address Book and Employee Payroll examples.
- Studied Java annotations, including built-in and custom annotations.
- Learned about annotation retention, targets, and accessing metadata through Reflection.
- Organized implementation and test classes into separate `src/main/java` and `src/test/java` folders.

**What I will do:**
- Begin Java Multithreading and understand thread creation and execution.
- Practice basic thread-related Java programs.
- Revise annotations and File I/O for technical reviews.

**Issues Faced:** Faced some confusion with JUnit dependencies and test source configuration in IntelliJ IDEA.

---

### Day 27 – 14 Nov 2026

**What I did:**
- Studied Java File I/O fundamentals and commonly used file-handling classes.
- Practiced reading and writing files using `FileReader`, `FileWriter`, and buffered streams.
- Reviewed Java NIO concepts such as `Path` and `Files`.
- Learned the purpose of Java annotations and their practical uses.
- Revised programming concepts for upcoming technical reviews.

**What I will do:**
- Continue working on File I/O examples and corresponding unit tests.
- Practice creating and reading custom annotations.
- Begin learning multithreading concepts.

**Issues Faced:** None.

---

### Day 26 – 13 Nov 2026

**What I did:**
- Continued Java implementation practice and revised previously covered topics.
- Worked on organizing Java source files and test cases in suitable packages.
- Practiced using Git to track changes and manage feature branches.
- Reviewed Java project structure and coding conventions.

**What I will do:**
- Study Java File I/O and Annotations.
- Practice file-handling programs and unit testing.
- Continue preparation for technical reviews.

**Issues Faced:** None.

---

### Day 25 – 12 Nov 2026

**What I did:**
- Revised important Java concepts from Collections, Generics, and Java 8.
- Practiced writing and understanding testable Java programs.
- Worked on organizing Java assignments into topic-specific packages.
- Reviewed Git commands, repository structure, and feature branch workflows.

**What I will do:**
- Continue Java implementation practice.
- Revise JUnit testing concepts and Java 17 topics.
- Begin studying File I/O and Annotations.

**Issues Faced:** None.

---

### Day 24 – 11 Nov 2026

**What I did:**
- Studied JUnit 5 test annotations, assertions, and test lifecycle methods.
- Practiced the concepts behind parameterized tests using `@ValueSource` and `@CsvSource`.
- Learned the basics of Mockito, including mocks, stubbing, and verification.
- Reviewed the use of `@Mock`, `@InjectMocks`, `when()`, and `verify()`.
- Revised Java Collections, Generics, and Java 8 concepts for technical reviews.

**What I will do:**
- Practice writing JUnit test cases for Java programs.
- Understand Mockito through practical examples.
- Continue reviewing core Java concepts.

**Issues Faced:** Initially found it difficult to distinguish between real objects, mocks, and test assertions.

---

### Day 23 – 10 Nov 2026

**What I did:**
- Practiced Java Regex operations using `Pattern` and `Matcher`.
- Learned methods such as `matches()`, `find()`, `group()`, `start()`, and `end()`.
- Worked on validation patterns for email addresses, mobile numbers, passwords, dates, and usernames.
- Started studying unit testing with JUnit 5 and common test assertions.
- Learned the basic purpose of test cases and exception testing.

**What I will do:**
- Practice parameterized testing in JUnit.
- Continue writing validation test cases.
- Explore the basics of Mockito.

**Issues Faced:** Faced some confusion while choosing appropriate regex patterns and JUnit assertions.

---

### Day 22 – 09 Nov 2026

**What I did:**
- Studied Java Regular Expressions and their use in text matching and validation.
- Practiced character classes, quantifiers, anchors, and word boundaries.
- Learned capturing groups, non-capturing groups, and alternation.
- Studied greedy, reluctant, and possessive quantifiers.
- Practiced lookaheads, lookbehinds, and the `Pattern` and `Matcher` classes.

**What I will do:**
- Solve regex-based validation problems.
- Revise advanced regex syntax with small examples.
- Begin learning JUnit testing concepts.

**Issues Faced:** Initially found it difficult to understand lookarounds and the differences between regex quantifiers.

---

### Day 21 – 07 Nov 2026

**What I did:**
- Studied Java Generics and their role in type safety and code reusability.
- Practiced generic classes, methods, interfaces, and bounded type parameters.
- Learned wildcards (`? extends` and `? super`) and the PECS principle.
- Understood type erasure, generic invariance, and common generic restrictions.
- Studied important Java 17 enhancements, especially Records and their generated methods.

**What I will do:**
- Practice Generics and Java 17 coding problems.
- Begin studying Java Regular Expressions.
- Revise concepts for upcoming technical reviews.

**Issues Faced:** Faced difficulty understanding wildcard bounds and type erasure, which became clearer through examples.

---

### Day 20 – 06 Nov 2026

**What I did:**
- Studied the Java Stream API and the structure of a stream pipeline.
- Practiced intermediate operations such as `filter()`, `map()`, `flatMap()`, `distinct()`, and `sorted()`.
- Learned terminal operations such as `reduce()`, `collect()`, `forEach()`, and `count()`.
- Practiced collectors, including `groupingBy()` and `partitioningBy()`.
- Studied the `Optional` class and its methods for handling missing values.

**What I will do:**
- Solve more Java Stream problems using Collections.
- Study Generics and important Java 17 features.
- Revise stream operations and their differences.

**Issues Faced:** Initially found `map()` vs `flatMap()` and `reduce()` vs `collect()` confusing.

---

### Day 19 – 05 Nov 2026

**What I did:**
- Studied Lambda Expressions and their syntax in Java 8.
- Learned Functional Interfaces and the Single Abstract Method (SAM) concept.
- Practiced `Predicate`, `Function`, `Consumer`, `Supplier`, and operator interfaces.
- Learned method references and constructor references.
- Revised default and static methods in interfaces and their practical use.

**What I will do:**
- Begin studying the Stream API and `Optional`.
- Practice functional programming concepts through Java examples.
- Apply Lambda Expressions in collection operations.

**Issues Faced:** Found it challenging to distinguish lambda expressions, method references, and anonymous inner classes.

---

### Day 18 – 04 Nov 2026

**What I did:**
- Studied the Java `Map` interface and its implementations, including `HashMap`, `LinkedHashMap`, and `TreeMap`.
- Learned HashMap internals, hashing, buckets, collision handling, and resizing.
- Understood initial capacity, load factor, rehashing, and treeification.
- Practiced common Map methods such as `put()`, `get()`, `remove()`, and `entrySet()`.
- Studied `ConcurrentHashMap`, thread-safety basics, and sorting maps.

**What I will do:**
- Start Java 8 features, including Lambda Expressions and Functional Interfaces.
- Practice more HashMap-based coding questions.
- Revise important differences between Map implementations.

**Issues Faced:** Initially found HashMap resizing and collision resolution difficult to visualize.

---

### Day 17 – 03 Nov 2026

**What I did:**
- Studied the `Set` interface, including `HashSet`, `LinkedHashSet`, and `TreeSet`.
- Learned duplicate handling and ordering differences in Set implementations.
- Revised `hashCode()` and `equals()` and their role in hashing.
- Studied the `Queue` and `Deque` interfaces, including `PriorityQueue` and `ArrayDeque`.
- Practiced `Comparable`, `Comparator`, and collection traversal.

**What I will do:**
- Study the Map interface and HashMap internals.
- Practice Map and Set programming questions.
- Revise collection performance and ordering rules.

**Issues Faced:** Faced confusion with hashing, ordering differences, and the `equals()`–`hashCode()` contract.

---

### Day 16 – 02 Nov 2026

**What I did:**
- Studied the Java Collections Framework and its main interfaces.
- Learned the `List` interface and `ArrayList`, `LinkedList`, `Vector`, and `Stack`.
- Compared dynamic arrays and linked lists based on operations and performance.
- Understood ArrayList capacity, resizing, and time complexity.
- Practiced using `Iterator`, `ListIterator`, and basic List operations.

**What I will do:**
- Study the Set, Queue, and Deque interfaces.
- Practice collection-based Java programs.
- Revise List implementation differences.

**Issues Faced:** Initially found the performance differences between ArrayList and LinkedList confusing.

---

### Day 15 – 01 Nov 2026

**What I did:**
- Revised searching and sorting algorithms, including Linear Search and Binary Search.
- Practiced DSA concepts such as Stacks, Queues, and Linked Lists.
- Reviewed time and space complexity of commonly used algorithms.
- Practiced solving Java coding problems in preparation for further topics.

**What I will do:**
- Begin learning the Java Collections Framework.
- Practice implementing collections with common operations.
- Revise important DSA concepts for technical reviews.

**Issues Faced:** None.

---

### Day 14 – 31 Oct 2026

**What I did:**
- Practiced and implemented LeetCode problems using Java.
- Applied Data Structures and Algorithms concepts to solve coding challenges.
- Worked on improving logical thinking and understanding different approaches to problem-solving.
- Revised previously learned concepts to strengthen coding fundamentals.

**What I will do:**
- Continue solving LeetCode problems of increasing difficulty.
- Focus on optimizing solutions using time and space complexity analysis.
- Practice more DSA problems to improve coding efficiency and confidence.

**Issues Faced:** None.

---

### Day 13 – 30 Oct 2026

**What I did:**
- Studied Time Complexity and Space Complexity to understand algorithm efficiency.
- Learned about Big O notation and analyzed the performance of different algorithms.
- Revised Hashing concepts, including hash functions, buckets, and collision handling.
- Watched YouTube tutorials to gain better clarity on the internal working of HashMaps.

**What I will do:**
- Practice analyzing time and space complexities of Java programs.
- Solve LeetCode problems to improve problem-solving skills.
- Continue revising Data Structures and Algorithms.

**Issues Faced:** None.

---

### Day 12 – 29 Oct 2026

**What I did:**
- Studied and implemented StringBuilder, StringBuffer, FileReader, and InputStreamReader concepts in Java.
- Practiced string manipulation, file handling, and performance comparison programs.
- Implemented Linear Search and Binary Search algorithms through different problem statements.
- Completed 16 Java programs and organized them into the StringIOAndSearching package.

**What I will do:**
- Revise searching algorithms and file handling concepts.
- Solve more problems to improve logical thinking and problem-solving skills.
- Continue practicing Java Data Structures and Algorithms.

**Issues Faced:** None.

---

### Day 11 – 28 Oct 2026

**What I did:**
- Studied and implemented different sorting algorithms in Java.
- Practiced Bubble Sort, Insertion Sort, Merge Sort, Quick Sort, Selection Sort, Heap Sort, and Counting Sort.
- Understood the working principles and time complexities of different sorting techniques.
- Organized 7 sorting programs into the Sorting package and pushed them to the Data Structures branch on GitHub.

**What I will do:**
- Solve more problems based on sorting algorithms.
- Revise sorting techniques and practice identifying suitable algorithms for different problems.
- Continue strengthening problem-solving and logical thinking skills through Java programming.

**Issues Faced:** None.

---

### Day 10 – 27 Oct 2026

**What I did:**
- Understood the fundamentals of Stacks and Queues in Java.
- Implemented basic problems to practice stack and queue operations.
- Gave a review on OOP and String concepts.
- Strengthened my understanding of data structures through practical implementation.

**What I will do:**
- Solve more problems based on Stacks and Queues.
- Practice different problem-solving approaches to improve logical thinking and coding skills.

**Issues Faced:** None.

---

### Day 09 – 26 Oct 2026

**What I did:**
- Studied the fundamentals of Linked Lists and revised related OOP concepts.
- Watched YouTube tutorials to understand Singly Linked Lists.
- Learned about node structure, references, and basic operations in Singly Linked Lists.

**What I will do:**
- Study Doubly Linked Lists and Circular Linked Lists.
- Understand their structure and basic operations.
- Practice implementing Linked List concepts in Java.

**Issues Faced:** None.

---

### Day 08 – 24 Oct 2026

**What I did:**
- Completed assignments covering encapsulation, polymorphism, abstraction, and inheritance.
- Practiced method overriding, abstract classes, interfaces, and inheritance hierarchies.
- Applied OOP concepts to banking, employee management, library, hospital, and vehicle systems.
- Organized 19 programs into the `EncPolyAbs` and `Inheritance` packages.
- Compiled the programs and pushed them to the OOP branch on GitHub.

**What I will do:**
- Revise inheritance, abstraction, and polymorphism.
- Continue practicing OOP concepts through upcoming assignments.

**Issues Faced:** None.

---

### Day 07 – 23 Oct 2026

**What I did:**
- Completed Java programs demonstrating `this`, `static`, `final`, and `instanceof`.
- Practiced object relationships through association, aggregation, and composition.
- Implemented object communication in library, banking, university, hospital, and e-commerce systems.
- Created class, object, and sequence diagrams using PlantUML for school results and grocery billing applications.
- Organized and pushed the Java assignments to the OOP branch.

**What I will do:**
- Revise object relationships and UML diagram notation.
- Continue with upcoming Object-Oriented Programming assignments.

**Issues Faced:** Initially found it difficult to distinguish aggregation from composition, which became clearer through examples of independent and dependent object lifecycles.

---

### Day 06 – 22 Oct 2026

**What I did:**
- Completed Object-Oriented Fundamentals Level 1 and Level 2 assignments using classes, objects, constructors, and encapsulation.
- Completed Constructor Level 1 programs covering default, parameterized, and copy constructors, along with constructor chaining.
- Practiced instance and class variables and methods in Level 2.
- Completed Level 3 exercises covering public, protected, and private access modifiers and basic inheritance.
- Organized the programs into their respective packages.

**What I will do:**
- Revise constructors, static members, and access modifiers.
- Continue with upcoming Object-Oriented Programming assignments.

**Issues Faced:** Faced some confusion between instance and static members, which was resolved by comparing object-specific data with data shared across all objects.

---

### Day 05 – 21 Oct 2026

**What I did:**
- Practiced Java Strings Level 1, Level 2, and Level 3 programs.
- Worked on string manipulation, character operations, substring handling, and string comparison.
- Completed additional Strings exercises involving palindrome checking, reversing strings, and character operations.
- Practiced Java built-in functions for date formatting, date arithmetic, time zones, and date comparison.
- Worked on modular programming through additional Java Methods exercises, including recursion, number checking, and mathematical operations.
- Organized the completed programs into their respective packages.

**What I will do:**
- Complete the remaining Java Methods practice programs.
- Revise Core Programming concepts and begin Object-Oriented Programming.

**Issues Faced:** None.

---

### Day 04 – 19 Oct 2026

**What I did:**
- Practiced Java Arrays Level 1 and Level 2 programming assignments.
- Learned to store, access, and process data using one-dimensional and two-dimensional arrays.
- Practiced array operations such as finding the largest and smallest elements, reversing numbers, calculating BMI, and finding digit frequencies.
- Completed Methods Level 1, Level 2, and Level 3 programming assignments.
- Practiced methods with parameters and return values, static methods, recursion, and mathematical operations.
- Implemented programs involving number checking, unit conversion, random number generation, student scorecards, and matrix manipulation.
- Organized the programs into appropriate packages and pushed the completed work to GitHub.

**What I will do:**
- Revise the completed Arrays and Methods programs.
- Practice more Java problems to strengthen problem-solving skills.
- Continue with upcoming Java assignments while following proper coding practices.

**Issues Faced:** Faced some difficulty understanding array logic and matrix operations, which was resolved through practice and debugging.

---

### Day 03 – 17 Oct 2026

**What I did:**
- Practiced Level 1 and Level 2 Java programming assignments.
- Organized Java programs into appropriate packages and established a Git repository structure.
- Added, committed, and pushed completed assignments to GitHub.
- Submitted the assignments through Google Classroom.

**What I will do:**
- Continue practicing Java programming problems.
- Improve my understanding of Git branches and repository management.
- Work on upcoming assignments while following proper coding practices.

**Issues Faced:** Initially faced some confusion with Git repository structure and branch management, which was later resolved.

---

### Day 02 – 16 Oct 2026

**What I did:**
- Learned Java comments, basic data types, and variables.
- Practiced arithmetic operators, operator precedence, and type conversion.
- Learned to take user input in Java programs.
- Understood basic programming practices, including naming conventions and code organization.

**What I will do:**
- Practice Java programs using different data types, operators, and user inputs.
- Strengthen my understanding of Java fundamentals through hands-on exercises.

**Issues Faced:** None.

---

### Day 01 – 15 Oct 2026

**What I did:**
- Learned basic Git commands and version control concepts.
- Practiced creating repositories and working with GitHub.
- Learned how to add, commit, and push changes from a local repository.

**What I will do:**
- Practice Git commands and branch management.
- Begin learning Java programming fundamentals.

**Issues Faced:** None.
