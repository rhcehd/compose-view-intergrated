package dev.rhcehd123.composeviewintergrated

import android.os.Bundle
import android.view.View
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment

class ScreenBFragment: Fragment(R.layout.fragment_screen_b) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val composeView = view.findViewById<ComposeView>(R.id.compose_view)
        composeView.setContent {
            PartCompose()
        }
    }
}

@Composable
fun PartCompose() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0x110000FF)),
    ) {
        Text(
            text = "this part is made up of Compose",
            modifier = Modifier.align(Alignment.Center)
        )
    }
}