package com.yogaveda.uphaar.feature.login.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.yogaveda.uphaar.feature.login.viewmodel.LoginViewModel
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import uphaar.feature.login.generated.resources.Res
import uphaar.feature.login.generated.resources.uphaar_simple_icon

@Composable
fun LoginMain() {

    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .fillMaxHeight(.5f)
                .padding(bottom = 24.dp)
        ) {
            Image(
                painter = painterResource(resource = Res.drawable.uphaar_simple_icon),//Res.drawable.uphaar_simple_icon),
                contentDescription = "Logo Image",
                modifier = Modifier
                    .height(248.dp)
                    .width(248.dp)

            )
        }
        /*Spacer(
            modifier = Modifier
                .height(108.dp)
        )*/
        Column (
            modifier = Modifier,
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Button(
                onClick = {}
            ) {
                Text("Login using phone number")
            }
            Button(
                onClick = {}
            ) {
                Text("Login using google")
            }
        }

    }
}

@Composable
@Preview
fun LoginPreview() {
    LoginMain()
}