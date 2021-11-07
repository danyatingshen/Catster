# ProBeautyEyebrow

## What is this?

This is an app, created by Liam Axon, Yuanzhe Liu, and Amanda Shen.

## How is it structred?

The repo is organized into two folders: `frontend` and `backend`. Since these are separate project spaces (which rely heavily on each other), most files should be in one folder or the other.

## The Frontend

All commands in this section should be run from the `frontend` folder.

The frontend is written in Expo, which is built off of React Native, which uses React syntax but compiles to native code in iOS or Android. To run the app on a physical phone, you will need to download the [Expo App](https://expo.dev/). You can start it with the command `npm run start` and follow the instructions. To run on an android emulator, you will first need to download an android emulator, e.g. from [these instructions](https://reactnative.dev/docs/environment-setup). When an emulator is open, you can run `npm run android` to run the device on your emulator. It also works on iOS emulators on Apple devices, with the command `npm run ios`. Lastly, you can run `npm run web` to start the app in a browser (at a port shown in the console), and this should have the same functionality as the app versions. `npm run web` seems to be faster than running the app on an emulator or phone.

When pulling from GitHub, you should always run `npm install` if the `package.json` file has changed. When in doubt, just run `npm install` anyway. If you get weird errors even after running `npm install`, a good thing to try is deleting the `node_modules` folder, and then running `npm_install` again. If things stil don't work, let Liam know on Messenger, and he will try to help you.

## The Backend

TBC...
