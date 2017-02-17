Android's Idea-Logger app by Kyle Helle.

Note: to compile and run locally, you may get the following error on startup:
"Could not get BatchedBridge, make sure your package is bundled correctly".

To fix this, run the following commands in your project's root directory:

1) react-native start

2) adb reverse tcp:8081 tcp:8081
