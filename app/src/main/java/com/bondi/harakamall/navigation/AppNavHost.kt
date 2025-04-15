package com.bondi.harakamall.navigation


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.bondi.harakamall.data.UserDatabase
import com.bondi.harakamall.repository.UserRepository
import com.bondi.harakamall.ui.screens.about.AboutScreen
import com.bondi.harakamall.ui.screens.auth.LoginScreen
import com.bondi.harakamall.ui.screens.auth.RegisterScreen
import com.bondi.harakamall.ui.screens.dashboard.DashboardScreen
 import com.bondi.harakamall.ui.screens.home.HomeScreen
import com.bondi.harakamall.ui.screens.intent.IntentScreen
import com.bondi.harakamall.ui.screens.item.ItemScreen
import com.bondi.harakamall.ui.screens.more.MoreScreen
import com.bondi.harakamall.ui.screens.service.ServiceScreen
import com.bondi.harakamall.ui.screens.start.StartScreen
import com.bondi.harakamall.ui.theme.screens.form.FormScreen
import com.bondi.harakamall.viewmodel.AuthViewModel

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_LOGIN
) {
    val context = LocalContext.current

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_ITEM) {
            ItemScreen(navController)
        }
        composable(ROUT_START) {
            StartScreen(navController)
        }
        composable(ROUT_INTENT) {
            IntentScreen(navController)
        }
        composable(ROUT_MORE) {
            MoreScreen(navController)
        }
        composable(ROUT_DASHBOARD) {
            DashboardScreen(navController)
        }
        composable(ROUT_SERVICE) {
            ServiceScreen(navController)
        }
        composable(ROUT_FORM) {
            FormScreen(navController)
        }
        //AUTHENTICATION

        // Initialize Room Database and Repository for Authentication
        val appDatabase = UserDatabase.getDatabase(context)
        val authRepository = UserRepository(appDatabase.userDao())
        val authViewModel: AuthViewModel = AuthViewModel(authRepository)
        composable(ROUT_REGISTER) {
            RegisterScreen(authViewModel, navController) {
                navController.navigate(ROUT_LOGIN) {
                    popUpTo(ROUT_REGISTER) { inclusive = true }
                }
            }
        }

        composable(ROUT_LOGIN) {
            LoginScreen(authViewModel, navController) {
                navController.navigate(ROUT_HOME) {
                    popUpTo(ROUT_LOGIN) { inclusive = true }
                }
            }
        }




    }
}










