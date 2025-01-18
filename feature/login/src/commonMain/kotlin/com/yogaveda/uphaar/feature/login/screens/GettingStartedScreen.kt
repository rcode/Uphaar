package com.yogaveda.uphaar.feature.login.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun GettingStartedScreen() {

    Column (
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Column {
            Text(
                modifier = Modifier,
                text = "Hi, Rahul!",
                fontSize = 48.sp
            )
            Text(
                text = "Let's get started.",
                fontSize = 24.sp
            )
            Spacer(
                modifier = Modifier
                    .height(24.dp)
            )
            Text(
                text = "Create a board for an occasion or a Wishlist board",
                fontSize = 18.sp
            )
        }

        Spacer(
            modifier = Modifier
                .height(48.dp)
        )

        Button(
            onClick = {}
        ) {
            Text(
                modifier = Modifier,
                text = "Create a board for an occasion")
        }
        Button(
            onClick = {}
        ) {
            Text("Create a wishlist")
        }
    }
}

@Preview
@Composable
fun GettingStartedScreenPreview() {
    GettingStartedScreen()
}