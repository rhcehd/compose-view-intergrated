package dev.rhcehd123.composeviewintergrated

import android.os.Bundle
import android.widget.Toast
import androidx.activity.addCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    private var prevTimeMillis = 0L
    private val backPressCallback = {
        val currentTimeMillis = System.currentTimeMillis()
        if(currentTimeMillis - prevTimeMillis < 3000) {
            finish()
        } else {
            Toast.makeText(this, "press back button to finish app", Toast.LENGTH_SHORT).show()
            prevTimeMillis = currentTimeMillis
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<MaterialToolbar>(R.id.toolbar)
        val drawer = findViewById<DrawerLayout>(R.id.drawer_layout)
        setSupportActionBar(toolbar)
        toolbar.setNavigationOnClickListener {
            drawer.open()
        }

        val navigationView = findViewById<NavigationView>(R.id.navigation_view)
        val navHost = supportFragmentManager.findFragmentById(R.id.fragment_container_view) as NavHostFragment
        val navController = navHost.navController
        navigationView.setNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.screen_a -> {
                    navController.navigate(R.id.screen_a)
                    drawer.close()
                    true
                }
                R.id.screen_b -> {
                    navController.navigate(R.id.screen_b)
                    drawer.close()
                    true
                }
                R.id.screen_c -> {
                    navController.navigate(R.id.screen_c)
                    drawer.close()
                    true
                }
                else -> true
            }
        }

        onBackPressedDispatcher.addCallback {
            backPressCallback.invoke()
        }
    }
}