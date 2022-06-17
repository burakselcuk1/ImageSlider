package com.example.slidertest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val imageList = ArrayList<SlideModel>() // Create image list

// imageList.add(SlideModel("String Url" or R.drawable)
// imageList.add(SlideModel("String Url" or R.drawable, "title") You can add title

        imageList.add(SlideModel(R.drawable.l, "The animal population decreased by 58 percent in 42 years.", ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel(R.drawable.l, "The animal population decreased by 58 percent in 42 years.", ScaleTypes.CENTER_CROP))
        imageList.add(SlideModel(R.drawable.l, "The animal population decreased by 58 percent in 42 years.", ScaleTypes.CENTER_CROP))

        val imageSlider = findViewById<ImageSlider>(R.id.image_slider)
        imageSlider.setImageList(imageList)


    }
}