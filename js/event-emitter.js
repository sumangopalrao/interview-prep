// Program to create event emitter which can subscribe and unsubscribe to calls
// https://leetcode.com/problems/event-emitter

class EventEmitter {

    eventsMap = new Map();
    
    /**
     * @param {string} eventName
     * @param {Function} callback
     * @return {Object}
     */
    subscribe(eventName, callback) {

        if (!this.eventsMap.has(eventName)) {
            this.eventsMap.set(eventName, [callback]);
        } else {
            const callbacks = this.eventsMap.get(eventName);
            callbacks.push(callback);
        }
        
        return {
            unsubscribe: () => {
                // console.log('Events are', this.eventsMap);
                if (this.eventsMap.has(eventName)) {
                    const callbacks = this.eventsMap.get(eventName);
                    const callbackIndex = callbacks.findIndex((elem) => elem === callback);
                    // console.log('Callback index', callbackIndex);
                    const newCallbacks = [];
                    for(let i=0; i<this.eventsMap.get(eventName).length; i++) {
                        if (i !== callbackIndex) {
                            newCallbacks.push(this.eventsMap.get(eventName)[i]);
                        }
                    }
                    if (newCallbacks.length === 0) {
                        this.eventsMap.delete(eventName);
                    }
                    this.eventsMap.set(eventName, newCallbacks);
                }
                return;
            }
        };
    }
    
    /**
     * @param {string} eventName
     * @param {Array} args
     * @return {Array}
     */
    emit(eventName, args = []) {
        console.log('Events are', this.eventsMap);
        if (!this.eventsMap.has(eventName)) {
            return [];
        }
        const results = [];
        const callbacks = this.eventsMap.get(eventName);
        callbacks.forEach(element => {
            // console.log('Argument type is', typeof args);
            // console.log('Output is', element(args));
            results.push(element(...args));
        });
        return results;
    }
}

//  const emitter = new EventEmitter();

 // Subscribe to the onClick event with onClickCallback
// function onClickCallback() { return 99 }
// const sub = emitter.subscribe('onClick', onClickCallback);

// console.log(emitter.emit('onClick')); // [99]
// console.log(sub.unsubscribe()); // undefined
// console.log(emitter.emit('onClick')); // []



const emitter = new EventEmitter();
const sub1 = emitter.subscribe("firstEvent", x => x + 1);
const sub2 = emitter.subscribe("firstEvent", x => x + 2);
sub1.unsubscribe(); // undefined
console.log(emitter.emit("firstEvent", [5])); // [7]