/*
 *
 *  * Copyright (c) 2020 Noonmaru
 *  *
 *  * Licensed under the General Public License, Version 3.0 (the "License");
 *  *  you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  * https://opensource.org/licenses/gpl-3.0
 *  *
 *  *  Unless required by applicable law or agreed to in writing, software
 *  *  distributed under the License is distributed on an "AS IS" BASIS,
 *  *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  *  See the License for the specific language governing permissions and
 *  *  limitations under the License.
 *
 */

package com.github.noonmaru.tap.item

import com.github.noonmaru.tap.loader.LibraryLoader
import org.bukkit.inventory.ItemStack

abstract class ItemSupport {
    abstract fun saveToJsonString(item: ItemStack): String
}

private val NMS = LibraryLoader.load(ItemSupport::class.java)

fun ItemStack.saveToJsonString(): String {
    return NMS.saveToJsonString(this)
}