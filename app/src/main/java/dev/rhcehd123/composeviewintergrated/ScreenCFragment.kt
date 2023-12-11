package dev.rhcehd123.composeviewintergrated

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.platform.ViewCompositionStrategy
import androidx.fragment.app.Fragment

class ScreenCFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return ComposeView(requireContext()).apply {
            setViewCompositionStrategy(ViewCompositionStrategy.DisposeOnViewTreeLifecycleDestroyed)
            setContent {
                ScreenC()
            }
        }
    }
}

@Composable
fun ScreenC() {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.align(Alignment.Center)
        ) {
            Text(
                text = "SCREEN C",
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
            Text(
                text = "This screen is made up of Compose",
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        }
    }
}