package com.bondi.harakamall.ui.screens.item

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.bondi.harakamall.R
import com.bondi.harakamall.navigation.ROUT_INTENT
import com.bondi.harakamall.ui.theme.neworange
import com.bondi.harakamall.ui.theme.newwhite

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ItemScreen(navController: NavController){
    Column (modifier = Modifier.fillMaxSize(

    )

    ){
        //TopAppBar
        TopAppBar(
            title = {Text(text = "Products")},
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = neworange,
                titleContentColor = newwhite,
                navigationIconContentColor = newwhite,
                actionIconContentColor = newwhite
            ),
            navigationIcon = {
                IconButton(onClick = {
                    navController.navigate(ROUT_INTENT)
                }) {
                    Icon(imageVector = Icons.Default.Menu, contentDescription = "menu")
                }
            },
            actions = {
                Icon(imageVector = Icons.Default.ShoppingCart, contentDescription = "shoppingcart")
                Icon(imageVector = Icons.Default.Notifications, contentDescription = "notifications")
                Icon(imageVector = Icons.Default.ArrowForward, contentDescription = "shoppingcart")

            }
        )
        //End of TopAppBar
      Column(modifier = Modifier.verticalScroll(rememberScrollState())){
          Image(
              painter = painterResource(R.drawable.furniture2),
              contentDescription = "home",
              modifier = Modifier.fillMaxWidth().height(200.dp),
              contentScale = ContentScale.FillWidth,

              )
          Spacer(modifier = Modifier.height(20.dp))


          //SearchBar
          var search by remember { mutableStateOf("") }
          OutlinedTextField(
              value = search,
              onValueChange = {search = it},
              modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
              leadingIcon = { Icon(imageVector =Icons.Default.Search, contentDescription = "")},
              placeholder = { Text(text = "search...")}
          )
          //End of SearchBar
          Spacer(modifier = Modifier.height(10.dp))

          //Start of Row

          Row (){
              Image(
                  painter = painterResource(R.drawable.tool2),
                  contentDescription = "home",
                  modifier = Modifier.width(200.dp).height(200.dp).clip(shape = RoundedCornerShape(10.dp)),
                  contentScale = ContentScale.FillWidth,
              )

              Spacer(modifier = Modifier.width(10.dp))


              Column {
                  Text(
                      text = "Men's shirt",
                      fontSize = 20.sp,
                      fontWeight = FontWeight.ExtraBold,



                      )


                  Text(text = "Casual Wear",
                      fontSize = 20.sp,
                  )

                  Text(text = "Ksh 200",
                      fontSize = 20.sp,
                      textDecoration = TextDecoration.LineThrough
                  )

                  Row {
                      Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)
                      Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)
                      Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)
                      Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)
                      Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newwhite)
                  }
                  Button(onClick = {},
                      colors = ButtonDefaults.buttonColors(Color.Blue),

                      shape = RoundedCornerShape(10.dp),
                      modifier = Modifier.fillMaxWidth().padding(start = 20.dp),
                  ) {Text(text = "Contact us") }



              }
          }
          //End of Row

          Spacer(modifier = Modifier.height(10.dp))

          //Start of Row

          Row (){
              Image(
                  painter = painterResource(R.drawable.furniture8),
                  contentDescription = "home",
                  modifier = Modifier.width(200.dp).height(200.dp).clip(shape = RoundedCornerShape(10.dp)),
                  contentScale = ContentScale.FillWidth,
              )

              Spacer(modifier = Modifier.width(10.dp))


              Column {
                  Text(
                      text = "Men's shirt",
                      fontSize = 20.sp,
                      fontWeight = FontWeight.ExtraBold,



                      )


                  Text(text = "Casual Wear",
                      fontSize = 20.sp,
                  )

                  Text(text = "Ksh 200",
                      fontSize = 20.sp,
                      textDecoration = TextDecoration.LineThrough
                  )

                  Row {
                      Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)
                      Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)
                      Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)
                      Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)
                      Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newwhite)
                  }
                  Button(onClick = {},
                      colors = ButtonDefaults.buttonColors(Color.Blue),

                      shape = RoundedCornerShape(10.dp),
                      modifier = Modifier.fillMaxWidth().padding(start = 20.dp),
                  ) {Text(text = "Contact us") }



              }
          }
          //End of Row

          Spacer(modifier = Modifier.height(10.dp))

          //Start of Row

          Row (){
              Image(
                  painter = painterResource(R.drawable.furniture7),
                  contentDescription = "home",
                  modifier = Modifier.width(200.dp).height(200.dp).clip(shape = RoundedCornerShape(10.dp)),
                  contentScale = ContentScale.FillWidth,
              )

              Spacer(modifier = Modifier.width(10.dp))


              Column {
                  Text(
                      text = "Men's shirt",
                      fontSize = 20.sp,
                      fontWeight = FontWeight.ExtraBold,



                      )


                  Text(text = "Casual Wear",
                      fontSize = 20.sp,
                  )

                  Text(text = "Ksh 200",
                      fontSize = 20.sp,
                      textDecoration = TextDecoration.LineThrough
                  )

                  Row {
                      Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)
                      Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)
                      Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)
                      Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)
                      Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newwhite)
                  }
                  Button(onClick = {},
                      colors = ButtonDefaults.buttonColors(Color.Blue),

                      shape = RoundedCornerShape(10.dp),
                      modifier = Modifier.fillMaxWidth().padding(start = 20.dp),
                  ) {Text(text = "Contact us") }



              }
          }
          //End of Row
          Spacer(modifier = Modifier.height(10.dp))

          //Start of Row

          Row (){
              Image(
                  painter = painterResource(R.drawable.furniture7),
                  contentDescription = "home",
                  modifier = Modifier.width(200.dp).height(200.dp).clip(shape = RoundedCornerShape(10.dp)),
                  contentScale = ContentScale.FillWidth,
              )

              Spacer(modifier = Modifier.width(10.dp))


              Column {
                  Text(
                      text = "Men's shirt",
                      fontSize = 20.sp,
                      fontWeight = FontWeight.ExtraBold,



                      )


                  Text(text = "Casual Wear",
                      fontSize = 20.sp,
                  )

                  Text(text = "Ksh 200",
                      fontSize = 20.sp,
                      textDecoration = TextDecoration.LineThrough
                  )

                  Row {
                      Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)
                      Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)
                      Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)
                      Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = neworange)
                      Icon(imageVector = Icons.Default.Star, contentDescription = "", tint = newwhite)
                  }
                  Button(onClick = {},
                      colors = ButtonDefaults.buttonColors(Color.Blue),

                      shape = RoundedCornerShape(10.dp),
                      modifier = Modifier.fillMaxWidth().padding(start = 20.dp),
                  ) {Text(text = "Contact us") }



              }
          }
          //End of Row
      }







    }


}
@Preview(showBackground = true)
@Composable
fun ItemScreenPreview(){
    ItemScreen(rememberNavController())


}