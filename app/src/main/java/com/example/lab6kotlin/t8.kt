enum class Daypart4 {
    MORNING,
    AFTERNOON,
    EVENING,
}




data class Event5(
    val title: String,
    val description: String? = null,
    val daypart: Daypart4,
    val durationInMinutes: Int,
)

fun main(){
    val event1 = Event5(title = "Wake up", description = "Time to get up", daypart = Daypart4.MORNING, durationInMinutes = 0)
    val event2 = Event5(title = "Eat breakfast", daypart = Daypart4.MORNING, durationInMinutes = 15)
    val event3 = Event5(title = "Learn about Kotlin", daypart = Daypart4.AFTERNOON, durationInMinutes = 30)
    val event4 = Event5(title = "Practice Compose", daypart = Daypart4.AFTERNOON, durationInMinutes = 60)
    val event5 = Event5(title = "Watch latest DevBytes video", daypart = Daypart4.AFTERNOON, durationInMinutes = 10)
    val event6 = Event5(title = "Check out latest Android Jetpack library", daypart = Daypart4.EVENING, durationInMinutes = 45)
    val events = mutableListOf<Event5>(event1, event2, event3, event4, event5, event6)

    val shortEvents = events.filter { it.durationInMinutes < 60 }
    println("You have ${shortEvents.size} short events.")

    val groupedEvents = events.groupBy { it.daypart }
    groupedEvents.forEach { (daypart, events) ->
        println("$daypart: ${events.size} events")
    }
}