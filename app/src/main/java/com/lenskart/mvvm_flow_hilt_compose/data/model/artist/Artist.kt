

import com.google.gson.annotations.SerializedName
import com.lenskart.mvvm_flow_hilt_compose.data.model.artist.Crew

data class Artist(
    @SerializedName("cast")
    val cast: List<Cast>,
    @SerializedName("crew")
    val crew: List<Crew>,
    @SerializedName("id")
    val id: Int
)