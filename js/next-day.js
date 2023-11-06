// Given a date, find the next date in the format "YYYY-MM-DD"
/** 
 * @return {string}
 */
Date.prototype.nextDay = function() {

    this.setDate((this.getDate() + 1));

    let year = this.getFullYear();
    let month = this.getMonth() + 1;
    let day = this.getDate();

    month = month < 10 ? '0' + month : month;
    day = day < 10 ? '0' + day : day;

    return `${year}-${month}-${day}`;
	
}

 const date = new Date("2014-06-20");
 console.log("Next date is", date.nextDay()); // "2014-06-21"
 const date1 = new Date("2017-10-31");
 console.log("Next date is", date1.nextDay()); // "2017-11-01"