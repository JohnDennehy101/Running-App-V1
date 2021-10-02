package ie.wit.runappv1.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.time.LocalDate
import java.util.*

@Parcelize
data class RaceModel(
    var id: Long = 0,
    var title: String = "",
    var description: String = "",
    var raceDate: String = ""
) : Parcelable