public class SelectiveWatcher extends NewsWatcher {

  private String categoryWatched;

  public SelectiveWatcher(NewsReporter aNewsReporter, String aCategoryToWatch) {
    theNewsReporter = aNewsReporter;
    categoryWatched = aCategoryToWatch;
    theNewsReporter.attach(this);
  }

  public void update() {
  // Modify this so that it only prints out the update text if the update is an alert for the category being watched
  String sUpdateCategory = theNewsReporter.getUpdateCategory() ;
  String sUpdateText = theNewsReporter.getUpdateText();


  if (sUpdateCategory.equals(categoryWatched)) {
    System.out.println("The news watcher watching for " +
                       categoryWatched +
                       "\nhas received a new alert: \n\"" +
                      sUpdateText  + "\"\n");
  }

  }
}
