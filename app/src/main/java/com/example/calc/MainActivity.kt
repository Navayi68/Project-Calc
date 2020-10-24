package com.example.calc

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.calc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    object Operation {
        val pluss = "+"
        val minuss="-"
        val multis="*"
        val divs="/"
    }

    lateinit var activityMainbinding: ActivityMainBinding

    var number2: Int = 0
    var number1: Int = 0
    var numberResult = 0
    var plusEnable=false
    var minusEnable=false
    var multiEnable=false
    var divEnable=false


    var num=true
    var editNumber: Boolean = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainbinding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainbinding.root)
        callFindView()
    }

    fun resultPlus(firstNumber: Int, secondNumber: Int): Int = firstNumber.plus(secondNumber)
    fun resultMinus(firstNumber: Int, secondNumber: Int): Int = firstNumber.minus(secondNumber)
    fun resultMulti(firstNumber: Int, secondNumber: Int): Int = firstNumber.times(secondNumber)
    fun resultDiv(firstNumber: Int, secondNumber: Int): Int = firstNumber.div(secondNumber)

    fun sendShowResultPlus() {

        if (activityMainbinding.textResult.text != "" && editNumber) {
            activityMainbinding.textShowResult.text = activityMainbinding.textShowResult.text.toString() + activityMainbinding.textResult.text.toString().plus(MainActivity.Operation.pluss)
        }

        if (functionOperation()) {

            activityMainbinding.textShowResult.text = activityMainbinding.textShowResult.text.toString().removeRange(activityMainbinding.textShowResult.text.toString().length - 1, activityMainbinding.textShowResult.text.toString().length)
            activityMainbinding.textShowResult.text = activityMainbinding.textShowResult.text.toString().plus(MainActivity.Operation.pluss)


        }
    }


    fun sendShowResultMinus() {
        if (activityMainbinding.textResult.text != "" && editNumber) {
            activityMainbinding.textShowResult.text = activityMainbinding.textShowResult.text.toString() + activityMainbinding.textResult.text.toString().plus(MainActivity.Operation.minuss)
        }
        if (functionOperation()) {
            activityMainbinding.textShowResult.text = activityMainbinding.textShowResult.text.toString().removeRange(activityMainbinding.textShowResult.text.toString().length - 1, activityMainbinding.textShowResult.text.toString().length)
            activityMainbinding.textShowResult.text = activityMainbinding.textShowResult.text.toString().plus(MainActivity.Operation.minuss)

        }
    }

    fun sendShowResultMulti() {
        if (activityMainbinding.textResult.text != "" && editNumber) {
            activityMainbinding.textShowResult.text = activityMainbinding.textShowResult.text.toString() + activityMainbinding.textResult.text.toString().plus(MainActivity.Operation.multis)
        }
        if (functionOperation()) {
            activityMainbinding.textShowResult.text = activityMainbinding.textShowResult.text.toString().removeRange(activityMainbinding.textShowResult.text.toString().length - 1, activityMainbinding.textShowResult.text.toString().length)
            activityMainbinding.textShowResult.text = activityMainbinding.textShowResult.text.toString().plus(MainActivity.Operation.multis)


        }
    }

    fun sendShowResultDivs() {
        if (activityMainbinding.textResult.text != "" && editNumber) {
            activityMainbinding.textShowResult.text = activityMainbinding.textShowResult.text.toString() + activityMainbinding.textResult.text.toString().plus(MainActivity.Operation.divs)
        }
        if (functionOperation()) {
            activityMainbinding.textShowResult.text = activityMainbinding.textShowResult.text.toString().removeRange(activityMainbinding.textShowResult.text.toString().length - 1, activityMainbinding.textShowResult.text.toString().length)
            activityMainbinding.textShowResult.text = activityMainbinding.textShowResult.text.toString().plus(MainActivity.Operation.divs)


        }
    }


    fun callFindView() {
        activityMainbinding.buttonOne.setOnClickListener(this)
        activityMainbinding.buttonTwo.setOnClickListener(this)
        activityMainbinding.buttonThree.setOnClickListener(this)
        activityMainbinding.buttonFour.setOnClickListener(this)
        activityMainbinding.buttonFive.setOnClickListener(this)
        activityMainbinding.buttonSix.setOnClickListener(this)
        activityMainbinding.buttonSeven.setOnClickListener(this)
        activityMainbinding.buttonEight.setOnClickListener(this)
        activityMainbinding.buttonNine.setOnClickListener(this)
        activityMainbinding.buttonZero.setOnClickListener(this)

        activityMainbinding.buttonAc.setOnClickListener(this)
        activityMainbinding.buttonDot.setOnClickListener(this)
        activityMainbinding.buttonEqual.setOnClickListener(this)
        activityMainbinding.buttonPlus.setOnClickListener(this)
        activityMainbinding.buttonMinus.setOnClickListener(this)
        activityMainbinding.buttonDiv.setOnClickListener(this)
        activityMainbinding.buttonMulti.setOnClickListener(this)
        activityMainbinding.buttonPlusMinus.setOnClickListener(this)
        activityMainbinding.buttonPercentage.setOnClickListener(this)
        activityMainbinding.textResult.setOnClickListener(this)
        activityMainbinding.textShowResult.setOnClickListener(this)

    }

    override fun onClick(view: View) {
        start(view.id)

    }
}
