package com.vaca.copytoclipboardandroid

import android.content.ClipData
import android.content.ClipboardManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        copyStr("fuck")
    }
    private fun copyStr(copyStr: String): Boolean {
        return try {
            //获取剪贴板管理器
            val cm: ClipboardManager = getSystemService(CLIPBOARD_SERVICE) as ClipboardManager
            // 创建普通字符型ClipData
            val mClipData = ClipData.newPlainText("Label", copyStr)
            // 将ClipData内容放到系统剪贴板里。
            cm.setPrimaryClip(mClipData)
            true
        } catch (e: Exception) {
            false
        }
    }

}