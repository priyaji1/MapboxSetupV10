
# MapboxSetupV10

Mapbox SDK V10 Android Setup. 
This README is for developers who are interested in Mapbox Maps SDK for Android. 
# Get started:
The Mapbox Maps SDK for Android is a library based on Mapbox GL Native for map views, onto Android devices.
# What is Mapbox:
* Mapbox is a location data platform that powers the maps and location services used in many popular apps.
* Mapbox creates building blocks for mobile developers to add beautiful maps and location services to their mobile applications. mapbox use for creating beutiful map.
This source code contains mapbox android setup.
# Getting the source:
Clone the git repository and pull:
git clone https://github.com/priyaji1/MapboxSetupV10.git

# Project configuration
* Setup Mapbox Access token for dependency download.

* Add a  Mapbox download token in gradle.properties.





## Deployment


```bash
allprojects {
    repositories {
        maven {
            url 'https://api.mapbox.com/downloads/v2/releases/maven'
            authentication {
                basic(BasicAuthentication)
            }
            credentials {
                username = "mapbox"
                password = "INSERT_MAPBOX_ACCESS_TOKEN_HERE"
            }
        }
    }
}

```


You can get  secret download token and access token by signup here.

[click here](https://account.mapbox.com/auth/signup/)

![1659504308509](https://user-images.githubusercontent.com/42647333/182530845-06e556c2-0184-4740-8c7c-c81c1778c39b.JPEG)

