package com.bondi.harakamall.ui.screens.intent

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.bondi.harakamall.ui.theme.neworange
import com.bondi.harakamall.ui.theme.newwhite

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun IntentScreen(navController: NavController){
    Column (modifier = Modifier.fillMaxSize()){
        //TopAppBar
        TopAppBar(
            title = {Text(text = "Intents")},
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = neworange,
                titleContentColor = newwhite,
                navigationIconContentColor = newwhite,
                actionIconContentColor = newwhite
            ),
            navigationIcon = {
                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "menu")
                }
            },
            actions = {
                Icon(imageVector = Icons.Default.Share, contentDescription = "shoppingcart")
                Icon(imageVector = Icons.Default.Settings, contentDescription = "notifications")
            }
        )
        //End of TopAppBar
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {

        },
            colors = ButtonDefaults.buttonColors(Color.Blue),

            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp),
        ) {Text(text = "M-pesa") }
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {

        },
            colors = ButtonDefaults.buttonColors(Color.Blue),

            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp),
        ) {Text(text = "SMS") }
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {

        },
            colors = ButtonDefaults.buttonColors(Color.Blue),

            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp),
        ) {Text(text = "Call") }
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {

        },
            colors = ButtonDefaults.buttonColors(Color.Blue),

            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp),
        ) {Text(text = "Share") }
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {

        },
            colors = ButtonDefaults.buttonColors(Color.Blue),

            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp),
        ) {Text(text = "Camera") }
        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {

        },
            colors = ButtonDefaults.buttonColors(Color.Blue),

            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp),
        ) {Text(text = "Email") }

    }


}
@Preview(showBackground = true)
@Composable
fun IntentScreenPreview(){
    IntentScreen(navController = rememberNavController())


}