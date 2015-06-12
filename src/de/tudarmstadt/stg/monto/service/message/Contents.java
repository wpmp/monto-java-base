package de.tudarmstadt.stg.monto.service.message;

import de.tudarmstadt.stg.monto.service.region.IRegion;

import java.io.InputStream;
import java.io.Reader;

public interface Contents {
    InputStream getBytes();

    Reader getReader();

    Contents extract(int offset, int length);

    default Contents extract(IRegion region) {
        return extract(region.getStartOffset(), region.getLength());
    }
}
