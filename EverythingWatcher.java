public class EverythingWatcher extends NewsWatcher {

  public EverythingWatcher(NewsReporter aNewsReporter) {
    theNewsReporter = aNewsReporter;
    theNewsReporter.attach(this);
  }

  public void update() {
  // Modify this so that it always prints out the update text,
  // regardless of the update category

  //String newReleasePerformer = theNewsReporter.getLatestReleasePerformer();
  System.out.println("The news watcher watching for everything \nhas received a new alert: " + "\n" + '"' + theNewsReporter.getUpdateText() + '"' + "\n");
  }
}
