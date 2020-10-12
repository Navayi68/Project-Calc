package com.example.calc

class SimpleClass(val userInformationDataClass:UserInformationDataClass) {


    /**
     * This Functions is to Save Users Data in DataBase ->Offline
     * */
    fun saveUserDataInDatabase(){
        userInformationDataClass.userName
        userInformationDataClass.email
        userInformationDataClass.phoneNumber
    }
}