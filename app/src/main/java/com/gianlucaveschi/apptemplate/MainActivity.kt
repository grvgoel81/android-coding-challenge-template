package com.gianlucaveschi.apptemplate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    @ExperimentalAnimationApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppMain()
        }
    }
}

@ExperimentalAnimationApi
@Preview
@Composable
fun AppMain() {
    MaterialTheme {
        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text(text = "Kotlin Android Template") },
                    backgroundColor = MaterialTheme.colors.primary
                )
            },
            backgroundColor = MaterialTheme.colors.background
        ) {
            Box(
                modifier = Modifier
                    .padding(it)
                    .fillMaxSize()
                    .wrapContentSize(align = Alignment.Center)
                    .padding(horizontal = 8.dp)
            ) {
                Column(
                    modifier = Modifier,
                    verticalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    Text(
                        text = "This is just a template",
                        style = MaterialTheme.typography.h6
                    )
                }
            }
        }
    }
}
