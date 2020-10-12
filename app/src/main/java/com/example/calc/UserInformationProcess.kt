package com.example.calc

class UserInformationProcess(val userInformationDataClass:UserInformationDataClass) {


    /**
     * This Functions is to Save Users Data in DataBase ->Offline
     * */
    fun saveUserDataInDatabase(){
        userInformationDataClass.userName
        userInformationDataClass.email
        userInformationDataClass.phoneNumber
    }

    /**
     * Search In Database Based on UserName
     * */
    fun searcheInDatabase(username:String){
        
    }
}