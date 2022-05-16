package ayds.winchester1.spotifydata.spotify.tracks

import retrofit2.Call
import retrofit2.http.*

internal interface SpotifyTrackAPI {

    @GET("search?type=track")
    fun getTrackInfo(
      @Header("Authorization") token: String,
      @Query("q") query: String
    ): Call<String>
}