package com.leandro.retrofitexamplesecao3.rss;

import android.content.ClipData;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

import java.util.List;

@Root(name="channel",strict=false)
public class Channel {

    @ElementList(name="item", inline = true)
    List<Item>itemList;

    public List<Item> getItemList() {
        return itemList;
    }


    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
}
