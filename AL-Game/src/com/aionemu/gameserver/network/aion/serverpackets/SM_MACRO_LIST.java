/**
 * This file is part of aion-emu <aion-emu.com>.
 *
 *  aion-emu is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  aion-emu is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with aion-emu.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.aionemu.gameserver.network.aion.serverpackets;

import java.util.Map;

import com.aionemu.gameserver.model.gameobjects.player.Player;
import com.aionemu.gameserver.network.aion.AionConnection;
import com.aionemu.gameserver.network.aion.AionServerPacket;

/**
 * Packet with macro list.
 * 
 * @author -Nemesiss-
 */
public class SM_MACRO_LIST extends AionServerPacket {
	
	private Player player;

	/**
	 * Constructs new <tt>SM_MACRO_LIST </tt> packet
	 */
	public SM_MACRO_LIST(Player player) {
		this.player = player;
	}

	/**
	 * {@inheritDoc}
	 * 
	 * writeD player id
	 * writeC secondPart
	 * writeH size
	 * writeC Key
	 * writeS Value
	 */
	
	@Override
	protected void writeImpl(AionConnection con) {
		writeD(player.getObjectId());// player id
        writeC(0x01);// unk; may be was used to split macro list if getMacroList().getSize() > 7

        final int size = player.getMacroList().getSize();

        writeH(-size);// (-)count

        if (size > 0) {
            for (Map.Entry<Integer, String> entry : player.getMacroList().entrySet()) {
                writeC(entry.getKey());// order
                writeS(entry.getValue());// xml
            }
        }
	}
}
