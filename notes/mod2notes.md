# Module 2

## Dynamic Connectivity

**Given a set of N objects**

Union command: connect two objects

Find/connected query: is there a path connecting the two objects

**We assume "is connected to" is an equivalence relation**

- Reflexive: p is connected to p
- Symmetric: if p is connected to q, then q is connected to p
- Transitive: if p is connected to q and q is connected to r, then p is connected to r

**Connected components**

Maximal set of objects that are mutually connected

**Implementation**

Find query: Check if two objects are in the same component

Union command: Replace components containing two objects with their union

**Union-find data type**

UF(int N)

void union(int p, int q)

boolean connected(int p, int q)

**Dynamic-connectivity client**

Read in number objects *N* from standard input

- Read in pair of integers from standard input
- If they are not yet connected, connect them and print out pair

## Quick-find