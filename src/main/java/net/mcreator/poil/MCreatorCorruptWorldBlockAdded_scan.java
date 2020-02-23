package net.mcreator.poil;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.Direction;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

@Elementspoil.ModElement.Tag
public class MCreatorCorruptWorldBlockAdded_scan extends Elementspoil.ModElement {
	public MCreatorCorruptWorldBlockAdded_scan(Elementspoil instance) {
		super(instance, 2);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("direction") == null) {
			System.err.println("Failed to load dependency direction for procedure MCreatorCorruptWorldBlockAdded_scan!");
			return;
		}
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorCorruptWorldBlockAdded_scan!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure MCreatorCorruptWorldBlockAdded_scan!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure MCreatorCorruptWorldBlockAdded_scan!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure MCreatorCorruptWorldBlockAdded_scan!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure MCreatorCorruptWorldBlockAdded_scan!");
			return;
		}
		Direction direction = (Direction) dependencies.get("direction");
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((entity.getHorizontalFacing()) == (direction.getOpposite()))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.SMOOTH_QUARTZ.getDefaultState(), 3);
		}
	}
}
