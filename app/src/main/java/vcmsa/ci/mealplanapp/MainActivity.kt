/*

 */

package vcmsa.ci.mealplanapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

   // @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

       val InputTime = findViewById<EditText>(R.id.InputTime)
        val Mealbtn = findViewById<Button>(R.id.Resultbtn)
        val Resetbtn = findViewById<Button>(R.id.Resetbtn)
        val meals = findViewById<TextView>(R.id.meals)

        Mealbtn.setOnClickListener {
            val timeOfDay = InputTime.text.toString().trim().lowercase()

            val suggestion = if(timeOfDay == "morning") {
                "Breakfast: French Toast, " +
                        "Yogurt and Muesli, " +
                        "Eggs Benedict"

            } else if (timeOfDay == "mid-morning") {
                "Snack: Carrot muffins," +
                        " Granola Bar, " +
                        "Fruit bowl"

            } else if (timeOfDay == "Afternoon") {
                "Lunch: Chicken and mayo sandwich," +
                        " Beef pie, " +
                        "Tuscan steak wrap"

            } else if (timeOfDay == "Mid-afternoon") {
                "Snack: Corn fritters," +
                        " Vanila cream cake," +
                        "Choc chip cookies"

            } else if (timeOfDay == "Dinner") {
                "Main course: Spaghetti and meatballs," +
                        " Margerita pizza, " +
                        "Chicken cheeseburger with fries"

            } else if (timeOfDay == "After dinner snack") {
                "Dessert: Ice cream and brownies," +
                        " Malva pudding and custard," +
                        " Chocolate mousse cup"

            } else {
                "Invalid input! Please enter a valid time of day (e.g., Morning, Mid-morning snack, Afternoon, Afternoon snack, Dinner, After dinner snack)."
            }

            meals.text = suggestion
        }

        Resetbtn.setOnClickListener {
            InputTime.text.clear()
            meals.text = "Meal suggestions will appear here"


        }
    }
}