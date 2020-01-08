package com.example.viewsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.editText)
        val checkBoxDrink = findViewById<CheckBox>(R.id.checkBoxDrink)
        val checkBoxFood = findViewById<CheckBox>(R.id.checkBoxFood)
        val radioButtonMale = findViewById<RadioButton>(R.id.radioButtonMale)
        val radioButtonFemale = findViewById<RadioButton>(R.id.radioButtonFemale)
        val spinnerCurry = findViewById<Spinner>(R.id.spinnerCurry)
        val listView = findViewById<ListView>(R.id.listView)
//        listView.choiceMode = ListView.CHOICE_MODE_MULTIPLE

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            Log.d("view sample", "editText.text - ${editText.text}")
            Log.d("view sample", "checkBoxDrink.isChecked - ${checkBoxDrink.isChecked}")
            Log.d("view sample", "checkBoxFood.isChecked - ${checkBoxFood.isChecked}")
            Log.d("view sample", "radioButtonMale.isChecked - ${radioButtonMale.isChecked}")
            Log.d("view sample", "radioButtonFemale.isChecked - ${radioButtonFemale.isChecked}")
            Log.d("view sample", "spinnerCurry.selectedItem - ${spinnerCurry.selectedItem}")
            Log.d("view sample", "listView.getCheckedItemPositions() - ${listView.getCheckedItemPositions()}")
        }
    }
}
