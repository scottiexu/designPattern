public class TVObserver implements Observer {
    @Override
    public void update(News news) {
        System.out.println("漂亮女主播说：最新消息《" + news.title + "》" + news.content);
    }
}
