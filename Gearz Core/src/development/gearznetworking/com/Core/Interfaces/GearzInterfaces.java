package development.gearznetworking.com.Core.Interfaces;

import development.gearznetworking.com.Core.Interfaces.CosmeticInterfaces.GearzCosmeticsInterface;
import development.gearznetworking.com.Core.Interfaces.CosmeticInterfaces.GearzHatsInterface;
import development.gearznetworking.com.Core.Interfaces.CosmeticInterfaces.GearzPetsInterface;

/**
 * Created by Ben on 5/20/2016.
 */
public class GearzInterfaces
{

    private static GearzCosmeticsInterface gearzCosmeticsInterface = new GearzCosmeticsInterface();
    private static GearzHatsInterface gearzHatsInterface = new GearzHatsInterface();
    private static GearzPetsInterface gearzPetsInterface = new GearzPetsInterface();

    public static GearzCosmeticsInterface getGearzCosmeticsInterface()
    {
        return gearzCosmeticsInterface;
    }

    public static GearzHatsInterface getGearzHatsInterface()
    {
        return gearzHatsInterface;
    }

    public static GearzPetsInterface getGearzPetsInterface()
    {
        return gearzPetsInterface;
    }

}

