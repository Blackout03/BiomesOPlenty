package biomesoplenty;

import net.minecraftforge.common.MinecraftForge;
import biomesoplenty.common.eventhandler.client.gui.MainMenuEventHandler;
import biomesoplenty.common.eventhandler.client.gui.StartupWarningEventHandler;
import biomesoplenty.common.eventhandler.entity.DyeEventHandler;
import biomesoplenty.common.eventhandler.entity.FlippersEventHandler;
import biomesoplenty.common.eventhandler.entity.TemptEventHandler;
import biomesoplenty.common.eventhandler.misc.BonemealEventHandler;
import biomesoplenty.common.eventhandler.misc.BucketEventHandler;
import biomesoplenty.common.eventhandler.network.ConnectionEventHandler;
import biomesoplenty.common.eventhandler.potions.PotionParalysisEventHandler;
import biomesoplenty.common.eventhandler.potions.PotionPossessionEventHandler;
import biomesoplenty.common.eventhandler.world.BiomeSizeEventHandler;
import biomesoplenty.common.eventhandler.world.DecorationModificationEventHandler;
import biomesoplenty.common.eventhandler.world.MapGenEventHandler;
import biomesoplenty.common.eventhandler.world.VillageMaterialEventHandler;
import cpw.mods.fml.common.FMLCommonHandler;


public class CommonProxy 
{
	//Client Only
	public void registerRenderers() 
	{
	}
	
	public void spawnParticle(String string, double x, double y, double z)
	{
	}
	
	public int addArmor(String armor)
	{
		return 0;
	}
}