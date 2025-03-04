# Arrays

Arrays are used to store lists of related elements in contiguous memory locations of a computer. Because of the adjacent storage, accessing specific elements of an array is very efficient if you know its index.

🔸 MEMORY

- Depending on the programming language used, sometimes it's necessary to define the size of the array upon creation. The size equivalent space will be "reserved" in memory, even if no elements are yet stored in the array, which can make your program memory inefficient if you don't know beforehand how many elements you need.

🔸 INSERTION and DELETION

- Constant time O(1) if you're appending to the end and there's still space left. Same if you're removing the last element of the array.

- Linear time O(N) for inserting or deleting at the start or middle, as it involves moving elements to the right or left, respectively.

❗️If an array is full, inserting a new element involves creating a new, larger array and copying all elements into it - timewise a very expensive operation.

🔸 SEARCH for an element

- Constant time O(1) if you know the index of the element

- Logarithmic time O(log(N)) if you don't know the index but your array is sorted, using binary search

- Linear time O(N) if you don't know the index and the array is not sorted, using linear search