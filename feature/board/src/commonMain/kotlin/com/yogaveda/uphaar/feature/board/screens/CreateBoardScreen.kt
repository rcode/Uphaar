package com.yogaveda.uphaar.feature.board.screens



import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CreateBoard() {
    var groupName by remember { mutableStateOf("") }
    var addTripDates by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        // Header
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = { /* Back action */ }) {
                Icon(Icons.Default.Close, contentDescription = "Close")
            }
            Text(
                text = "Create a group",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            TextButton(
                onClick = {
                    // validate model
                    // API call to
                }
            ) {
                Text(text = "Done", color = MaterialTheme.colorScheme.primary)
            }
        }

        // Group name field
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(48.dp)
                    .background(Color.LightGray, shape = CircleShape)
                    .clickable { /* Add image logic */ }
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = "Add Icon",
                    modifier = Modifier.align(Alignment.Center),
                    tint = Color.White
                )
            }
            OutlinedTextField(
                value = groupName,
                onValueChange = { groupName = it },
                label = { Text("Group name") },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(8.dp)
            )
        }

        // Type section
        Text(text = "Type", fontWeight = FontWeight.Bold)
        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.fillMaxWidth()
        ) {
            TypeChip("Trip", selected = true) // Default selected
            TypeChip("Home", selected = false)
            TypeChip("Couple", selected = false)
            TypeChip("Other", selected = false)
        }

        // Add trip dates toggle
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
        ) {
            Column {
                Text(text = "Add trip dates", fontWeight = FontWeight.Bold)
                Text(
                    text = "Splitwise will remind friends to join, add expenses, and settle up.",
                    fontSize = 12.sp,
                    color = Color.Gray
                )
            }
            Switch(
                checked = addTripDates,
                onCheckedChange = { addTripDates = it }
            )
        }

        // Date pickers
        if (addTripDates) {
            Row(
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier.fillMaxWidth()
            ) {
                DatePickerField(label = "Start", value = "Today") // Placeholder date
                DatePickerField(label = "End", value = "Today")   // Placeholder date
            }
        }
    }
}

@Composable
fun TypeChip(label: String, selected: Boolean) {
    Box(
        modifier = Modifier
            .background(
                color = if (selected) MaterialTheme.colorScheme.primary else Color.LightGray,
                shape = RoundedCornerShape(20.dp)
            )
            .clickable { /* Handle click */ }
            .padding(horizontal = 16.dp, vertical = 8.dp)
    ) {
        Text(
            text = label,
            color = if (selected) Color.White else Color.Black,
            fontWeight = FontWeight.Medium
        )
    }
}

@Composable
fun DatePickerField(label: String, value: String) {
    Column(modifier = Modifier) {
        Text(text = label, fontWeight = FontWeight.Bold)
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 8.dp)
                .background(Color.LightGray.copy(alpha = 0.2f), RoundedCornerShape(8.dp))
                .clickable { /* Show date picker dialog */ }
                .padding(8.dp)
        ) {
            Text(
                text = value,
                modifier = Modifier.weight(1f),
                color = Color.Black
            )
            Icon(Icons.Default.DateRange, contentDescription = "Calendar Icon")
        }
    }
}


