# PermisoWrapper
- Android Runtime Permission Library
- This is actually a wrapper around a very useful Android Runtime Permission library [Permiso](https://github.com/greysonp/permiso) written by [greysonp](https://github.com/greysonp)
- This wrapper library allows user to request permission easily by calling predefined methods

####Creates an AlertDialog containing the feature and required permissions

![screenshot1](https://github.com/NoelChew/PermisoWrapper/blob/master/screenshots/screenshot_1.png)
![screenshot2](https://github.com/NoelChew/PermisoWrapper/blob/master/screenshots/screenshot_2.png)


####Displays permission request automatically

![screenshot3](https://github.com/NoelChew/PermisoWrapper/blob/master/screenshots/screenshot_3.png)


####Handles "Never ask again" permission denied scenario

![screenshot4](https://github.com/NoelChew/PermisoWrapper/blob/master/screenshots/screenshot_4.png)
![screenshot5](https://github.com/NoelChew/PermisoWrapper/blob/master/screenshots/screenshot_5.png)

####Opens App Settings if user clicks on "Settings" button in AlertDialog
![screenshot6](https://github.com/NoelChew/PermisoWrapper/blob/master/screenshots/screenshot_6.png)

## How to Use
In onCreate() of MainActivity:
```java
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Permiso.getInstance().setActivity(this);
}

@Override
protected void onResume() {
    super.onResume();
    Permiso.getInstance().setActivity(this);
}

@Override
public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
    super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    Permiso.getInstance().onRequestPermissionResult(requestCode, permissions, grantResults);
}
```

Call any predefined methods in PermisoWrapper. For instance, the getPermissionTakeVideo() method.

```java
PermisoWrapper.getPermissionTakeVideo(context, new PermisoWrapper.PermissionListener() {
                            @Override
                            public void onPermissionGranted() {
                                // TODO: create intent to record video
                            }

                            @Override
                            public void onPermissionDenied() {
                                // TODO: do something
                            }
                        });
```

## List of Predefined Methods
- getPermissionPickPictureVideo()
- getPermissionTakePicture()
- getPermissionTakeVideo()
- getPermissionVoiceMessage()
- getPermissionVoiceCall()
- getPermissionVideoCall()
- getPermissionShareLocation()
- getPermissionLocateUser()
- getPermissionAutoFillAreaCode()
- getPermissionAccessContacts()
- getPermissionRecommendNewFriends()
- getPermissionSaveMediaToStorage()
- getPermissionSaveContentToStorage()
- getPermissionAccessCalendar()
- getPermissionAccessPhoneFeatures()
- getPermissionGetPhoneNumber()
- getPermissionMakePhoneCall()
- getPermissionAccessSMS()
- getPermissionSendSMS()
- getPermissionReadSMS()
- getPermissionAccessPhoneSensors()


## Integration
This library is hosted by jitpack.io.

Root level gradle:
```
allprojects {
 repositories {
    jcenter()
    maven { url "https://jitpack.io" }
 }
}
```

Application level gradle:
```
dependencies {
    compile 'com.github.noelchew:PermisoWrapper:0.1.1'
}
```
Note: do not add the jitpack.io repository under buildscript
