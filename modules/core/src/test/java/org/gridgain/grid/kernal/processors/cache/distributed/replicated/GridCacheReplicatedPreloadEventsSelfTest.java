/* @java.file.header */

/*  _________        _____ __________________        _____
 *  __  ____/___________(_)______  /__  ____/______ ____(_)_______
 *  _  / __  __  ___/__  / _  __  / _  / __  _  __ `/__  / __  __ \
 *  / /_/ /  _  /    _  /  / /_/ /  / /_/ /  / /_/ / _  /  _  / / /
 *  \____/   /_/     /_/   \_,__/   \____/   \__,_/  /_/   /_/ /_/
 */

package org.gridgain.grid.kernal.processors.cache.distributed.replicated;

import org.gridgain.grid.cache.GridCacheMode;
import org.gridgain.grid.kernal.processors.cache.distributed.GridCachePreloadEventsAbstractSelfTest;

import static org.gridgain.grid.cache.GridCacheMode.*;

/**
 */
public class GridCacheReplicatedPreloadEventsSelfTest extends GridCachePreloadEventsAbstractSelfTest {
    /** {@inheritDoc} */
    @Override protected GridCacheMode getCacheMode() {
        return REPLICATED;
    }
}