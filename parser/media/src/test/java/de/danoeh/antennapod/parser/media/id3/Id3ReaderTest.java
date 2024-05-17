package de.danoeh.antennapod.parser.media.id3;

import de.danoeh.antennapod.parser.media.id3.model.FrameHeader;
import de.danoeh.antennapod.parser.media.id3.model.TagHeader;
import org.apache.commons.io.input.CountingInputStream;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class Id3ReaderTest {

    @Test
    public void testReadingLimit() throws IOException {
        byte[] data = {
            ID3Reader.ENCODING_ISO,
            'A', 'B', 'C', 'D'
        };
        CountingInputStream inputStream = new CountingInputStream(new ByteArrayInputStream(data));
        ID3Reader reader = new ID3Reader(inputStream);
        assertEquals("ABC", reader.readEncodingAndString(4)); // Includes encoding
        assertEquals('D', reader.readByte());
    }
}
