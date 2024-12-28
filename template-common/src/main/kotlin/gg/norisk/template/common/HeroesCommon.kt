package gg.norisk.template.common

import net.fabricmc.api.ModInitializer
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

object TemplateCommon : ModInitializer {
    const val MOD_ID = "template-common"
    val logger: Logger = LogManager.getLogger(MOD_ID)

    override fun onInitialize() {
        logger.info("Starting common...")
    }
}