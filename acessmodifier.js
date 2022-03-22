var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var acess = /** @class */ (function () {
    function acess(firstName, lastName) {
        this.fname = firstName;
        this.lname = lastName;
    }
    acess.prototype.getFullName = function () {
        return this.fname + this.lname;
    };
    return acess;
}());
var a = new acess("hello", "sumagv");
console.log(a.getFullName());
var acess2 = /** @class */ (function (_super) {
    __extends(acess2, _super);
    function acess2() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    acess2.prototype.message2 = function () {
        console.log("hello baby");
    };
    return acess2;
}(acess));
var b = new acess2("hello", "hello");
b.message2();
//u cant use variable fname and lname because they are private varible
