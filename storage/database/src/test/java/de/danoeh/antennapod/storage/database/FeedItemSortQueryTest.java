package de.danoeh.antennapod.storage.database;

import org.junit.Assert;
import org.junit.Test;

import de.danoeh.antennapod.model.feed.SortOrder;
import de.danoeh.antennapod.storage.database.mapper.FeedItemSortQuery;

public class FeedItemSortQueryTest {

    @Test
    public void test_feedItemSortQuery() {
        SortOrder sortOrder = SortOrder.EPISODE_FILENAME_A_Z;
        Assert.assertNotNull(FeedItemSortQuery.generateFrom(sortOrder));
    }
}
