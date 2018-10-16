function multiNumBy2(arr){
    let num = Number(arr[0]);
    return num * 2;
}

function multi2Nums(arr){
    let num1 = Number(arr[0]);
    let num2 = Number(arr[1])
    return num1 * num2;
}

function multiAndDivideNums(arr){
    let num1 = Number(arr[0]);
    let num2 = Number(arr[1])
    
    if (num2 >= num1){
        return num1 * num2;
    }
    else{
        return num1 / num2;
    }
}
