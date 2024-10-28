enum class Daypart5 {
    MORNING,
    AFTERNOON,
    EVENING,
}




data class Event6(
    val title: String,
    val description: String? = null,
    val daypart: Daypart5,
    val durationInMinutes: Int,
)

fun main(){
    val event1 = Event6(title = "Wake up", description = "Time to get up", daypart = Daypart5.MORNING, durationInMinutes = 0)
    val event2 = Event6(title = "Eat breakfast", daypart = Daypart5.MORNING, durationInMinutes = 15)
    val event3 = Event6(title = "Learn about Kotlin", daypart = Daypart5.AFTERNOON, durationInMinutes = 30)
    val event4 = Event6(title = "Practice Compose", daypart = Daypart5.AFTERNOON, durationInMinutes = 60)
    val event5 = Event6(title = "Watch latest DevBytes video", daypart = Daypart5.AFTERNOON, durationInMinutes = 10)
    val event6 = Event6(title = "Check out latest Android Jetpack library", daypart = Daypart5.EVENING, durationInMinutes = 45)
    val events = mutableListOf<Event6>(event1, event2, event3, event4, event5, event6)

    val shortEvents = events.filter { it.durationInMinutes < 60 }
    println("You have ${shortEvents.size} short events.")

    val groupedEvents = events.groupBy { it.daypart }
    groupedEvents.forEach { (daypart, events) ->
        println("$daypart: ${events.size} events")
    }

    println("Last event of the day: ${events.last().title}")

}