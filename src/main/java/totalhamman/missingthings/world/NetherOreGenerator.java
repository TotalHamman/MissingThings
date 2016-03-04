package totalhamman.missingthings.world;

import net.minecraft.block.state.pattern.BlockHelper;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.ChunkProviderHell;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.registry.GameRegistry;
import totalhamman.missingthings.blocks.ModBlocks;

import java.util.Random;

public class NetherOreGenerator implements IWorldGenerator {

    public WorldGenMinable roughDiamondGen;

    public NetherOreGenerator() {
        roughDiamondGen = new WorldGenMinable(ModBlocks.netherDiamondOre.getStateFromMeta(0), 8, BlockHelper.forBlock(Blocks.netherrack));
    }

    public static void init() {
        GameRegistry.registerWorldGenerator(new NetherOreGenerator(), 0);
    }

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenereator, IChunkProvider chunkProvider) {
        if (chunkGenereator instanceof ChunkProviderHell) {
            generateOre(roughDiamondGen, 4, random, chunkX, chunkZ, world);
        }
    }

    public void generateOre(WorldGenMinable gen, int numClusters, Random random, int chunkX, int chunkZ, World world) {
        BlockPos pos;

        for (int i = 0; i < numClusters; i++) {
            pos = new BlockPos(chunkX*16, 0, chunkZ*16);
            pos = pos.add(random.nextInt(16), random.nextInt(33), random.nextInt(16));
            gen.generate(world, random, pos);
        }

    }
}
