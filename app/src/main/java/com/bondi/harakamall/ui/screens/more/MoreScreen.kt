package com.bondi.harakamall.ui.screens.more

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.bondi.harakamall.R
import com.bondi.harakamall.navigation.ROUT_INTENT
import com.bondi.harakamall.ui.screens.item.ItemScreen
import com.bondi.harakamall.ui.theme.neworange
import com.bondi.harakamall.ui.theme.newwhite
import java.nio.file.WatchEvent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MoreScreen(navController: NavController){
    Column (modifier = Modifier.fillMaxSize()){
        val mContext = LocalContext.current

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
        Spacer(modifier = Modifier.height(20.dp))
        //SearchBar
        var search by remember { mutableStateOf("") }
        OutlinedTextField(
            value = search,
            onValueChange = {search = it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector =Icons.Default.Search, contentDescription = "")},
            placeholder = { Text(text = "search more products")}
        )
        //End of SearchBar
        Spacer(modifier = Modifier.height(20.dp))
        //box
        Box(modifier = Modifier.fillMaxWidth().height(200.dp),
            contentAlignment = Alignment.Center
            )

        {
            Image(
                painter = painterResource(R.drawable.img_1),
                contentDescription = "more",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillWidth,
            )
            Icon(
                imageVector = Icons.Default.Favorite,
                contentDescription = "",
                tint = neworange,
                modifier = Modifier.align (alignment = Alignment.TopEnd).padding(10.dp)

            )
            Text(
                text = "find the best products",

                color = newwhite,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )
        }



        //end of box
        Spacer(modifier = Modifier.height(20.dp))


        //row
        Row(modifier =Modifier.padding(start = 20.dp).horizontalScroll(state = rememberScrollState()))
        {
            Column (horizontalAlignment = Alignment.CenterHorizontally){
                Image(
                    painter = painterResource(R.drawable.furniture3),
                    contentDescription = "home",
                    modifier = Modifier.size(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillBounds

                    )

                Text(
                    text = "Mercedes",
                    fontSize = 15.sp
                )

                Text(
                    text = "ksh.20045",
                    fontSize = 15.sp
                )

                Button(
                        onClick = {
                            val simToolKitLaunchIntent =
                                mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                            simToolKitLaunchIntent?.let { mContext.startActivity(it) }

                        },
                    colors = ButtonDefaults.buttonColors(Color.Blue),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier.fillMaxWidth().padding(start = 20.dp),
                ){
                    Text(text = "Pay")
                }
            }
//end of column
            Spacer(modifier = Modifier.width(20.dp))
            Column (horizontalAlignment = Alignment.CenterHorizontally){
                Image(
                    painter = painterResource(R.drawable.furniture3),
                    contentDescription = "home",
                    modifier = Modifier.size(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillBounds

                )

                Text(
                    text = "Mercedes",
                    fontSize = 15.sp
                )

                Text(
                    text = "ksh.20045",
                    fontSize = 15.sp
                )

                Button(
                    onClick = {
                        val simToolKitLaunchIntent =
                            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                        simToolKitLaunchIntent?.let { mContext.startActivity(it) }

                    },
                    colors = ButtonDefaults.buttonColors(Color.Blue),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier.fillMaxWidth().padding(start = 20.dp),
                ){
                    Text(text = "Pay")
                }
            }
//end of column
            Spacer(modifier = Modifier.height(20.dp))

            Column (horizontalAlignment = Alignment.CenterHorizontally){
                Image(
                    painter = painterResource(R.drawable.furniture3),
                    contentDescription = "home",
                    modifier = Modifier.size(150.dp).clip(shape = RoundedCornerShape(10.dp)),
                    contentScale = ContentScale.FillBounds

                )

                Text(
                    text = "Mercedes",
                    fontSize = 15.sp
                )

                Text(
                    text = "ksh.20045",
                    fontSize = 15.sp
                )

                Button(
                    onClick = {
                        val simToolKitLaunchIntent =
                            mContext.packageManager.getLaunchIntentForPackage("com.android.stk")
                        simToolKitLaunchIntent?.let { mContext.startActivity(it) }

                    },
                    colors = ButtonDefaults.buttonColors(Color.Blue),
                    shape = RoundedCornerShape(10.dp),
                    modifier = Modifier.fillMaxWidth().padding(start = 20.dp),
                ){
                    Text(text = "Pay")
                }
            }
//end of column


        }
        //end of row





















    }

}
@Preview(showBackground = true)
@Composable
fun MOreScreenPreview(){
    MoreScreen(rememberNavController())


}