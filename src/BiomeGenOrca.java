package net.minecraft.src;

import java.util.Random;

public class BiomeGenOrca extends BiomeGenBase {
    public BiomeGenOrca(){
        this.fillerBlock = (byte)Block.stone.blockID;
        this.spawnableMonsterList.clear();
    }
    //public WorldGenerator getRandomWorldGenForTrees(Random var1) {
        //return (WorldGenerator)(new WorldGenBigTree());
    //}
    public WorldGenerator getGenForOrca(Random var1){
        return (WorldGenerator)(new WorldGenOrca());
    }
    public WorldGenerator getGenForEyeTrees(Random var1){
        return (WorldGenerator)(new WorldGenEyeTrees());
    }
     public WorldGenerator getGenForBlueTrees(Random var1){
        return (WorldGenerator)(new WorldGenBlueTrees());
    }
}







