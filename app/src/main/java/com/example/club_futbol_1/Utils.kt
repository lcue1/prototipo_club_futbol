package com.example.club_futbol_1

import android.widget.EditText
import com.google.android.material.textfield.TextInputEditText

object  Utils{

     fun validarEditText(editTexts: Array<TextInputEditText>): EditText? {//retorna null si todos los campos estan llenos
        return editTexts.find { et->
            val editTextVacio=et.text.toString().isEmpty()
            if (editTextVacio){
                et.setError("Campo obligatorio")///indica al usuario que un campo esta vacio
            }
            editTextVacio
        }//retorna null  o un edittext
    }

}