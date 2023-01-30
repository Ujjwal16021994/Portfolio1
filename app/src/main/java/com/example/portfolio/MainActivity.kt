package com.example.portfolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val SkillsActivity = findViewById<Button>(R.id.btnskills)
        SkillsActivity.setOnClickListener{
            intent = Intent(this,Skills::class.java)
            startActivity(intent)
        }
        val EducationActivity = findViewById<Button>(R.id.btneducation)
        EducationActivity.setOnClickListener{
            intent = Intent(this,Education::class.java)
            startActivity(intent)
        }
        val ProjectsActivity = findViewById<Button>(R.id.btnproject)
        ProjectsActivity.setOnClickListener{
            intent = Intent(this,Project::class.java)
            startActivity(intent)
        }
        val StrengthsActivity = findViewById<Button>(R.id.btnstrength)
        StrengthsActivity.setOnClickListener{
            intent = Intent(this,Strenths::class.java)
            startActivity(intent)
        }
        val AboutmeActivity = findViewById<Button>(R.id.btnaboutme)
        AboutmeActivity.setOnClickListener{
            intent = Intent(this,AboutMe::class.java)
            startActivity(intent)
        }
    }
}