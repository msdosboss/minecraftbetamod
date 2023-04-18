package net.minecraft.src;

import java.util.Random;

public class BlockExample extends Block
{
    public BlockExample(int i, int j)
    {
        super(i, j, Material.rock);
    }

    public int idDropped(int i, Random random)
    {
        return 0;
    }
}