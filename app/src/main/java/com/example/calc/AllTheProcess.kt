package com.example.calc

fun MainActivity.start(viewId: Int) {


    when (viewId) {

        R.id.buttonOne -> {
            if (activityMainbinding.textResult.text.toString() != "0" && editNumber)
                activityMainbinding.textResult.text = (activityMainbinding.textResult.text.toString()).plus("1")
            else
                activityMainbinding.textResult.text = "1"

            editNumber = true
            number1 = activityMainbinding.textResult.text.toString().toInt()
        }

        R.id.buttonTwo -> {
            if (activityMainbinding.textResult.text.toString() != "0" && editNumber)
                activityMainbinding.textResult.text = (activityMainbinding.textResult.text.toString()).plus("2")
            else
                activityMainbinding.textResult.text = "2"

            editNumber = true
            number1 = activityMainbinding.textResult.text.toString().toInt()
        }

        R.id.buttonThree -> {
            if (activityMainbinding.textResult.text.toString() != "0" && editNumber)
                activityMainbinding.textResult.text = (activityMainbinding.textResult.text.toString()).plus("3")
            else
                activityMainbinding.textResult.text = "3"

            editNumber = true
            number1 = activityMainbinding.textResult.text.toString().toInt()
        }

        R.id.buttonFour -> {
            if (activityMainbinding.textResult.text.toString() != "0" && editNumber)
                activityMainbinding.textResult.text = (activityMainbinding.textResult.text.toString()).plus("4")
            else
                activityMainbinding.textResult.text = "4"

            editNumber = true
            number1 = activityMainbinding.textResult.text.toString().toInt()
        }

        R.id.buttonFive -> {
            if (activityMainbinding.textResult.text.toString() != "0" && editNumber)
                activityMainbinding.textResult.text = (activityMainbinding.textResult.text.toString()).plus("5")
            else
                activityMainbinding.textResult.text = "5"

            editNumber = true
            number1 = activityMainbinding.textResult.text.toString().toInt()
        }

        R.id.buttonSix -> {
            if (activityMainbinding.textResult.text.toString() != "0" && editNumber)
                activityMainbinding.textResult.text = (activityMainbinding.textResult.text.toString()).plus("6")
            else
                activityMainbinding.textResult.text = "6"

            editNumber = true
            number1 = activityMainbinding.textResult.text.toString().toInt()
        }

        R.id.buttonSeven -> {
            if (activityMainbinding.textResult.text.toString() != "0" && editNumber)
                activityMainbinding.textResult.text = (activityMainbinding.textResult.text.toString()).plus("7")
            else
                activityMainbinding.textResult.text = "7"

            editNumber = true
            number1 = activityMainbinding.textResult.text.toString().toInt()
        }

        R.id.buttonEight -> {
            if (activityMainbinding.textResult.text.toString() != "0" && editNumber)
                activityMainbinding.textResult.text = (activityMainbinding.textResult.text.toString()).plus("8")
            else
                activityMainbinding.textResult.text = "8"

            editNumber = true
            number1 = activityMainbinding.textResult.text.toString().toInt()
        }

        R.id.buttonNine -> {
            if (activityMainbinding.textResult.text.toString() != "0" && editNumber)
                activityMainbinding.textResult.text = (activityMainbinding.textResult.text.toString()).plus("9")
            else
                activityMainbinding.textResult.text = "9"

            editNumber = true
            number1 = activityMainbinding.textResult.text.toString().toInt()

        }

        R.id.buttonZero -> {
            if (activityMainbinding.textResult.text.toString() != "0" && editNumber)
                activityMainbinding.textResult.text = (activityMainbinding.textResult.text.toString()).plus("0")
            else
                activityMainbinding.textResult.text = "0"

            editNumber = true
            number1 = activityMainbinding.textResult.text.toString().toInt()
        }

        R.id.buttonAc -> {
            activityMainbinding.textResult.text = "0"
            activityMainbinding.textShowResult.text = ""
            number2 = 0
            number1 = 0
        }

        R.id.buttonPlus -> {
            sendShowResultPlus()
            if (activityMainbinding.textShowResult.text.toString().length<=2){
                plusEnable=true
                minusEnable=false
                multiEnable=false
                divEnable=false
                functionOperationResult()
            }else{
                functionOperationResult()
                plusEnable=true
                minusEnable=false
                multiEnable=false
                divEnable=false
            }

            editNumber = false
        }

        R.id.buttonMinus -> {
            sendShowResultMinus()
            if (activityMainbinding.textShowResult.text.toString().length<=2){
                minusEnable=true
                plusEnable=false
                multiEnable=false
                divEnable=false
                functionOperationResult()
            }else{
                functionOperationResult()
                minusEnable=true
                plusEnable=false
                multiEnable=false
                divEnable=false
            }

            editNumber = false
        }

        R.id.buttonMulti -> {
            if (number2 == 0) number2 = 1
            sendShowResultMulti()
            if (activityMainbinding.textShowResult.text.toString().length<=2){
                multiEnable=true
                minusEnable=false
                plusEnable=false
                divEnable=false
                functionOperationResult()
            }else{
                functionOperationResult()
                multiEnable=true
                minusEnable=false
                plusEnable=false
                divEnable=false
            }
            editNumber = false
        }

        R.id.buttonDiv -> {
            if (number2 == 0) number2 = 1
            sendShowResultDivs()
            if (activityMainbinding.textShowResult.text.toString().length<=2){
                minusEnable=false
                plusEnable=false
                multiEnable=false
                divEnable=true
                functionOperationResult()
            }else{
                functionOperationResult()
                minusEnable=false
                plusEnable=false
                multiEnable=false
                divEnable=true
            }
            editNumber = false
        }
    }
}