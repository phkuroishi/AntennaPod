package de.danoeh.antennapod.model;

import org.junit.Assert;
import org.junit.Test;

import de.danoeh.antennapod.model.feed.Chapter;

public class ChapterTest {

    @Test
    public void test_chapter() {
        Chapter chapter = new Chapter(123, "Chapter 1", "https://www.newchapter.com", "https://www.newchapter.com/img");
        Assert.assertEquals(chapter.getStart(), 123);
    }
}
