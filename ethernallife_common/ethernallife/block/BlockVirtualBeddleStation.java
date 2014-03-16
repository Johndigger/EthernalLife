package ethernallife.block;

import java.util.Random;

import net.minecraft.block.BlockBed;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import ethernallife.EthernalLife;

public class BlockVirtualBeddleStation extends BlockBed {

    public BlockVirtualBeddleStation(Material material) {
        super(176);
        setTextureName("etlione:virtualbeddlestation");
    }
    
    
    
    @Override
    public boolean isBed(World world, int x, int y, int z,
            EntityLivingBase player) {
        // TODO Auto-generated method stub
        return blockID == EthernalLife.blockVirtualBeddleStation.blockID;    }



    @Override
    public boolean isBedFoot(IBlockAccess world, int x, int y, int z) {
        // TODO Auto-generated method stub
        return super.isBedFoot(world, x, y, z);
    }



    @Override
    public int idDropped(int par1, Random par2Random, int par3) {
        return isBlockHeadOfBed(par1) ? 0
                : EthernalLife.itemVirtualBeddleStation.itemID;
    }

    @Override
    public int idPicked(World par1World, int par2, int par3, int par4) {
        return EthernalLife.itemVirtualBeddleStation.itemID;

    }

}
