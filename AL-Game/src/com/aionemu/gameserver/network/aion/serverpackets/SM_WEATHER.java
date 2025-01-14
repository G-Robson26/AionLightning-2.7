/*
 * This file is part of aion-unique <aion-unique.smfnew.com>.
 *
 *  aion-unique is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  aion-unique is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with aion-unique.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.aionemu.gameserver.network.aion.serverpackets;


import java.util.Arrays;
import java.util.List;

import com.aionemu.gameserver.network.aion.AionConnection;
import com.aionemu.gameserver.network.aion.AionServerPacket;

/**
 * @author ATracer
 * @author Kwazar
 * @author Nemesiss :D:D
 */
public class SM_WEATHER extends AionServerPacket {

	private List<Integer> weatherCodes;

	public SM_WEATHER(int weatherCode) {
		this.weatherCodes = Arrays.asList(weatherCode);
	}

	@Override
	protected void writeImpl(AionConnection con) {
		writeC(0x00);//unk
		writeC(weatherCodes.size());
		for(int weatherCode : weatherCodes)
			writeC(weatherCode);
	}
}
