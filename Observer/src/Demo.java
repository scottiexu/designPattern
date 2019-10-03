public class Demo {
    public static void main(String[] args) {

        NewsSubject newsSubject = new NewsSubject();

        Observer paperObserver = new PaperObserver();
        Observer tvObserver = new TVObserver();

        newsSubject.registerObserver(paperObserver);
        newsSubject.registerObserver(tvObserver);

        News news1 = new News("习近平同比利时国王菲利普就旅比大熊猫诞下幼崽互致贺电",
                "新华社北京10月3日电 今年8月，旅比大熊猫“好好”顺利诞下两只大熊猫幼崽。" +
                        "近日，国家主席习近平同比利时国王菲利普就此互致贺电。" +
                        "习近平在贺电中表示，两只大熊猫幼崽的诞生值得共同庆贺。" +
                        "相信它们将成为中比友好新佳话。我高度重视中比关系发展，" +
                        "愿同菲利普国王一道努力，推动中比全方位友好合作伙伴关系不断迈向更高水平。" +
                        "菲利普国王在贺电中表示，两只大熊猫幼崽的诞生是一大喜讯。" +
                        "我对比中两国在诸多领域的良好合作表示高度赞赏。");

         newsSubject.setNews(news1);
    }
}
