# JLog4Android

Android LogCat 工具类，特色功能：

- 支持在Android Studio的Logcat窗口中，点击log，直接跳转到其在源代码中所在的位置
- 支持在Log输出中，默认显示文件名, log所在的方法名及具体行号
- 支持无Tag快捷打印
- 支持直接打印一个HashMap对象
- 支持直接打印一个ArrayList对象
- 通过导入一个java文件即使用这个工具类

---

##Features

- use JLog.i() with no tag, default tag is "ahking"
- Print log info with file name, method name and line number
- Jump to the position where the log is invoked, just by click in the Android Studio Logcat window.
- Support output HashMap object and ArrayList object easily.

##Sample Usage

![](https://github.com/AandK/JLog4Android/blob/master/jlog_demo.gif)


##License

```
Copyright 2017 WangXin

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

