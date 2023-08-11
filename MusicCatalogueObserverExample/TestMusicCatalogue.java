public class TestMusicCatalogue {
  public static void main(String[] args) {
    MusicCatalogue mc = new MusicCatalogue();
    NewReleaseObserver toneDeafObserver = new NewReleaseObserver(mc, "William Shatner");
    NewReleaseObserver smoothSingerObserver = new NewReleaseObserver(mc, "Tony Bennett");

    mc.setLatestRelease("Tony Bennett", "Perfectly in tune!");
    mc.setLatestRelease("William Shatner", "Not quite perfectly in tune!");
  }
}
