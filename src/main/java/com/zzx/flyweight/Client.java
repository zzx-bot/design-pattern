package com.zzx.flyweight;

public class Client {
    public static void main(String[] args) {
        // 创建一个工厂
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        // 客户Tom要一个以新闻形式发布的网站
        WebSite webSite1 = webSiteFactory.getWebSiteCategory("新闻");
        webSite1.use(new User("Tom"));

        // 客户LiCong要一个以新闻形式发布的网站
        WebSite webSite2 = webSiteFactory.getWebSiteCategory("新闻");
        webSite2.use(new User("LiCong"));


        // 客户张三要一个以新闻形式发布的网站
        WebSite webSite3 = webSiteFactory.getWebSiteCategory("博客");
        webSite3.use(new User("张三"));
        // 客户李四要一个以新闻形式发布的网站
        WebSite webSite4 = webSiteFactory.getWebSiteCategory("博客");
        webSite4.use(new User("李四"));


        // 客户坤坤要一个以新闻形式发布的网站
        WebSite webSite5 = webSiteFactory.getWebSiteCategory("百科");
        webSite5.use(new User("坤坤"));

        // 客户黄大儿要一个以新闻形式发布的网站
        WebSite webSite6 = webSiteFactory.getWebSiteCategory("论坛");
        webSite6.use(new User("黄大儿"));

        System.out.println(webSiteFactory.getWebSiteCount());
        webSiteFactory.printWebSite();
    }
}
