package com.example.calc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.calc.databinding.ActivityInformationUserBinding

class InformationUserActivity : AppCompatActivity() {

    lateinit var v:ActivityInformationUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        v=ActivityInformationUserBinding.inflate(layoutInflater)
        setContentView(v.root)

        val userInformationDataClass=UserInformationDataClass(
            userName = "Ali",
            email = "Naji6823.an@gmail.com",
            phoneNumber ="09366888512"
        )

        val userInformationProcess:UserInformationProcess= UserInformationProcess(userInformationDataClass)
    }
}