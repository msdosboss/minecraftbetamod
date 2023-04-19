package net.minecraft.src;

import java.util.Random;

public class BlockOrca extends Block
{
    public BlockOrca(int i, int j)
    {
        super(i, j, Material.wood);
    }

    public int idDropped(int i, Random random)
    {
        return 98;
    }
}