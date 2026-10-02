package com.example.myapplication


import androidx.compose.foundation.Image[cite: 1]
import androidx.compose.foundation.background[cite: 1]
import androidx.compose.foundation.layout.Arrangement[cite: 1]
import androidx.compose.foundation.layout.Box[cite: 1]
import androidx.compose.foundation.layout.Column[cite: 1]
import androidx.compose.foundation.layout.Row[cite: 1]
import androidx.compose.foundation.layout.Spacer[cite: 1]
import androidx.compose.foundation.layout.fillMaxHeight[cite: 1]
import androidx.compose.foundation.layout.fillMaxSize[cite: 1]
import androidx.compose.foundation.layout.fillMaxWidth[cite: 1, 2]
import androidx.compose.foundation.layout.height[cite: 1]
import androidx.compose.foundation.layout.padding[cite: 1]
import androidx.compose.material3.Text[cite: 1]
import androidx.compose.runtime.Composable[cite: 1]
import androidx.compose.ui.Alignment[cite: 1]
import androidx.compose.ui.Modifier[cite: 1]
import androidx.compose.ui.graphics.Color[cite: 1]
import androidx.compose.ui.layout.ContentScale[cite: 1]
import androidx.compose.ui.res.painterResource[cite: 1]
import androidx.compose.ui.text.font.FontFamily[cite: 1]
import androidx.compose.ui.text.font.FontWeight[cite: 1]
import androidx.compose.ui.unit.dp[cite: 1]
import androidx.compose.ui.unit.sp[cite: 1]

@Composable
fun TataletakColumn(modifier: Modifier = Modifier) {[cite: 1]
    Column(
        modifier = modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp)[cite: 1]
    ) {
        Text(text = "Komponen1")[cite: 1]
        Text(text = "Komponen2")[cite: 1]
        Text(text = "Komponen3")[cite: 1]
        Text(text = "Komponen4")[cite: 1]
    }
}

@Composable
fun TataletakRow(modifier: Modifier = Modifier) {[cite: 1]
    Row(
        modifier = modifier.fillMaxWidth(),[cite: 1]
    horizontalArrangement = Arrangement.SpaceEvenly[cite: 1]
    ) {
        Text(text = "Komponen1")[cite: 1]
        Text(text = "Komponen2")[cite: 1]
        Text(text = "Komponen3")[cite: 1]
        Text(text = "Komponen4")[cite: 1]
    }
}

@Composable
fun TataletakBox(modifier: Modifier = Modifier) {[cite: 1]
    Box(
        modifier = modifier
            .fillMaxHeight()[cite: 1]
    .fillMaxWidth(),[cite: 1]
    contentAlignment = Alignment.Center[cite: 1]
    ) {
        Text(text = "Box 1")[cite: 1]
        Text(text = "Column 1")[cite: 1]
        Text(text = "Row 1")[cite: 1]
    }
}

@Composable
fun TataletakColumnBaris(modifier: Modifier = Modifier) {[cite: 2]
    Column(modifier = modifier) {
        // Baris1[cite: 1, 2]
        Row(
            modifier = Modifier.fillMaxWidth(),[cite: 1, 2]
        horizontalArrangement = Arrangement.SpaceEvenly[cite: 1, 2]
        ) {
        Text(text = "Komponen1Baris1")[cite: 2]
        Text(text = "Komponen2Baris1")[cite: 2]
        Text(text = "Komponen3Baris1")[cite: 2]
    }
        // Baris2[cite: 2]
        Row(
            modifier = Modifier.fillMaxWidth(),[cite: 2]
        horizontalArrangement = Arrangement.SpaceEvenly[cite: 2]
        ) {
        Text(text = "Komponen1Baris2")[cite: 2]
        Text(text = "Komponen2Baris2")[cite: 2]
        Text(text = "Komponen3Baris2")[cite: 2]
    }
    }
}

@Composable
fun TataletakRowColumn(modifier: Modifier = Modifier) {[cite: 2]
    Row(
        modifier = modifier.fillMaxWidth(),[cite: 2]
    horizontalArrangement = Arrangement.SpaceEvenly[cite: 2]
    ) {
        Column {
            Text(text = "Komponen1Kolom1")[cite: 2]
            Text(text = "Komponen2Kolom1")[cite: 2]
            Text(text = "Komponen3Kolom1")[cite: 2]
        }
        Column {
            Text(text = "Komponen1Kolom2")[cite: 2]
            Text(text = "Komponen2Kolom2")[cite: 2]
            Text(text = "Komponen3Kolom2")[cite: 2]
        }
    }
}

@Composable
fun TataletakBoxColumnRow(modifier: Modifier = Modifier) {[cite: 2, 3]
    val gambar = painterResource(id = R.drawable.notasinaton) // Sesuaikan dengan nama drawable Anda[cite: 2]

    Column(modifier = modifier) {[cite: 2, 3]
        Box(
            modifier = Modifier
                .fillMaxWidth()[cite: 3]
        .height(110.dp)[cite: 2]
        .background(color = Color.Yellow),[cite: 2]
        contentAlignment = Alignment.Center[cite: 2]
        ) {
            Column {[cite: 2, 3]
                Row(
                    modifier = Modifier.fillMaxWidth(),[cite: 2, 3]
                horizontalArrangement = Arrangement.SpaceEvenly[cite: 2, 3]
                ) {
                    Text(text = "Col1 Row1 Komponen1")[cite: 2, 3]
                    Text(text = "Col1 Row1 Komponen2")[cite: 2, 3]
                    Text(text = "Col1 Row1 Komponen3")[cite: 2, 3]
                }
                Row(
                    modifier = Modifier.fillMaxWidth(),[cite: 3]
                horizontalArrangement = Arrangement.SpaceEvenly[cite: 3]
                ) {
                    Text(text = "Col1 Row2 Komponen1")[cite: 3]
                    Text(text = "Col1 Row2 Komponen2")[cite: 3]
                    Text(text = "Col1 Row2 Komponen3")[cite: 3]
                }
            }
        }

        Spacer(modifier = Modifier.height(10.dp))[cite: 3]

        Box(
            modifier = Modifier
                .fillMaxWidth()[cite: 3]
        .height(300.dp)[cite: 3]
        .background(color = Color.Cyan),[cite: 3]
        contentAlignment = Alignment.Center[cite: 3]
        ) {
            Image(
                painter = gambar,[cite: 3]
            contentDescription = null,[cite: 3]
            contentScale = ContentScale.Fit[cite: 3]
            )
            Text(
                text = "My",[cite: 3]
            fontSize = 50.sp,[cite: 3]
            color = Color.Red,[cite: 3]
            fontWeight = FontWeight.Bold,[cite: 3]
            fontFamily = FontFamily.Cursive,[cite: 3]
            modifier = Modifier.align(Alignment.Center)[cite: 3]
            )
        }
    }
}