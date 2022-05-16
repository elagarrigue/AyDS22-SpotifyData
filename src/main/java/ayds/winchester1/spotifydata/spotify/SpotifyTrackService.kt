package ayds.winchester1.spotifydata.spotify

import ayds.winchester1.spotifydata.spotify.entities.SpotifySong


interface SpotifyTrackService {

    fun getSong(title: String): SpotifySong?
}