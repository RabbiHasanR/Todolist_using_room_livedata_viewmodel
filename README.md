# Project Title
Todolist_using_room_livedata_viewmodel
# Description
Here create simple todolist using room database also use livedata with room and viewmodel
# Usages
### Build gradle
````
allprojects {
    repositories {
        maven{
            url "https://maven.google.com"
        }
        jcenter()
        google()
    }
}
````
### Dependencies 
````
  dependencies {
        //add Recycler view dependencies; must match SDK version
    implementation 'com.android.support:recyclerview-v7:27.1.1'

    //FAB dependencies
    implementation 'com.android.support:design:27.1.1'

    implementation "android.arch.persistence.room:runtime:1.0.0"
    annotationProcessor "android.arch.persistence.room:compiler:1.0.0"

    implementation "android.arch.lifecycle:extensions:1.1.0"
    annotationProcessor "android.arch.lifecycle:compiler:1.1.0"
    }
````
