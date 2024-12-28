package gg.norisk.template.client

import net.fabricmc.api.ClientModInitializer
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

object TemplateClient : ClientModInitializer {
    const val MOD_ID = "template-client"
    val logger: Logger = LogManager.getLogger(MOD_ID)

    override fun onInitializeClient() {
        logger.info("Starting client...")
    }
}