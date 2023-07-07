package com.test.gradlebuilddemo

import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    fun getText(): CharSequence? {
        return "Hello World!"
    }

}


data class StudentBean(val name: String, val age: Int, val sex: String)  {
    override fun toString(): String {
        val builder = StringBuilder()
        builder.append("name: $name")
        builder.append("age: $age")
        builder.append("sex: $sex")
        return builder.toString()
    }
}

data class TeacherBean(val name: String, val age: Int, val sex: String) {
    override fun toString(): String {
        val builder = StringBuilder()
        builder.append("name: $name")
        builder.append("age: $age")
        builder.append("sex: $sex")
        return builder.toString()
    }
}
