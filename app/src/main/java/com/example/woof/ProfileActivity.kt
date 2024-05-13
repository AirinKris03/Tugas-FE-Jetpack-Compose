package com.example.woof

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.woof.data.Knine
import com.example.woof.ui.theme.WoofTheme

class ProfileActivity : ComponentActivity() {

    private val knine: Knine by lazy {
        intent?.getSerializableExtra(KNINE_ID) as Knine
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WoofTheme {
                ProfileScreen(knine = knine)
            }
        }
    }

    companion object {
        private const val KNINE_ID = "knine_id"
        fun newIntent(context: Context, knine: Knine) =
            Intent(context, ProfileActivity::class.java).apply {
                putExtra(KNINE_ID, knine)
            }
    }
}
