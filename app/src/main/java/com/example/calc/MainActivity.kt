package com.example.calc

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.calc.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    var plusResult:Int=0
    var plusResult1:Int=0
    var marks=""
    lateinit var v:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        v=ActivityMainBinding.inflate(layoutInflater)
        setContentView(v.root)
        clickListener()
    }

    private fun clickListener() {
        btn_zero.setOnClickListener(this)
        btn_one.setOnClickListener(this)
        btn_two.setOnClickListener(this)
        btn_three.setOnClickListener(this)
        btn_four.setOnClickListener(this)
        btn_five.setOnClickListener(this)
        btn_six.setOnClickListener(this)
        btn_seven.setOnClickListener(this)
        btn_eight.setOnClickListener(this)
        btn_nine.setOnClickListener(this)

        btn_dot.setOnClickListener(this)
        btn_result.setOnClickListener(this)
        btn_plus.setOnClickListener(this)
        btn_mines.setOnClickListener(this)
        btn_multi.setOnClickListener(this)
        btn_div.setOnClickListener(this)
        btn_plus_mines.setOnClickListener(this)
        btn_perc.setOnClickListener(this)
        btn_ac.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        var txtResult=findViewById<TextView>(R.id.text_result)

        when(v.id){
            R.id.btn_zero->{
                if(txtResult.text!="0")
                    text_result.text=(txtResult.text).toString().plus("0")
            }
            R.id.btn_one->{
                if(txtResult.text=="0") {
                    txtResult.text = ""
                    txtResult.text = (txtResult.text).toString().plus("1")
                }else
                    txtResult.text = (txtResult.text).toString().plus("1")
            }
            R.id.btn_two->{
                if(txtResult.text=="0") {
                    txtResult.text = ""
                    txtResult.text = (txtResult.text).toString().plus("2")
                }else
                    txtResult.text = (txtResult.text).toString().plus("2")
            }
            R.id.btn_three->{
                if(txtResult.text=="0") {
                    txtResult.text = ""
                    txtResult.text = (txtResult.text).toString().plus("3")
                }else
                    txtResult.text = (txtResult.text).toString().plus("3")

            }
            R.id.btn_four->{
                if(txtResult.text=="0") {
                    txtResult.text = ""
                    txtResult.text = (txtResult.text).toString().plus("4")
                }else
                    txtResult.text = (txtResult.text).toString().plus("4")            }
            R.id.btn_five->{
                if(txtResult.text=="0") {
                    txtResult.text = ""
                    txtResult.text = (txtResult.text).toString().plus("5")
                }else
                    txtResult.text = (txtResult.text).toString().plus("5")            }
            R.id.btn_six->{
                if(txtResult.text=="0") {
                    txtResult.text = ""
                    txtResult.text = (txtResult.text).toString().plus("6")
                }else
                    txtResult.text = (txtResult.text).toString().plus("6")            }
            R.id.btn_seven->{
                if(txtResult.text=="0") {
                    txtResult.text = ""
                    txtResult.text = (txtResult.text).toString().plus("7")
                }else
                    txtResult.text = (txtResult.text).toString().plus("7")            }
            R.id.btn_eight->{
                if(txtResult.text=="0") {
                    txtResult.text = ""
                    txtResult.text = (txtResult.text).toString().plus("8")
                }else
                    txtResult.text = (txtResult.text).toString().plus("8")            }
            R.id.btn_nine->{
                if(txtResult.text=="0") {
                    txtResult.text = ""
                    txtResult.text = (txtResult.text).toString().plus("9")
                }else
                    txtResult.text = (txtResult.text).toString().plus("9")            }

            R.id.btn_div->{
                marks="/"
                txtResult.let {
                    if (txtResult.text!="0"){
                        plusResult=txtResult.text.toString().toInt()
                        txtResult.text=""
                    }
                }
            }
            R.id.btn_multi->{
                marks="*"
                txtResult.let {
                    if (txtResult.text!="0"){
                        plusResult=txtResult.text.toString().toInt()
                        txtResult.text=""
                    }
                }
            }
            R.id.btn_mines->{
                marks="-"
                txtResult.let {
                    if (txtResult.text!="0"){
                        plusResult=txtResult.text.toString().toInt()
                        txtResult.text=""
                    }
                }
            }
            R.id.btn_plus->{
                marks="+"
                txtResult?.let {
                    if (txtResult.text!="0"){
                        plusResult=txtResult.text.toString().toInt()
                        txtResult.text=""
                    }
                }

            }
            R.id.btn_result->{
                when(marks){
                    "+"->{
                        if (txtResult.text!="0"){
                            plusResult1=txtResult.text.toString().toInt()
                            txtResult.text=(plusResult.plus(plusResult1)).toString()
                        }

                    }
                    "-"->{
                        if (txtResult.text!="0"){
                            plusResult1=txtResult.text.toString().toInt()
                            txtResult.text=(plusResult.minus(plusResult1)).toString()
                        }

                    }
                    "*"->{
                        if (txtResult.text!="0"){
                            plusResult1=txtResult.text.toString().toInt()
                            txtResult.text=(plusResult*plusResult1).toString()
                        }

                    }
                    "/"->{
                        if (txtResult.text!="0"){
                            plusResult1=txtResult.text.toString().toInt()
                            txtResult.text=(plusResult.div(plusResult1)).toString()
                        }

                    }
                }

            }
            R.id.btn_perc->{

            }
            R.id.btn_plus_mines->{

            }
            R.id.btn_dot->{

            }
            R.id.btn_ac->text_result.text="0"
        }
    }
}
