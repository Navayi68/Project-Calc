package com.example.calc

fun MainActivity.functionOperation(): Boolean {
    return activityMainbinding.textShowResult.text.endsWith('+') ||
            activityMainbinding.textShowResult.text.endsWith('-') ||
            activityMainbinding.textShowResult.text.endsWith('*') ||
            activityMainbinding.textShowResult.text.endsWith('/')
}

fun MainActivity.functionOperationResult() {

    if (editNumber) {

        if (plusEnable) {
            if (number2 == 1) numberResult = resultPlus(number1, number2).toString().toInt()
            else numberResult = resultPlus(number2, number1).toString().toInt()
            number2 = numberResult
            activityMainbinding.textResult.text = number2.toString()

        } else if (minusEnable) {
            if (number2 == 0) numberResult = resultMinus(number1, number2).toString().toInt()
            else numberResult = resultMinus(number2, number1).toString().toInt()

            number2 = numberResult
            activityMainbinding.textResult.text = number2.toString()
        }else if (multiEnable){
                activityMainbinding.textResult.text = resultMulti(number1, number2).toString()
                number2 = resultMulti(number1, number2)
        }else if (divEnable){
            if (number2 == 1) numberResult = resultDiv(number1, number2).toString().toInt()
            else numberResult = resultDiv(number2, number1).toString().toInt()
            number2 = numberResult
            activityMainbinding.textResult.text = number2.toString()
        }
    }

}

