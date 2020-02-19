package com.leandro.retrofitexamplesecao3.rss;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;


@Root(name = "rss",strict = false)
public class RSS {

    @Element(name="channel")
    Channel channel;
    public Channel getChannel(){return channel;}
    public void setChannel(Channel channel){this.channel=channel;}
}
