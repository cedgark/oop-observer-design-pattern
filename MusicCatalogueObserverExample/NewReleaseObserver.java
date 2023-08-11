public class NewReleaseObserver extends MusicCatalogueObserver {

  private String performerBeingWatched;
  private MusicCatalogue theCatalogue;

  public NewReleaseObserver(MusicCatalogue aCatalogue, String performerToWatch) {
    theCatalogue = aCatalogue;
    performerBeingWatched = performerToWatch;
    theCatalogue.attach(this);
  }

  public void update() {
    String newReleasePerformer = theCatalogue.getLatestReleasePerformer();
    if (newReleasePerformer.equals(performerBeingWatched)) {
      System.out.println("The NewReleaseObserver watching for releases by " +
                         performerBeingWatched +
                         "\nhas noticed a new album entitled\n\"" +
                         theCatalogue.getLatestReleaseAlbumTitle() + "\"\n");
    }
  }

}
