str = "I am a girl, I like dancing!";
arr = [];
let count = 0;
for (let i = 0; i < str.length; i++) {
    arr.push(str.charAt(i));
    count++;
}
arr.join('#');
console.log(count-1);
