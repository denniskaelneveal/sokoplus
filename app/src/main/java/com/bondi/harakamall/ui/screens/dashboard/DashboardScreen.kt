package com.bondi.harakamall.ui.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.bondi.harakamall.R
import com.bondi.harakamall.navigation.ROUT_DASHBOARD
import com.bondi.harakamall.navigation.ROUT_HOME
import com.bondi.harakamall.navigation.ROUT_INTENT
import com.bondi.harakamall.navigation.ROUT_ITEM
import com.bondi.harakamall.navigation.ROUT_MORE
import com.bondi.harakamall.ui.theme.neworange
import com.bondi.harakamall.ui.theme.newwhite

@Composable
fun DashboardScreen(navController: NavController){
    Column(modifier = Modifier.fillMaxSize()) {
        //card
        Card(
            modifier = Modifier.fillMaxWidth().height(300.dp),
            shape = RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp),
            colors = CardDefaults.cardColors(neworange)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(R.drawable.furniture3),
                    contentDescription = "home",
                    modifier = Modifier.size(150.dp)
                )
                Text(
                    text = "sokomart",
                    fontSize = 40.sp,
                    color = newwhite,
                    fontFamily = FontFamily.Cursive,
                    fontWeight = FontWeight.ExtraBold
                )



            }


        }

        //End of card
        Spacer(modifier = Modifier.height(40.dp))

        //Row1
        Row (modifier = Modifier.padding(start = 20.dp)
        ){

            //Card1
            Card (
                modifier = Modifier.width(150.dp).height(180.dp).clickable {
                    navController.navigate(ROUT_HOME)
                },
                colors = CardDefaults.cardColors(neworange)

            ){

                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.home1),
                        contentDescription = "blouse",
                        modifier = Modifier.size(100.dp),
                    )

                    Text(text = "Home", fontSize = 15.sp)

                }

            }
            //end of card1

            Spacer(modifier = Modifier.width(20.dp))

            //Card2
            Card (
                modifier = Modifier.width(150.dp).height(180.dp).clickable{navController.navigate(ROUT_INTENT)},
                colors = CardDefaults.cardColors(neworange)
            ){

                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.about),
                        contentDescription = "blouse",
                        modifier = Modifier.size(100.dp),
                    )

                    Text(text = "About", fontSize = 15.sp)

                }

            }
            //end of card2

        }

        //End Of Row1


        Spacer(modifier = Modifier.height(30.dp))

        //Row2
        Row (modifier = Modifier.padding(start = 20.dp)
        ){

            //Card1
            Card (
                modifier = Modifier.width(150.dp).height(180.dp).clickable{navController.navigate(
                    ROUT_DASHBOARD
                )},
                colors = CardDefaults.cardColors(neworange)
            ){

                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.contact1),
                        contentDescription = "blouse",
                        modifier = Modifier.size(100.dp),
                    )

                    Text(text = "Contact", fontSize = 15.sp)

                }

            }
            //end of card1

            Spacer(modifier = Modifier.width(20.dp))

            //Card2
            Card (
                modifier = Modifier.width(150.dp).height(180.dp).clickable{navController.navigate(
                    ROUT_MORE
                )},
                colors = CardDefaults.cardColors(neworange)
            ){

                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.product),
                        contentDescription = "blouse",
                        modifier = Modifier.size(100.dp),
                    )

                    Text(text = "Products", fontSize = 15.sp)

                }

            }
            //end of card2

        }

        //End Of Row2





    }


}




@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview(){
    DashboardScreen(navController = rememberNavController())


}