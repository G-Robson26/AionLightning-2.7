/*
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, 
 * MA  02110-1301, USA.
 *
 * http://www.gnu.org/copyleft/gpl.html
 */
package com.aionemu.gameserver.controllers.movement;

/**
 * @author Mr. Poke
 *
 */
public class MovementMask
{
	public static final byte	GLIDE		= (byte) 0x04;
	public static final byte	FALL		= (byte) 0x08;
	public static final byte	VEHICLE		= (byte) 0x10;
	public static final byte	MOUSE		= (byte) 0x20;
	public static final byte	STARTMOVE	= (byte) 0xC0;
}
