**Toast Activity**

This package contains an Android application showcasing various types of toast messages using different libraries.

### Contents:

- `MainActivity.kt`: This Kotlin file comprises the main activity of the application. It demonstrates the usage of standard toast messages, FancyToast, and MotionToast.
  
### Usage:

To use this package, follow these steps:

1. Incorporate the `ToastActivity` package into your Android project.
2. Import the necessary classes in your activity or fragment.
3. Initialize and use the standard Toast class for simple toast messages.
4. Utilize FancyToast for customizable toast messages with various styles and icons.
5. Implement MotionToast for animated and styled toast messages.

### Example:

```kotlin
// Displaying a standard toast message
Toast.makeText(this, "Simple Toast Message", Toast.LENGTH_SHORT).show()

// Displaying FancyToast with different styles
FancyToast.makeText(this, "Fancy Toast Message", FancyToast.LENGTH_SHORT, FancyToast.SUCCESS, true).show()

// Displaying MotionToast with animations and styles
MotionToast.createToast(this, "Motion Toast Message", "Successfully!", MotionToastStyle.SUCCESS, MotionToast.GRAVITY_BOTTOM, MotionToast.SHORT_DURATION, font)
```

### Notes:

- Customize the toast messages according to your application's requirements by adjusting parameters such as duration, style, and content.
- Ensure that the required dependencies for FancyToast and MotionToast are added to your project.

### Dependencies:

This package relies on the following external libraries:

- `com.shashank.sony:fancytoastlib`: Used for displaying customizable toast messages with various styles.
- `www.sanju.motiontoast:motiontoast`: Utilized for animated and styled toast messages.

### Credits:

- `com.shashank.sony:fancytoastlib`: FancyToast library by Shashank.
- `www.sanju.motiontoast:motiontoast`: MotionToast library by Sanju.

### Author:

This package was created by `DEVANSH SATI` for educational and demonstration purposes.

### License:

This code is provided under the MIT License. See the LICENSE file for details.
