
import java.util.ArrayList;
import java.util.List;

public class NewsSubject implements Subject {


    List<Observer> observerList;

    News news;


    public NewsSubject() {
        observerList = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observerList) {
            o.update(this.news);
        }
    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
        notifyObservers();
    }
}
