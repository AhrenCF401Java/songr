# Songr

## by Ahren Swett

### What is Songer
 songer is used to store albums in a database giving them persistance. 
 
 ### How do I run songer?
 in the commandline  run the command
 *     ./gradlew bootrun
 
 ## Incorperated routes
 * This route requires a path variable and will display that word in caps on the page when loaded
    * @GetMapping("/hello/{word}")
 * This is the main Albums Route you can add album details here
    * @GetMapping("/a")
 * This is the route for displaying single album details
    * @GetMapping("/albums/{id}")
 * This is the rout to see all songs
    * @GetMapping("/songs")
 * This is the rout the add album button takes to submit a new album it then routes to album details  
    * @PostMapping("/albums")
 * This is the route that songs posts to 
    * @PostMapping("/albums/{id}")




 
 
