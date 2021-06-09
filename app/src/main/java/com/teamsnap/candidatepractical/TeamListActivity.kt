package com.teamsnap.candidatepractical

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.teamsnap.data.teamSnapClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class TeamListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_team_list)

        // TODO: Display a list of teams from the provided data source in TeamSnapClient

        // TODO: Delete this rudimentary example code
        GlobalScope.launch(Dispatchers.IO) {
            val response = teamSnapClient.getTeams()
            if (response.isSuccessful) {
                Log.d("TSCP", "${response.body()}")
            }
        }
    }
}