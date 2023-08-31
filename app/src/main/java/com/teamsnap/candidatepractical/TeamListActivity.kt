package com.teamsnap.candidatepractical

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.compose.ui.platform.ComposeView
import androidx.lifecycle.lifecycleScope
import com.teamsnap.data.teamSnapClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class TeamListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_list)

        findViewById<ComposeView>(R.id.compose_view).setContent {
            // TODO: Display a list of teams from the provided data source in TeamSnapClient
        }

        // TODO: Delete this rudimentary example code
        lifecycleScope.launch(Dispatchers.IO) {
            val response = teamSnapClient.getTeams()
            if (response.isSuccessful) {
                Log.d("TSCP", "${response.body()}")
            }
        }
    }
}