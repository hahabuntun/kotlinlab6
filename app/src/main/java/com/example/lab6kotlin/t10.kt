enum class Daypart6 {
    MORNING,
    AFTERNOON,
    EVENING,
}




data class Event7(
    val title: String,
    val description: String? = null,
    val daypart: Daypart6,
    val durationInMinutes: Int,
)

val Event7.durationOfEvent: String
    get() = if (this.durationInMinutes < 60) {
        "short"
    } else {
        "long"
    }

fun main(){
    val event1 = Event7(title = "Wake up", description = "Time to get up", daypart = Daypart6.MORNING, durationInMinutes = 0)
    val event2 = Event7(title = "Eat breakfast", daypart = Daypart6.MORNING, durationInMinutes = 15)
    val event3 = Event7(title = "Learn about Kotlin", daypart = Daypart6.AFTERNOON, durationInMinutes = 30)
    val event4 = Event7(title = "Practice Compose", daypart = Daypart6.AFTERNOON, durationInMinutes = 60)
    val event5 = Event7(title = "Watch latest DevBytes video", daypart = Daypart6.AFTERNOON, durationInMinutes = 10)
    val event6 = Event7(title = "Check out latest Android Jetpack library", daypart = Daypart6.EVENING, durationInMinutes = 45)
    val events = mutableListOf<Event7>(event1, event2, event3, event4, event5, event6)

    val shortEvents = events.filter { it.durationInMinutes < 60 }
    println("You have ${shortEvents.size} short events.")

    val groupedEvents = events.groupBy { it.daypart }
    groupedEvents.forEach { (daypart, events) ->
        println("$daypart: ${events.size} events")
    }

    println("Last event of the day: ${events.last().title}")

    println("Duration of first event of the day: ${events[0].durationOfEvent}")


}