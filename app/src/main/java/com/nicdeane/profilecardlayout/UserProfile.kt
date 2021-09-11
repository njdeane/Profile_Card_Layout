package com.nicdeane.profilecardlayout

// This is more like a model class

data class UserProfile constructor(val id: Int, val name: String, val status: Boolean, val drawableID: Int)

    val userList = arrayListOf(
        UserProfile(name = "Donald Duck", status = true, drawableID = R.drawable.donald_duck, id = 0),
        UserProfile(name = "Daisy Duck", status = false, drawableID = R.drawable.daisy_duck, id = 1),
        UserProfile(name = "Donald Duck", status = true, drawableID = R.drawable.donald_duck, id = 2),
        UserProfile(name = "Daisy Duck", status = false, drawableID = R.drawable.daisy_duck, id = 3),
        UserProfile(name = "Donald Duck", status = true, drawableID = R.drawable.donald_duck, id = 4),
        UserProfile(name = "Daisy Duck", status = false, drawableID = R.drawable.daisy_duck, id = 5),
        UserProfile(name = "Donald Duck", status = true, drawableID = R.drawable.donald_duck, id = 6),
        UserProfile(name = "Daisy Duck", status = false, drawableID = R.drawable.daisy_duck, id = 7),
        UserProfile(name = "Donald Duck", status = true, drawableID = R.drawable.donald_duck, id = 8),
        UserProfile(name = "Daisy Duck", status = false, drawableID = R.drawable.daisy_duck, id = 9),
        UserProfile(name = "Donald Duck", status = true, drawableID = R.drawable.donald_duck, id = 10),
        UserProfile(name = "Daisy Duck", status = false, drawableID = R.drawable.daisy_duck, id = 11),
        UserProfile(name = "Donald Duck", status = true, drawableID = R.drawable.donald_duck, id = 12),
        UserProfile(name = "Daisy Duck", status = false, drawableID = R.drawable.daisy_duck, id = 13),
        UserProfile(name = "Donald Duck", status = true, drawableID = R.drawable.donald_duck, id = 14),
        UserProfile(name = "Daisy Duck", status = false, drawableID = R.drawable.daisy_duck, id = 15),
        UserProfile(name = "Donald Duck", status = true, drawableID = R.drawable.donald_duck, id = 16),
        UserProfile(name = "Daisy Duck", status = false, drawableID = R.drawable.daisy_duck, id = 17),
        UserProfile(name = "Donald Duck", status = true, drawableID = R.drawable.donald_duck, id = 18),
        UserProfile(name = "Daisy Duck", status = false, drawableID = R.drawable.daisy_duck, id = 19),
        UserProfile(name = "Donald Duck", status = true, drawableID = R.drawable.donald_duck, id = 20),
        UserProfile(name = "Daisy Duck", status = false, drawableID = R.drawable.daisy_duck, id = 21),
        UserProfile(name = "Donald Duck", status = true, drawableID = R.drawable.donald_duck, id = 22),
        UserProfile(name = "Daisy Duck", status = false, drawableID = R.drawable.daisy_duck, id = 23),
        UserProfile(name = "Donald Duck", status = true, drawableID = R.drawable.donald_duck, id = 24),
        UserProfile(name = "Daisy Duck", status = false, drawableID = R.drawable.daisy_duck, id = 25),
        UserProfile(name = "Donald Duck", status = true, drawableID = R.drawable.donald_duck, id = 26),
        UserProfile(name = "Daisy Duck", status = false, drawableID = R.drawable.daisy_duck, id = 27),
    )




// it was not accessible in Main when i had curly braces around the class.. weird.