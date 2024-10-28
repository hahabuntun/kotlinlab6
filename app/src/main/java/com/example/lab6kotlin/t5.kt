enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING,
}




data class Event2(
    val title: String,
    val description: String? = null,
    val daypart: Daypart,
    val durationInMinutes: Int,
)