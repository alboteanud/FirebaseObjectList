
Firebase Object list with POJO
===================================

Firebase Object list with POJO with createdOn property Sample
Notice that the "Note" POJO has an "created" public Object initialised by the ServerValue.TIMESTAMP
and a public method like:

    public Long getCreatedTimestamp() {
            if (created instanceof Long) {
                return (Long) created;
            }
            else {
                return null;
            }
        }


Screenshots
-------------

<img src="screenshots/phone.png" height="400" alt="Screenshot"/>

Getting Started
---------------

This sample uses the Gradle build system. To build this project, use the
"gradlew build" command or use "Import Project" in Android Studio.

Support
-------

- Google+ Community: https://plus.google.com/communities/105153134372062985968
- Stack Overflow: http://stackoverflow.com/questions/tagged/android

