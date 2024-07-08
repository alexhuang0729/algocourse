# Bags, Queues, and Stacks

## Stacks and queues

### Fundamental data types

- Value: collection of objects
- OperationsL insertm remove, iterate, test if empty
- Intent is clear when we isnert
- Which item do we remove?

![Stack v Queue](StackQueue.png)

- Stack: Examine the item most recently added. LIFO
- Queue: Examine the item least recemtly added. FIFO

## Client, implementation, interface

### Separate Interface and implementation

Ex: stack, queue, bag, priority queue, symbol table, union-find

### Benefits
- Client can't know details of implementation ⇒ client has many implementation from which to choose.
- Implementation can't know details of client needs ⇒ many clients can re-use the same implementation.
- Design: creates modular, reusable libraries.
- Performance: use optimized implementation where it matters