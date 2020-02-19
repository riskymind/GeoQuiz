package com.thisiskelechi.geoquiz

import android.util.Log
import androidx.lifecycle.ViewModel

class QuizViewModel: ViewModel() {

    private val questionBank = listOf(
        Question(R.string.question_australia,true),
        Question(R.string.question_oceans, true),
        Question(R.string.question_mideast, false),
        Question(R.string.question_africa, false),
        Question(R.string.question_america, true),
        Question(R.string.question_asia, true)
    )

    var currentIndex = 0
    var isCheater = false

    val currentQuestionAnswer: Boolean  = questionBank[currentIndex].answer

    val currentQuestionText: Int = questionBank[currentIndex].textResId

    fun moveToNext() {
        currentIndex = (currentIndex + 1) % questionBank.size
    }

    fun moveToPrev() {
        currentIndex = currentIndex - 1
    }
}