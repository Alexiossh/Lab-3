package com.raywenderlich.android.lab1.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import com.raywenderlich.android.lab1.router.BackButtonHandler
import com.raywenderlich.android.lab1.router.FundamentalsRouter
import com.raywenderlich.android.lab1.router.Screen
import java.lang.reflect.Modifier

@Composable
fun SurfaceScreen(modifier: Modifier){
    Box(modifier = modifier.fillMaxSize()){
        MySurface(modifier=modifier.align(Alignment.Center))
    }

    BackButtonHandler {
        FundamentalsRouter.navigateTo(Screen.Navigation)
    }
}

private fun Any.fillMaxSize(): androidx.compose.ui.Modifier {
    TODO("Not yet implemented")
}

private fun Any.align(center: Any): Modifier {
    TODO("Not yet implemented")
}

@Composable
fun MySurface(modifier: Modifier){

}