package gg.norisk.template.server

import net.fabricmc.api.DedicatedServerModInitializer
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

object TemplateServer : DedicatedServerModInitializer {
    const val MOD_ID = "template-server"
    val logger: Logger = LogManager.getLogger(MOD_ID)

    override fun onInitializeServer() {
        logger.info("Starting server...")
    }
}
