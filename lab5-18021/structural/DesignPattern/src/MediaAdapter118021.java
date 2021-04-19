public class MediaAdapter118021 implements MediaPlayer118021 {
    AdvancedMediaPlayer118021 advancedMusicPlayer;
    public MediaAdapter118021(String audioType) {
    if (audioType.equalsIgnoreCase("vlc")) {
    advancedMusicPlayer = new VlcPlayer118021();
    } else if (audioType.equalsIgnoreCase("mp4")) {
    advancedMusicPlayer = new Mp4Player118021();
    }
    }
    @Override
    public void play(String audioType, String fileName) {
    if (audioType.equalsIgnoreCase("vlc")) {
    advancedMusicPlayer.playVlc(fileName);
    } else if (audioType.equalsIgnoreCase("mp4")) {
    advancedMusicPlayer.playMp4(fileName);
    }
    }
   }
   