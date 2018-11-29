package com.ayanamirzhana.mypet

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import kotlinx.android.synthetic.main.activity_storage.*
import java.io.IOException

class StorageActivity : AppCompatActivity() {

    var imgCode = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_storage)
        photoButton.setOnClickListener {
            onSelectPhotoButtonClick()
        }
    }
    fun onSelectPhotoButtonClick() {
        val photoPickerIntent = Intent(Intent.ACTION_PICK)
        photoPickerIntent.setType("image/*")
        startActivityForResult(photoPickerIntent, imgCode)
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == imgCode) {
            if (resultCode == Activity.RESULT_OK) {
                if (data != null) {

                    var uri = data.data
                    var bitmap: Bitmap

                    try {
                        bitmap = MediaStore.Images.Media.getBitmap(this.contentResolver, uri)
                    } catch (e: IOException) {
                        e.printStackTrace()
                    }
                }
            }
        }
    }
}
