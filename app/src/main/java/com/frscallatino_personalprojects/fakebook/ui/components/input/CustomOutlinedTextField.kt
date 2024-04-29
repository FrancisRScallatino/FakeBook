package com.frscallatino_personalprojects.fakebook.ui.components.input

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.frscallatino_personalprojects.fakebook.ui.theme.White5

@Composable
fun CustomOutlinedTextField(
    value: String,
    label: String,
    icon: ImageVector,
    onValueChange: (String) -> Unit
) {
    OutlinedTextField(
        value = value,
        onValueChange = {
            onValueChange(it)
        },
        label = { Text(text = label) },
        colors = TextFieldDefaults.outlinedTextFieldColors(
            focusedBorderColor = Color.Black,
            focusedLabelColor = Color.Black,
            cursorColor = Color.Black,
            backgroundColor = White5
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 8.dp)
            .clip(
                RoundedCornerShape(4.dp)
            ),
        leadingIcon = {
            Icon(imageVector = icon, contentDescription = "")
        }
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewCustomOutlinedTextField(){

    var usernameInput by remember { mutableStateOf("") }

    CustomOutlinedTextField(
        value = usernameInput,
        label = "username",
        icon = Icons.Default.AccountCircle,
        onValueChange = { usernameInput = it }
    )
}
