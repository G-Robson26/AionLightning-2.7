/**
 * This file is part of aion-lightning <aion-lightning.org>.
 * 
 * aion-lightning is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * aion-lightning is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with aion-lightning.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.aionlightning.loginserver.network.gameserver.serverpackets;

import com.aionlightning.loginserver.network.gameserver.GsConnection;
import com.aionlightning.loginserver.network.gameserver.GsServerPacket;

/**
 * In this packet LoginSerer is requesting kicking account from GameServer.
 * 
 * @author -Nemesiss-
 */
public class SM_REQUEST_KICK_ACCOUNT extends GsServerPacket {

	/**
	 * Account that must be kicked at GameServer side.
	 */
	private final int accountId;

	/**
	 * Constructor.
	 * 
	 * @param accountId
	 */
	public SM_REQUEST_KICK_ACCOUNT(int accountId) {
		this.accountId = accountId;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void writeImpl(GsConnection con) {
		writeC(2);
		writeD(accountId);
	}
}
