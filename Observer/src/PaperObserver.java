public class PaperObserver implements Observer {
    @Override
    public void update(News news) {
        System.out.println("报纸头条：《" + news.title + "》" + news.content);
    }
}
