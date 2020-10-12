package com.example.calc

class SimpleClass(val userInformationDataClass:UserInformationDataClass) {

    fun saveUserDataInDatabase(){
        userInformationDataClass.userName="Ali"
        userInformationDataClass.email="naji6823.an@gmail.com"
        userInformationDataClass.phoneNumber="09366888512"
    }
}