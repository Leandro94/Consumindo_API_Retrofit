package com.leandro.retrofitexamplesecao3.rss;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name="item",strict = false)
public class Item {
    @Element(name="title",required = false)
    public String title;


    @Element(name="pubDate",required = false)
    String pubDate;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }
}
