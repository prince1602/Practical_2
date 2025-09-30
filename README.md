# Practical-2: Activity Lifecycle & Basic UI Demonstration

## Project Overview:

This Android application showcases the Activity Lifecycle and a basic UI. The main screen displays a "Hello World" `TextView` centered on the screen, with custom styling, along with Log messages, Toasts, and Snackbars for each lifecycle method.

### Features & Requirements

+ **Activity Lifecycle**: All lifecycle callbacks (`onCreate`, `onStart`, `onResume`, `onPause`, `onStop`, `onDestroy`, etc.) should:
  + Display a Toast
+ **UI Design:**
  + Background color: Yellow (android:background="#FFFF00")
  + TextView in the center displaying “Hello World”
  + TextView attributes:
      + Text color: Holo Blue Bright (@android:color/holo_blue_bright)
      + Font size: 27sp
      + Text style: Bold & Italic (bold|italic)
+ **Layout:** Use ConstraintLayout; generate an ID for the TextView

### Setup Instructions
1. Clone or download this project.
2. Open it in Android Studio.
3. Run the app on an emulator or physical device.
4. Observe:
   - The styled "Hello World" `TextView`
   - Lifecycle callbacks in Logcat
   - Toast messages as each lifecycle method is triggered
### Usage
+ Launch the app.
+ Perform actions such as:
  - Launching the activity
  - Pressing Home or switching apps
  - Returning to the app
+ Watch for:
  - Logcat entries for each lifecycle method
  - Toasts and Snackbars displaying lifecycle events
    (E.g.: "onPause called" appears via both a Toast and a Snackbar)
