function greet() {
    const myDate = new Date();
    if (myDate.getHours() >= 0 && myDate.getHours() < 6)
        console.log("凌晨好");
    if (myDate.getHours() >= 6 && myDate.getHours() < 12)
        console.log("早上好");
    if (myDate.getHours() >= 12 && myDate.getHours() < 18)
        console.log("下午好");
    if (myDate.getHours() >= 18 && myDate.getHours() < 24)
        console.log("晚上好");
}
