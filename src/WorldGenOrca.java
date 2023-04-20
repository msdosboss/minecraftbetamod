package net.minecraft.src;

import java.util.Random;

public class WorldGenOrca extends WorldGenerator {
	public boolean generate(World var1, Random var2, int var3, int var4, int var5) {
        for(int var6 = var3; var6 <= var3 + 4; var6++){
            for(int var7 = var4; var7 <= var4 + 3; var7++){
                for(int var8 = var5; var8 <= var5 + 4; var8++){
                    if((var7 == var4) && var6 != var3 && var6 != var3 + 4 && var8 != var5 && var8 != var5 + 4){
                        var1.setBlock(var6, var7 - 1, var8, Block.eyeplanks.blockID);              //places the floor 
                    }
                    if((var6 == var3 && var7 == var4 + 1 && var8 == var5 + 2) || (var6 == var3 + 2 && var7 == var4 + 1 && var8 == var5 + 4) || (var6 == var3 + 4 && var7 == var4 + 1 && var8 == var5 + 2)){
                        var1.setBlock(var6, var7, var8, Block.glass.blockID);        //places the windows 
                        continue;
                    }
                    if(var6 == var3 + 3 && var7 == var4 && var8 == var5 + 3){
                        var1.setBlock(var6, var7, var8, Block.workbench.blockID);       //places crafting table
                        continue;
                    }
                    if(var6 == var3 + 1 && var7 == var4 && var8 == var5 + 3){
                        var1.setBlock(var6, var7, var8, Block.stoneOvenIdle.blockID);       //places crafting table
                        continue;
                    }
                    if(var6 == var3 + 2 && var7 == var4 + 3 && var8 == var5 + 3){
                        var1.setBlock(var6, var7 - 1, var8, Block.torchWood.blockID);
                    }
                    if((var6 == var3 + 2 && var7 == var4 && var8 == var5) || (var6 == var3 + 2 && var7 == var4 + 1 && var8 == var5)){
                        if(var7 == var4){
                            var1.setBlock(var6, var7 - 1, var8, Block.eyeplanks.blockID);
                            
                        }
                        var1.setBlock(var6, var7, var8, Block.doorWood.blockID);
                        continue;
                    }
                    if(var6 > var3 && var8 > var5 && var6 < var3 + 4 && var8 < var5 + 4 && var7 < var4 + 3){
                        var1.setBlock(var6, var7, var8, 0);
                        continue;                       //empties out the center 
                    }
                    if((var6 == var3 && var8 == var5) || (var6 == var3 && var8 == var5 + 4) || (var6 == var3 + 4 && var8 == var5) || (var6 == var3 + 4 && var8 == var5 + 4)){
                        var1.setBlock(var6, var7, var8, Block.eyewood.blockID);                    //does the conors
                        continue;
                    }
                    var1.setBlock(var6, var7, var8, Block.eyeplanks.blockID);                  //does the walls
                }
            }
        }
        return true;
    }
    
}