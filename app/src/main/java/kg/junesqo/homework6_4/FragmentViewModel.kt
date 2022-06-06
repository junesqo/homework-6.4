package kg.junesqo.homework6_4

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlin.math.log

class FragmentViewModel: ViewModel() {

//    fun setOperation(operation: String) {
//        val list = ArrayList<String>()
//        list.add(operation)
//    }

    private var mCounter = 0
    private var mHistory = ""

    var history = MutableLiveData<String>()
    val counter = MutableLiveData<Int>()

    fun showHistory(){
        history.value = mHistory
        Log.e("history", history.toString())
    }

    fun onPlusClick() {
        Log.e("counter: ", mCounter.toString())
        mCounter++
        mHistory = "$mHistory\n+"
        history.value = mHistory
        Log.e("history: ", mHistory)
        Log.e("history: ", history.toString())
        counter.value = mCounter
    }

    fun onMinusClick() {
        Log.e("counter: ", mCounter.toString())
        mCounter--
        mHistory = "$mHistory\n-"
        history.value = mHistory
        Log.e("history: ", mHistory)
        Log.e("history: ", history.toString())
        counter.value = mCounter
    }

}