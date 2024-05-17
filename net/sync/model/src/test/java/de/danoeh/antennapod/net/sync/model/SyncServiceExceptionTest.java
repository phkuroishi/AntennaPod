package de.danoeh.antennapod.net.sync.model;

import org.junit.Assert;
import org.junit.Test;

public class SyncServiceExceptionTest {

    @Test
    public void test_syncServiceException() {
        SyncServiceException exception = new SyncServiceException("Exception message");
        Assert.assertEquals("Exception message", exception.getMessage());
    }
}
