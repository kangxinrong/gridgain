/* @java.file.header */

/*  _________        _____ __________________        _____
 *  __  ____/___________(_)______  /__  ____/______ ____(_)_______
 *  _  / __  __  ___/__  / _  __  / _  / __  _  __ `/__  / __  __ \
 *  / /_/ /  _  /    _  /  / /_/ /  / /_/ /  / /_/ / _  /  _  / / /
 *  \____/   /_/     /_/   \_,__/   \____/   \__,_/  /_/   /_/ /_/
 */

package org.gridgain.grid.ggfs.ggfs;

import org.gridgain.grid.ggfs.*;

import static org.gridgain.grid.util.ipc.shmem.GridIpcSharedMemoryServerEndpoint.*;

/**
 * GGFS Hadoop file system IPC loopback self test.
 */
public abstract class GridGgfsHadoopFileSystemLoopbackAbstractSelfTest extends
    GridGgfsHadoopFileSystemAbstractSelfTest {
    /**
     * Constructor.
     *
     * @param mode GGFS mode.
     */
    protected GridGgfsHadoopFileSystemLoopbackAbstractSelfTest(GridGgfsMode mode) {
        super(mode);
    }

    /** {@inheritDoc} */
    @Override protected String primaryFileSystemUriPath() {
        return "ggfs://primary/";
    }

    /** {@inheritDoc} */
    @Override protected String primaryFileSystemConfigPath() {
        return "modules/core/src/test/config/hadoop/core-site-loopback.xml";
    }

    /** {@inheritDoc} */
    @Override protected String primaryFileSystemEndpoint() throws Exception {
        return "127.0.0.1:10500";
    }

    /** {@inheritDoc} */
    @Override protected String primaryIpcEndpointConfiguration(String gridName) {
        return "{type:'tcp', port:" + (DFLT_IPC_PORT + getTestGridIndex(gridName)) + "}";
    }

    /** {@inheritDoc} */
    @Override protected String secondaryFileSystemUriPath() {
        return "ggfs://secondary/";
    }

    /** {@inheritDoc} */
    @Override protected String secondaryFileSystemConfigPath() {
        return "modules/core/src/test/config/hadoop/core-site-loopback-secondary.xml";
    }

    /** {@inheritDoc} */
    @Override protected String secondaryFileSystemEndpoint() throws Exception {
        return "127.0.0.1:11500";
    }

    /** {@inheritDoc} */
    @Override protected String secondaryIpcEndpointConfiguration() {
        return "{type:'tcp', port:11500}";
    }
}