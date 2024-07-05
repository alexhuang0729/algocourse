### Analysis of Algorithms

## Intro

# Cast of characters
- Programer needs working solution
- Client wants to solve problem
- Theoretician wants to understand

# Reasons to analyze algorithms
- Predict performanace
- Compare algorithms
- Provide guarantees
- Understand theoretical basis
- Avoid performance bugs

# The challenge
Will program be able to solve a large practical input?

# Scientific method
1. Observe some feature of natural world
2. Hypothesize
3. Predict events
4. Verify predictions
5. Validate unitl we're comfortable that they agree

# Principles
+ Experiments must be reproducible
+ Hypotheses must be falsifiable

## Observations

# Data analysis
- Essentially, perform linear regression to predict running time

# System independent effects
- Algorithm
- Input data
- Determines exponent b and constant a in power law

# System dependent effects
- Hardware: CPU, memory, cache
- Software: compiler, interpreter, garbage collector
- System: operating system, network, other apps

## Mathematical Models

Total running time: sum of cost x frequency for all operations
- Need to analyze programs to determine set of operations
- Cost depends on machine, compiler
- Frequency depends on algorithm, input data

# Simplification 1: cost model
- Cost model. Use some basic operations as a proxy for running time

# Simplification 2: tilde notation 
- Estimate running time as a function of input size N
- Ignore lower order terms
  - When N is large, terms are negligible
  - When N is small, we don't care

# Estimating a discrete sum
Q. How to estimate a discrete sum?
A1. Take discrete math course
A2. Replace the sum with an integral, and use calculus!

# Math models for running time
In principle, accurate math maodels are available

In practice,
- Formulas can be complicated
- Advanced math might be required
- Exact models best left for experts

## Order-of-Growth Classifications

# Common classifications
Good news: Small set of functions
1. log N, N, N log N, N^2, N^3, 2^N
Suffices to describe order-of-growth of typical algorithms

1. no loop = constant
2. Some kind of loop where divided in half = logarithmic (log N)
3. Loop where you touch everything = linear 
4. Divide and conquer/merge sort = linearithmic (N log N)
5. Double loop = quadratic (N^2)
6. Triple loop = cubic (N^3)
7. Combinatorial search = exponential (2^N)

# Binary search
Goal: Given a sorted array and a key, 
find index of the key in the array

Compare key against middle entry
   - Too small, go left
   - Too big, go right
   - Equal, found

log N because divison by 2

# Sorting-based algorithm
- Sort the N (distinct) numbers
- FOr each pair of numbers a[i] and a[j], binary search for -(a[i] + a[j])

Analysis: Order of growth is N^2 log N
- Step 1: N^2 with insertion sort
- Step 2: N^2 log N with binary search

## Theory of algorithms

# Types of analyses
Best care. Lower bound on cost
- Determined by "easiest" input
- Provides a goal for all inputs

Worst case. Upper bound on cost
- Destermineed by most difficult input
- Provides a guarantee for all inputs

Average case. Expected cost for random input
- Need a model for "random" input
- Provides a way to predict performance

Actual data might not match input model
- Need to understand input to effectively process it
- Approach 1: design for the worst case
- Approach 2: randomize, depend on probabilistic guarantee

Goals
- Establish "difficulty" of a problem
- Develop "optimal" algorithms

Approach
- Suppress details in analysis: analyze "to within a constant factor"
- Eliminate variability in input model by focusing on the worst case

Optimal algorithm
- Performance guarantee for any input
- No algorithm can provide a better performance guarantee

Big theta: Asymptomatic order of growth
Big O: Upper bounds of performance
Big Omega: Lower bounds

# Ex 1
Upper bound. A specific algorithm
- Brute-force for 1-sum
- Running time for optimal algorithm for 1-sum is O(N)

Lower bound. Proof that no algorithm can do better
- Ex. have to examine all N entries
- Running time of the optimal algorithm for 1-sum is omega(N)

Optimal algorithm
- Lower bound equals upper bound
- Brute-force algorithm for 1-sum is optimal: its running time is theta(N)

# Ex 2
Upper bound
- Ex. improved algorithm for 3-Sum
- Running time of the optimal algorithm for 3-Sum is O(N^2 log N)

Lower bound
- Ex. Have to examine all N entries to solve 3-Sum
- Running time of the optimal algorithm for solving 3-Sum is omega(N)

Open problems
- Optimal algorithm for 3-Sum?
- Subquadratic algorithm or quadratic lower bound for 3-Sum?

# Algorithm design approach
Start
- Develop an algorithm
- Prove a lower bound

Gap?
- Lower the upper bound (Discover a new algorithm)
- Raise the lower bound (more difficult)

![Table](C:\Users\alexh\algocourse\Screenshot 2024-07-05 111120.png)

## Memory

# Basics
Bit: 0 or 1
Byte: 8 bits
MB: 1 million or 2^20 bytes
GB: 1 billion or 2^30 bytes

boolean: 1 byte
byte: 1 byte
char: 2 bytes
int: 4 bytes
float: 4 bytes
long: 8 bytes
double: 8 bytes

char[]: 2N + 24
int[]: 4N + 24
double[]: 8N + 24

char[][]: 2MN
int[][]: 4MN
double[][]: 8MN

# Objects
Object overhead: 16 bytes
Reference: 8 bytes
Padding: Each object uses a multiple of 8 bytes