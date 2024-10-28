enum class Daypart2 {
    MORNING,
    AFTERNOON,
    EVENING,
}




data class Event3(
    val title: String,
    val description: String? = null,
    val daypart: Daypart2,
    val durationInMinutes: Int,
)

fun main(){
    val event1 = Event3(title = "Wake up", description = "Time to get up", daypart = Daypart2.MORNING, durationInMinutes = 0)
    val event2 = Event3(title = "Eat breakfast", daypart = Daypart2.MORNING, durationInMinutes = 15)
    val event3 = Event3(title = "Learn about Kotlin", daypart = Daypart2.AFTERNOON, durationInMinutes = 30)
    val event4 = Event3(title = "Practice Compose", daypart = Daypart2.AFTERNOON, durationInMinutes = 60)
    val event5 = Event3(title = "Watch latest DevBytes video", daypart = Daypart2.AFTERNOON, durationInMinutes = 10)
    val event6 = Event3(title = "Check out latest Android Jetpack library", daypart = Daypart2.EVENING, durationInMinutes = 45)
    val events = mutableListOf<Event3>(event1, event2, event3, event4, event5, event6)

}