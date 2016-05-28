package development.gearznetworking.com.Core.Loadouts;

import development.gearznetworking.com.Core.Loadouts.GearzHub.GearzHubLoadout;

/**
 * Created by Ben on 5/22/2016.
 */
public class GearzLoadouts
{

    private static GearzHubLoadout gearzHubLoadout = new GearzHubLoadout();

    public static GearzHubLoadout getGearzHubLoadout()
    {
        return gearzHubLoadout;
    }

}

