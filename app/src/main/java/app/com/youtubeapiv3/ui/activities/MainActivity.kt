package app.com.youtubeapiv3.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import app.com.youtubeapiv3.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /** Get the bottom Navigation View. */
        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        /** Get the navigation fragment. */
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        /** Get the navController. */
        val navController = navHostFragment.navController
        /** Create the appBarConfiguration. */
        val appBarConfiguration = AppBarConfiguration(setOf(
            R.id.channelFragment,
            R.id.playListFragment,
            R.id.liveFragment
        ))
        /** Connect the navController and appBarConfiguration. */
        setupActionBarWithNavController(navController, appBarConfiguration)
        /** Connect the navController with bottomNavigationView. */
        bottomNavigationView.setupWithNavController(navController)
    }
}