package ayds.winchester1.spotifydata.spotify.entities

data class SpotifySong(
    val id: String,
    val songName: String,
    val artistName: String,
    val albumName: String,
    val releaseDate: String,
    val spotifyUrl: String,
    val imageUrl: String,
    var isLocallyStored: Boolean = false
) {

    val year: String = releaseDate.split("-").first()
}