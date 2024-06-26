/*
 * Copyright DataStax, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.datastax.montecristo.model.astra

data class Serverless(
    override var maxFieldsPerTable : Int = 75,
    override var maxTablesPerDatabase : Int = 200,
    override var maxFieldsPerUdt : Int = 60,
    override var maxSecondaryIndexesPerTable : Int = 1,
    override var maxMaterializedViewsPerTable : Int = 0,
    override var maxSaiPerTable : Int = 10,
    override var maxSaiPerDatabase : Int = 50,
    override var pageSizeFailureThresholdInKb : Long = 512,
    override var inSelectCartesianProductFailureThreshold : Long = 25,
    override var partitionKeysInSelectFailureThreshold : Long = 20,
    override var tombstoneWarnThreshold : Long = 1000,
    override var tombstoneFailureThreshold : Long = 100000,
    override var batchSizeWarnThreshold : Long = 5,
    override var batchSizeFailureThreshold : Long = 50,
    override var unloggedBatchAcrossPartitionsWarnThreshold : Long = 10,
    override val columnValueSizeFailureThreshold : Long = 5 * 2048L
)  : ILimits()