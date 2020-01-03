
# react-native-platform-ui
[![npm version](https://badge.fury.io/js/react-native-platform-ui.svg)](https://badge.fury.io/js/react-native-platform-ui)
[![NPM](https://nodei.co/npm/react-native-platform-ui.png)](https://nodei.co/npm/react-native-platform-ui/)

## Getting started

`$ npm install react-native-platform-ui --save`

### Mostly automatic installation

`$ react-native link react-native-platform-ui`

### Manual installation


#### iOS

1. In XCode, in the project navigator, right click `Libraries` ➜ `Add Files to [your project's name]`
2. Go to `node_modules` ➜ `react-native-platform-ui` and add `ENativePlatformUi.xcodeproj`
3. In XCode, in the project navigator, select your project. Add `ENativPlatformUi.a` to your project's `Build Phases` ➜ `Link Binary With Libraries`
4. Run your project (`Cmd+R`)<

#### Android

1. Open up `android/app/src/main/java/[...]/MainActivity.java`
  - Add `import com.yogi.reactlibrary.ENativPlatformUiPackage;` to the imports at the top of the file
  - Add `new ENativPlatformUiPackage()` to the list returned by the `getPackages()` method
2. Append the following lines to `android/settings.gradle`:
  	```
  	include ':react-native-platform-ui'
  	project(':react-native-platform-ui').projectDir = new File(rootProject.projectDir, 	'../node_modules/react-native-platform-ui/android')
  	```
3. Insert the following lines inside the dependencies block in `android/app/build.gradle`:
  	```
      compile project(':react-native-platform-ui')
  	```


## Usage
```javascript
import ENativePlatformUi from 'react-native-platform-ui';

// TODO: What to do with the module?
ENativePlatformUi;
```
  
