enum class Daypart3 {
    MORNING,
    AFTERNOON,
    EVENING,
}




data class Event4(
    val title: String,
    val description: String? = null,
    val daypart: Daypart3,
    val durationInMinutes: Int,
)

fun main(){
    val event1 = Event4(title = "Wake up", description = "Time to get up", daypart = Daypart3.MORNING, durationInMinutes = 0)
    val event2 = Event4(title = "Eat breakfast", daypart = Daypart3.MORNING, durationInMinutes = 15)
    val event3 = Event4(title = "Learn about Kotlin", daypart = Daypart3.AFTERNOON, durationInMinutes = 30)
    val event4 = Event4(title = "Practice Compose", daypart = Daypart3.AFTERNOON, durationInMinutes = 60)
    val event5 = Event4(title = "Watch latest DevBytes video", daypart = Daypart3.AFTERNOON, durationInMinutes = 10)
    val event6 = Event4(title = "Check out latest Android Jetpack library", daypart = Daypart3.EVENING, durationInMinutes = 45)
    val events = mutableListOf<Event4>(event1, event2, event3, event4, event5, event6)

    val shortEvents = events.filter { it.durationInMinutes < 60 }
    println("You have ${shortEvents.size} short events.")


}