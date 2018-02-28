# PermissionDemo
Android动态权限申请，简单好用！包含授权成功，失败和用户点不再提醒的回调。


-keep class * extends java.lang.annotation.Annotation { *; }
-keep interface * extends java.lang.annotation.Annotation { *; }

-keep @com.shengjuntech.im.utils.permission.annotation.OnMPermissionDenied class * {*;}
-keep class * {
    @com.shengjuntech.im.utils.permission.annotation.OnMPermissionDenied <fields>;
}
-keepclassmembers class * {
    @com.shengjuntech.im.utils.permission.annotation.OnMPermissionDenied <methods>;
}

-keep @com.shengjuntech.im.utils.permission.annotation.OnMPermissionGranted class * {*;}
-keep class * {
    @com.shengjuntech.im.utils.permission.annotation.OnMPermissionGranted <fields>;
}
-keepclassmembers class * {
    @com.shengjuntech.im.utils.permission.annotation.OnMPermissionGranted <methods>;
}

-keep @com.shengjuntech.im.utils.permission.annotation.OnMPermissionNeverAskAgain class * {*;}
-keep class * {
    @com.shengjuntech.im.utils.permission.annotation.OnMPermissionNeverAskAgain <fields>;
}
-keepclassmembers class * {
    @com.shengjuntech.im.utils.permission.annotation.OnMPermissionNeverAskAgain <methods>;
}

添加混淆内容，不混淆映射。
