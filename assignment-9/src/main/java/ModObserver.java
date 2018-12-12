import java.net.URL;
import java.net.URLConnection;
import java.net.MalformedURLException;

public class ModObserver extends Observer{

    public ModObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);

    }



    @Override
    public void update() throws Exception {
        URL url = new URL(subject.getState());
        URLConnection connection = url.openConnection();
        System.out.println(connection.getHeaderField("Last-Modified"));
    }
}