package com.nicdeane.profilecardlayout

// This is more like a model class

data class UserProfile constructor(val name: String, val status: Boolean, val drawableID: Int)

    val userList = arrayListOf(
        UserProfile(name = "Donald Duck", status = true, drawableID = R.drawable.donald_duck),
        UserProfile(name = "Daisy Duck", status = false, drawableID = R.drawable.daisy_duck),
    )




// it was not accessible in Main when i had curly braces around the class.. weird.