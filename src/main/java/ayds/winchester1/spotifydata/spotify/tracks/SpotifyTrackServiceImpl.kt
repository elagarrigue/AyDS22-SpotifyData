package ayds.winchester1.spotifydata.spotify.tracks


import ayds.winchester1.spotifydata.spotify.SpotifyTrackService
import ayds.winchester1.spotifydata.spotify.auth.SpotifyAccountService
import ayds.winchester1.spotifydata.spotify.entities.SpotifySong
import retrofit2.Response

internal class SpotifyTrackServiceImpl(
    private val spotifyTrackAPI: SpotifyTrackAPI,
    private val spotifyAccountService: SpotifyAccountService,
    private val spotifyToSongResolver: SpotifyToSongResolver,
) : SpotifyTrackService {

    override fun getSong(title: String): SpotifySong? {
        val callResponse = getSongFromService(title)
        return spotifyToSongResolver.getSongFromExternalData(callResponse.body())
    }

    private fun getSongFromService(query: String): Response<String> {
        return spotifyTrackAPI.getTrackInfo("Bearer " + spotifyAccountService.token, query)
            .execute()
    }
}