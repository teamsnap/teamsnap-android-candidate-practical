# Welcome to the TeamSnap Android Candidate Practical! 

Your task is to implement `TeamListActivity` using MVVM + Jetpack Compose. We've provided some classes that you are free to utilize as needed, 
but much of the implementation is up to you. You will find `TODO`s throughout the codebase to help guide you along. We expect you
to spend somewhere around 2-4 hours on this.

As mentioned above, we've provided some classes in the `data` module to help you get started. Among them are:
* `CJCollection.kt` - Data models conforming to the Collection+JSON spec (https://github.com/collection-json/spec). The data you'll
be fetching uses this structure.
* `TeamSnapApi.kt` - Retrofit client interface with function to fetch teams
* `TeamSnapClient.kt` - Holds an instance of the `TeamSnapApi` Retrofit interface

Beyond that, the world is your oyster! Feel free to structure your code however you like, but keep in mind that code readability and
maintainability are important. You're welcome to use any open source libraries to assist in development. We don't care so much 
about the "attractiveness" of the UI, as long as the data is displaying correctly. As for what data to display, that's also up to you, but
things like team name, location, and member count are probably a good idea.

### Some key things we're looking for
* Understanding of MVVM and ability to utilize `ViewModel` and `LiveData` effectively
* Ability to work with Jetpack Compose
* Ability to fetch a list of teams from a remote endpoint and parse the Collection+JSON response
* Ability to cache fetched data and utilize said cache effectively
* Ability to work with coroutines 

Good luck! Please reach out to us if you have any issues or questions.