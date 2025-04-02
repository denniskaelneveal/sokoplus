package com.bondi.harakamall.ui.screens.start

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bondi.harakamall.R
import com.bondi.harakamall.ui.theme.neworange

@Composable
fun StartScreen(){
    //For the white screen,contents to be arranged vertically without being over ech other
    Column (
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    )//End of Column
    {
        Text(
            text = "HarakaMall",
            fontSize = 20.sp
        )

        Spacer(modifier = Modifier.height(20.dp))

        ///Circular Image
        Image(
            painter = painterResource(R.drawable.home),
            contentDescription = "home",
            Modifier.size(300.dp).clip(shape = CircleShape),
            contentScale = ContentScale.Crop
        )//end of Circular image
        Spacer(modifier = Modifier.height(20.dp))
        Text(text ="Find your Order!!!!",
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color.Blue

            )
                Text(text="E-commerce websites act as digital storefronts, enabling businesses to reach a wider audience and conduct transactions online.")
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(Color.Blue),
            shape = RoundedCornerShape(10.dp),

            modifier = TODO(),
            enabled = TODO(),
            elevation = TODO(),
            border = TODO(),
            contentPadding = TODO(),
            interactionSource = TODO(),
            content = TODO()
        )




    }


}
@Preview(showBackground = true)
@Composable
fun StartScreenPreview(){
    StartScreen()


}