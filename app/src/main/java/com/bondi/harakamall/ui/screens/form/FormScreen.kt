package com.bondi.harakamall.ui.theme.screens.form

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.bondi.harakamall.R
import com.bondi.harakamall.navigation.ROUT_DASHBOARD
import com.bondi.harakamall.ui.theme.newpink
import com.bondi.harakamall.ui.theme.neworange
import com.bondi.harakamall.ui.theme.newpink


@Composable
fun FormScreen(navController: NavHostController) {


    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(painter = painterResource(R.drawable.img_3), contentScale = ContentScale.FillBounds),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center


    ) {


        Image(
            painter = painterResource(R.drawable.img_3),
            contentDescription = "",
            modifier = Modifier.size(200.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))


        Text(
            text = "CREATE AN ACOUNT",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,

            )

        Spacer(modifier = Modifier.height(10.dp))

        //VARIABLES
        var fullname by remember { mutableStateOf("") }
        var username by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var confirmpassword  by remember { mutableStateOf("") }



        //fullname
        TextField(
            value = fullname,
            onValueChange = { fullname = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = {   Icon(imageVector = Icons.Default.Person, contentDescription = "", tint = newpink) },
            label = { Text(text = "Fullname")},
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = newpink,
                focusedBorderColor = neworange,
            ),

            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

        )
        //end
        Spacer(modifier = Modifier.height(10.dp))




        //username
        TextField(
            value = username,
            onValueChange = { username = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = {   Icon(imageVector = Icons.Default.Face, contentDescription = "", tint = newpink) },
            label = { Text(text = "Username")},
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = newpink,
                focusedBorderColor = neworange,
            ),

            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)

        )
        //end
        Spacer(modifier = Modifier.height(10.dp))



        //email
        TextField(
            value = email,
            onValueChange = { email = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = {   Icon(imageVector = Icons.Default.Email, contentDescription = "", tint = newpink) },
            label = { Text(text = "Email Adress")},
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = newpink,
                focusedBorderColor = neworange,
            ),

            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)

        )
        //end
        Spacer(modifier = Modifier.height(10.dp))



        //password
        TextField(
            value = password,
            onValueChange = { password = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = {   Icon(imageVector = Icons.Default.Lock, contentDescription = "", tint = newpink) },
            label = { Text(text = "Password")},
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = newpink,
                focusedBorderColor = neworange,
            ),

            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()

        )
        //end
        Spacer(modifier = Modifier.height(10.dp))


        //confirmpassword
        TextField(
            value = confirmpassword,
            onValueChange = { confirmpassword = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            leadingIcon = {   Icon(imageVector = Icons.Default.Lock, contentDescription = "", tint = newpink) },
            label = { Text(text = "Confirm Password")},
            colors = OutlinedTextFieldDefaults.colors(
                unfocusedBorderColor = newpink,
                focusedBorderColor = neworange,
            ),

            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()

        )
        //end
        Spacer(modifier = Modifier.height(10.dp))





        Button(
            onClick = {
            },
            colors = ButtonDefaults.buttonColors(newpink),
            shape = RoundedCornerShape(30.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
        ) {
            Text(text = "REGISTER")
        }





    }

}





@Preview(showBackground = true)
@Composable
fun FormScreenPreview(){


    FormScreen(rememberNavController())


}