package net.darkhax.enchdesc;

import net.minecraftforge.fml.IExtensionPoint;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.forgespi.Environment;
import net.minecraftforge.network.NetworkConstants;

@Mod(Constants.MOD_ID)
public class EnchDescForge {

    public EnchDescForge() {

        ModLoadingContext.get().registerExtensionPoint(IExtensionPoint.DisplayTest.class, () -> new IExtensionPoint.DisplayTest(() -> NetworkConstants.IGNORESERVERONLY, (a, b) -> true));

        if (Environment.get().getDist().isClient()) {

            new EnchDescCommon(FMLPaths.CONFIGDIR.get());
        }
    }
}