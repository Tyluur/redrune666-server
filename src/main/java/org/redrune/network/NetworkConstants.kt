package org.redrune.network

import com.google.common.collect.ImmutableList
import io.netty.util.AttributeKey
import org.redrune.game.GameConstants
import org.redrune.game.GameFlags
import java.math.BigInteger

/**
 * All network constants are stored here.
 *
 * @author Tyluur <itstyluur@gmail.com>
 * @since 5/18/2017
 */
interface NetworkConstants : GameConstants {
    companion object {
        /**
         * The id of the master server port
         */
        const val MASTER_SERVER_PORT_ID = 4444

        /**
         * The id of the port that is opened by the lobby
         */
        const val LOBBY_PORT_ID = 43594

        /**
         * The id of the port used for main communications
         */
        val WORLD_PORT_ID = 43594 + GameFlags.worldId

        /**
         * The revision of the game
         */
        const val REVISION = 666

        /**
         * The attribute that contains the key for a session.
         */
        val SESSION_KEY = AttributeKey.valueOf<NetworkSession>("session.key")

        /**
         * The update server keys
         */
        val UPDATE_SERVER_KEYS = intArrayOf(
            56,
            79325,
            55568,
            46770,
            24563,
            299978,
            44375,
            0,
            4176,
            3589,
            109125,
            604031,
            176138,
            292288,
            350498,
            686783,
            18008,
            20836,
            16339,
            1244,
            8142,
            743,
            119,
            699632,
            932831,
            3931,
            2974
        )

        /**
         * The packet id for the first click on the item
         */
        const val FIRST_PACKET_ID = 85

        /**
         * The packet id for equipping items (second click)
         */
        const val EQUIP_PACKET_ID = 7
        const val SECOND_PACKET_ID = 7

        /**
         * The packet id for operating items/third click
         */
        const val OPERATE_PACKET_ID = 66
        const val THIRD_PACKET_ID = 66

        /**
         * The packet id for the fourth item click
         */
        const val FOURTH_PACKET_ID = 84

        /**
         * The packet id for the fifth option
         */
        const val FIFTH_PACKET_ID = 48

        /**
         * The packet id for the sixth option
         */
        const val SIXTH_PACKET_ID = 17

        /**
         * The packet id for the seventh option
         */
        const val SEVENTH_PACKET_ID = 25

        /**
         * The packet id for the drop option
         */
        const val DROP_PACKET_ID = 40

        /**
         * The packet id for the examine option
         */
        const val EXAMINE_PACKET_ID = 54

        /**
         * The packet id for the last click option
         */
        const val LAST_PACKET_ID = 11

        /**
         * The game server RSA key exponent.
         */
        val LOGIN_EXPONENT =
            BigInteger("118762062543447234074727456808991118872170985751713606465722882159677729022791781634631275342059815254405716406345046978427092008247432011727406028949468214427650611830755367261560706476584680737149281348803965978585646403259797833935425150657845103665015467365527987767725318315713043512372527291907415762273")

        /**
         * The game server RSA key modulus.
         */
        val LOGIN_MODULUS =
            BigInteger("123733137684565391382986985515878973634831964473007354491671126289247096002904505166425503816809330286277302494636833012609314653193945563916110405049937997195310625096132297106334199144922705176219016362504626538048084031862798816953255666088269887586583538984815994152019844370040268440057091407812614894353")

        /**
         * The list of exceptions that are ignored
         */
        val IGNORED_EXCEPTIONS = ImmutableList.of(
            "An existing connection was forcibly closed by the remote host",
            "An established connection was aborted by the software in your host machine"
        )

        /**
         * The login to world opcode.
         */
        const val WORLD_OPCODE = 16

        /**
         * The login to lobby opcode.
         */
        const val LOBBY_OPCODE = 19

        /**
         * The length of a timeout
         */
        const val TIMEOUT_RATE = 30000 // 1minute;

        /**
         * The ip of the main world
         */
        const val MAIN_WORLD_IP = "127.0.0.1"

        /**
         * The ip of pvp world
         */
        const val PVP_WORLD_IP = "127.0.0.1"
    }
}