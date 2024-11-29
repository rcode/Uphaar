package com.yogaveda.uphaar.feature.login.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
//import androidx.compose.material.icons.filled.Visibility
//import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.yogaveda.uphaar.feature.login.state.LoginUserState

@Composable
fun LoginUserDetails() {
    Column () {
        // Row for Name and image
        // Email Address
        // Password Phone Row
    }
}

@Composable
fun UserInputForm() {
    /*var fullName by remember { mutableStateOf("Rahul Thakur") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var phoneNumber by remember { mutableStateOf("") } */
    var passwordVisible by remember { mutableStateOf(false) }
    var uiState by remember { mutableStateOf(LoginUserState()) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Full Name Text Field
        OutlinedTextField(
            value = uiState.fullName,
            onValueChange = { uiState.fullName = it },
            label = { Text("Full name") },
            trailingIcon = {
                IconButton(onClick = { uiState.fullName = "" }) {
                    Icon(imageVector = Icons.Default.Close, contentDescription = "Clear")
                }
            },
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier.fillMaxWidth()
        )

        // Email Address Text Field
        OutlinedTextField(
            value = uiState.email,
            onValueChange = { uiState.email = it },
            label = { Text("Email address") },
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier.fillMaxWidth()
        )

        // Password Text Field
        OutlinedTextField(
            value = uiState.password,
            onValueChange = { uiState.password = it },
            label = { Text("Password") },
            visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
            trailingIcon = {
                IconButton(onClick = { passwordVisible = !passwordVisible }) {
                    Icon(
                        imageVector = if (passwordVisible) Icons.Filled.Lock else Icons.Filled.Face,
                        contentDescription = if (passwordVisible) "Hide password" else "Show password"
                    )
                }
            },
            supportingText = { Text("Minimum 8 characters") },
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier.fillMaxWidth()
        )

        // Phone Number Field with Country Code
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                modifier = Modifier
                    .background(Color.LightGray, RoundedCornerShape(16.dp))
                    .padding(8.dp)
            ) {
                Text("+91", fontSize = 16.sp)
            }
            OutlinedTextField(
                value = uiState.phone,
                onValueChange = { uiState.phone = it },
                label = { Text("Phone # (optional)") },
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewUserInputForm() {
    MaterialTheme {
        UserInputForm()
    }
}