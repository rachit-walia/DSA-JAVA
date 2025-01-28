class PowerOfTwoMaxHeap {
    constructor(childrenExponent) {
        if (childrenExponent < 0) {
            throw new Error("childrenExponent must be non-negative.");
        }
        this.childrenExponent = childrenExponent;
        this.numChildren = 2 ** childrenExponent;
        this.heap = [];
    }

    /**

     * @param {number} value 
     */
    insert(value) {
        this.heap.push(value);
        this.heapifyUp(this.heap.length - 1);
    }

    /**
     * Removes and returns the maximum value from the heap.
     * @returns {number} - The maximum value.
     */
    popMax() {
        if (this.heap.length === 0) {
            throw new Error("Heap is empty.");
        }
        const maxValue = this.heap[0];
        const lastValue = this.heap.pop();
        if (this.heap.length > 0) {
            this.heap[0] = lastValue;
            this.heapifyDown(0);
        }
        return maxValue;
    }

    
    heapifyUp(index) {
        while (index > 0) {
            const parentIndex = Math.floor((index - 1) / this.numChildren);
            if (this.heap[index] > this.heap[parentIndex]) {
                this.swap(index, parentIndex);
                index = parentIndex;
            } else {
                break;
            }
        }
    }

    /**
     * Restores the heap property by moving a node down.
     * @param {number} index - The index of the node to heapify down.
     */
    heapifyDown(index) {
        while (true) {
            let largestIndex = index;

            for (let i = 1; i <= this.numChildren; i++) {
                const childIndex = this.numChildren * index + i;
                if (childIndex < this.heap.length && this.heap[childIndex] > this.heap[largestIndex]) {
                    largestIndex = childIndex;
                }
            }

            if (largestIndex !== index) {
                this.swap(index, largestIndex);
                index = largestIndex;
            } else {
                break;
            }
        }
    }

    /**
     * Swaps two elements in the heap.
     * @param {number} index1 - The index of the first element.
     * @param {number} index2 - The index of the second element.
     */
    swap(index1, index2) {
        [this.heap[index1], this.heap[index2]] = [this.heap[index2], this.heap[index1]];
    }

    /**
     * Returns the current size of the heap.
     * @returns {number} - The size of the heap.
     */
    size() {
        return this.heap.length;
    }

    /**
     * Checks if the heap is empty.
     * @returns {boolean} - True if the heap is empty, otherwise false.
     */
    isEmpty() {
        return this.heap.length === 0;
    }

    /**
     * Returns a string representation of the heap.
     * @returns {string} - The string representation.
     */
    toString() {
        return this.heap.join(', ');
    }
}

// Example Usage
const heap = new PowerOfTwoMaxHeap(2); // 2^2 = 4 children per node

heap.insert(10);
heap.insert(20);
heap.insert(15);
heap.insert(30);
heap.insert(25);
heap.insert(5);

console.log("Heap:", heap.toString());

console.log("Max:", heap.popMax());
console.log("Heap after pop:", heap.toString());

heap.insert(35);
console.log("Heap after insert:", heap.toString());
