// Given an array or object, find out if it is empty?
// https://leetcode.com/problems/is-object-empty/description/

function isEmpty(obj: Record<string, any> | any[]): boolean {
    if ((Array.isArray(obj) && !obj.length) || JSON.stringify(obj) === '{}') {
        return true;
    }

    return false;
};