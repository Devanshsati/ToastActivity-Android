package com.example.toastactivity

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.shashank.sony.fancytoastlib.FancyToast
import www.sanju.motiontoast.MotionToast
import www.sanju.motiontoast.MotionToastStyle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val toastButton1 = findViewById<Button>(R.id.button1)
        val toastButton2 = findViewById<Button>(R.id.button2)
        val toastButton3 = findViewById<Button>(R.id.button3)
        toastButton1.setOnClickListener {Toast.makeText(this, "TOAST FROM BUTTON 1 😂", Toast.LENGTH_SHORT).show() }
        toastButton2.setOnClickListener {Toast.makeText(this, "TOAST FROM BUTTON 2 ❤️", Toast.LENGTH_SHORT).show() }
        toastButton3.setOnClickListener {Toast.makeText(this, "TOAST FROM BUTTON 3 😁", Toast.LENGTH_SHORT).show() }


        val buttonIds = arrayOf(R.id.fancyButton1, R.id.fancyButton2, R.id.fancyButton3, R.id.fancyButton4, R.id.fancyButton5, R.id.fancyButton6)
        val toastTypes = arrayOf(FancyToast.DEFAULT, FancyToast.SUCCESS, FancyToast.INFO, FancyToast.WARNING, FancyToast.ERROR, FancyToast.CONFUSING)
        buttonIds.forEachIndexed { index, buttonId ->
            val fancyButton = findViewById<Button>(buttonId)
            fancyButton.setOnClickListener {
                FancyToast.makeText(this, "Fancy Toast 👌 !", FancyToast.LENGTH_SHORT, toastTypes[index], true).show()
            }
        }

        // Create an array to store button IDs
        val motionButtonIds = arrayOf(
            R.id.MotionButton1, R.id.MotionButton2, R.id.MotionButton3, R.id.MotionButton4,
            R.id.MotionButton5, R.id.MotionButton6, R.id.MotionButton7, R.id.MotionButton8,
            R.id.MotionButton9, R.id.MotionButton10, R.id.MotionButton11, R.id.MotionButton12,
            R.id.MotionButton13, R.id.MotionButton14, R.id.MotionButton15, R.id.MotionButton16,
            R.id.MotionButton17, R.id.MotionButton18, R.id.MotionButton19, R.id.MotionButton20
        )

        // Create a single click listener
        val clickListener = View.OnClickListener { view ->
            val message = when (view.id) {
                in arrayOf( R.id.MotionButton1, R.id.MotionButton2, R.id.MotionButton3, R.id.MotionButton4 ) -> "Hurray success 😍"
                in arrayOf( R.id.MotionButton5, R.id.MotionButton6, R.id.MotionButton7, R.id.MotionButton8 ) -> "Failed ☹️"
                in arrayOf( R.id.MotionButton9, R.id.MotionButton10, R.id.MotionButton11, R.id.MotionButton12 ) -> "Warning 🤔"
                in arrayOf( R.id.MotionButton13, R.id.MotionButton14, R.id.MotionButton15, R.id.MotionButton16 ) -> "This is information toast! 😎"
                else -> "❌ Delete ❌"
            }
            val style = when (view.id) {
                in arrayOf( R.id.MotionButton1, R.id.MotionButton2, R.id.MotionButton3, R.id.MotionButton4 ) -> MotionToastStyle.SUCCESS
                in arrayOf( R.id.MotionButton5, R.id.MotionButton6, R.id.MotionButton7, R.id.MotionButton8 ) -> MotionToastStyle.ERROR
                in arrayOf( R.id.MotionButton9, R.id.MotionButton10, R.id.MotionButton11, R.id.MotionButton12 ) -> MotionToastStyle.WARNING
                in arrayOf( R.id.MotionButton13, R.id.MotionButton14, R.id.MotionButton15, R.id.MotionButton16 ) -> MotionToastStyle.INFO
                else -> MotionToastStyle.DELETE
            }
            val font = ResourcesCompat.getFont(this, R.font.helvetica_regular)
            when (view.id) {
                in arrayOf( R.id.MotionButton1, R.id.MotionButton5, R.id.MotionButton9, R.id.MotionButton13, R.id.MotionButton17 ) ->
                    MotionToast.createToast(this, message, "successfully!", style, MotionToast.GRAVITY_BOTTOM, MotionToast.SHORT_DURATION, font)
                in arrayOf( R.id.MotionButton2, R.id.MotionButton6, R.id.MotionButton10, R.id.MotionButton14, R.id.MotionButton18 ) ->
                    MotionToast.createColorToast(this, message, "successfully!", style, MotionToast.GRAVITY_BOTTOM, MotionToast.SHORT_DURATION, font)
                in arrayOf( R.id.MotionButton3, R.id.MotionButton7, R.id.MotionButton11, R.id.MotionButton15, R.id.MotionButton19 ) ->
                    MotionToast.darkToast(this, message, "successfully!", style, MotionToast.GRAVITY_BOTTOM, MotionToast.SHORT_DURATION, font)
                in arrayOf( R.id.MotionButton4, R.id.MotionButton8, R.id.MotionButton12, R.id.MotionButton16, R.id.MotionButton20 ) ->
                    MotionToast.darkColorToast(this, message, "successfully!", style, MotionToast.GRAVITY_BOTTOM, MotionToast.SHORT_DURATION, font)
            }
        }
        // Assign the click listener to all buttons
        motionButtonIds.forEach { buttonId ->
            findViewById<Button>(buttonId).setOnClickListener(clickListener)
        }

    }
}




//        You can also remove the android icon on top-right corner by passing last parameter false.
//        FancyToast.makeText(this, "I'm a Toast", FancyToast.LENGTH_SHORT, type, false).show();
//        You can also create your custom Toasts with passing your image with or without android icon(top-right corner):
//        FancyToast.makeText(this, "I'm a custom Toast", FancyToast.LENGTH_SHORT, type, yourImage, false).show();
//        To display the custom Toast with no android icon:
//        FancyToast.makeText(this, "This is Custom Toast with no android icon", FancyToast.LENGTH_SHORT, FancyToast.CONFUSING, R.drawable.ic_android_black_24dp, false);


