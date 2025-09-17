package com.example.screentextextractor

import android.content.ClipData
import android.content.ClipboardManager
import android.content.Context

object ClipboardManagerCompat {
    fun copyText(context: Context, text: String) {
        val clipboard = context.getSystemService(Context.CLIPBOARD_SERVICE) as ClipboardManager
        val clip = ClipData.newPlainText("OCR Text", text)
        clipboard.setPrimaryClip(clip)
    }
}
