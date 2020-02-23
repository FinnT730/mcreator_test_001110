package net.mcreator.poil;

import net.minecraft.world.World;

@Elementspoil.ModElement.Tag
public class MCreatorMathsin extends Elementspoil.ModElement {
	public MCreatorMathsin(Elementspoil instance) {
		super(instance, 2);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorMathsin!");
			return;
		}
		World world = (World) dependencies.get("world");
		double sin = 0;
		poilVariables.WorldVariables.get(world)._place_block_true_false = (boolean) (false);
		poilVariables.WorldVariables.get(world).syncData(world);
		poilVariables.WorldVariables.get(world)._incrememt_index = (boolean) (true);
		poilVariables.WorldVariables.get(world).syncData(world);
		poilVariables.WorldVariables.get(world)._decrement_index = (boolean) (true);
		poilVariables.WorldVariables.get(world).syncData(world);
		poilVariables.MapVariables.get(world)._include_math = (boolean) (true);
		poilVariables.MapVariables.get(world).syncData(world);
		poilVariables.MapVariables.get(world)._place_block = (boolean) (true);
		poilVariables.MapVariables.get(world).syncData(world);
		sin = (double) Math.sin((poilVariables.WorldVariables.get(world)._number_SIN));
		poilVariables.WorldVariables.get(world)._number_SIN = (double) (sin);
		poilVariables.WorldVariables.get(world).syncData(world);
	}
}
