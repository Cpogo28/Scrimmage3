/*
 * The MIT License
 *
 * Copyright 2013 Maxim Salikhov.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package io.github.ocnscrim.scrimmage.kits;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

/**
 * Class for storing information about a KitItem per XML
 * 
 * @author Maxim Salikhov
 */
public class KitItem {

	int s;
	Material m;
	Enchantment e;
	int el;
	String l;
	String n;
	int d;

	/**
	 * Constructor requesting all info about an item. It is possible for some
	 * values to be null.
	 * 
	 * @param slot
	 * @param mat
	 * @param echantment
	 * @param lore
	 * @param name
	 * @param damage
	 */
	public KitItem(int slot, Material mat, String echantment, String lore,
			String name, int damage) {
		s = slot;
		m = mat;
		l = lore;
		n = name;
		d = damage;
	}
}
