import java.util.*;

public class MusicCatalogue {

  private ArrayList <MusicCatalogueObserver> observers = new ArrayList <MusicCatalogueObserver> ();
  private String latestReleasePerformer;
  private String latestReleaseAlbumTitle;
// Could improve by lumping these details into some "Album" class
// which held details of performer, title, etc.

  public void attach(MusicCatalogueObserver o) {
    observers.add(o);
  }

// Would benefit from a way of cleaning up, detaching observers ...

  public void setLatestRelease(String performerName, String title) {
    latestReleasePerformer = performerName;
    latestReleaseAlbumTitle = title;
    this.notifyObservers();
  }

  public String getLatestReleasePerformer() {
    return latestReleasePerformer;
  }

  public String getLatestReleaseAlbumTitle() {
    return latestReleaseAlbumTitle;
  }

  private void notifyObservers() {
// Go through each of the observers in turn, sending it a message to notify
// that an update has occurred

    Iterator <MusicCatalogueObserver> iterator = observers.iterator();
    while (iterator.hasNext()) iterator.next().update();
  }

}
