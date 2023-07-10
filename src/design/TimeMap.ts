// Add a time based key value pair data structure
// https://leetcode.com/problems/time-based-key-value-store/description/
// Last step cpt

export class TimeMap {
    private map: Map<string, Array<{timestamp: number, value: string}>>;

    constructor() {
        this.map = new Map();
    }

    set(key: string, value: string, timestamp: number): void {

        if (this.map.has(key)) {
            const valuesForKey = this.map.get(key);
            valuesForKey?.push({timestamp: timestamp, value: value});
            // valuesForKey?.sort((a, b) => a.timestamp - b.timestamp);
        } else {
            this.map.set(key, [({timestamp: timestamp, value: value})]);
        }
    }

    get(key: string, timestamp: number): string {

        if (!this.map.has(key)) {
            return "";
        }

        const value = this.map.get(key);
        if (value != null && value.length !== 0) {
            let low = 0;
            let high = value.length - 1;

            while (low < high) {
                const mid = Math.floor((low + high + 1) / 2);
                if (value[mid].timestamp <= timestamp) {
                    low = mid;
                } else {
                    high = mid - 1;
                }
            }

            // If we have no valid timestamp, return an empty string
            if (value[low].timestamp > timestamp) {
                return "";
            }

            // Return the value of the highest timestamp that doesn't exceed the input timestamp
            return value[low].value;
        }

        // If there are no values for the key, return an empty string
        return "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * var obj = new TimeMap()
 * obj.set(key,value,timestamp)
 * var param_2 = obj.get(key,timestamp)
 */

const timeMap = new TimeMap();
timeMap.set("foo", "bar", 1);  // store the key "foo" and value "bar" along with timestamp = 1.
// console.log(timeMap.get("foo", 1));    
// console.log(timeMap.get("foo", 3));    
timeMap.set("foo", "bar2", 4); // store the key "foo" and value "bar2" along with timestamp = 4.
console.log(timeMap.get("foo", 4));         // return "bar2"
console.log(timeMap.get("foo", 5)); 