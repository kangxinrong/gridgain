﻿/* @csharp.file.header */

/*  _________        _____ __________________        _____
 *  __  ____/___________(_)______  /__  ____/______ ____(_)_______
 *  _  / __  __  ___/__  / _  __  / _  / __  _  __ `/__  / __  __ \
 *  / /_/ /  _  /    _  /  / /_/ /  / /_/ /  / /_/ / _  /  _  / / /
 *  \____/   /_/     /_/   \_,__/   \____/   \__,_/  /_/   /_/ /_/
 */

namespace GridGain.Client.Impl.Portable
{
    using System;
    using System.Collections.Generic;

    /**
     * <summary>Metadata for particular object.</summary>
     */ 
    class GridClientPortableClassMetadata
    {
        /** Empty metadata. */
        public static readonly GridClientPortableClassMetadata EMPTY_META = new GridClientPortableClassMetadata(null, null);

        /** Empty list in case there are no fields. */
        private static readonly ICollection<GridClientPortableFieldMetadata> EMPTY_FIELDS = new List<GridClientPortableFieldMetadata>();

        /**
         * <summary>Constructor.</summary>
         * <param name="type">Type.</param>
         * <param name="fields">Fields.</param>
         */
        public GridClientPortableClassMetadata(Type type, ICollection<GridClientPortableFieldMetadata> fields)
        {
            Type = type;

            Fields = fields != null ? fields : EMPTY_FIELDS;
        }

        /**
         * <summary>Underlying type.</summary>
         */ 
        public Type Type
        {
            get;
            private set;
        }

        /**
         * <summary>Fields.</summary>
         */
        public ICollection<GridClientPortableFieldMetadata> Fields
        {
            get;
            private set;
        }
        
        /**
         * <summary>Whether metadata is needed.</summary>
         * <returns>True if metadata is needed.</returns>
         */ 
        public bool IsNeeded()
        {
            return Type != null || Fields.Count != 0;
        }
    }
}