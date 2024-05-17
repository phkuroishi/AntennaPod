package de.danoeh.antennapod.net.discovery;

import org.junit.Assert;
import org.junit.Test;

public class ItunesPodcastSearcherTest {

    @Test
    public void test_itunesPodcastSearcher_getName() {
        ItunesPodcastSearcher itunesPodcastSearcher = new ItunesPodcastSearcher();
        Assert.assertEquals("Apple", itunesPodcastSearcher.getName());
    }
}
