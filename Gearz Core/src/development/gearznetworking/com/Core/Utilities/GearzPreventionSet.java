package development.gearznetworking.com.Core.Utilities;

/**
 * Created by Ben on 5/27/2016.
 */
public class GearzPreventionSet
{

    private boolean pvp;
    private boolean build;
    private boolean fallDamage;

    public void setPvPStatus(boolean b)
    {
        pvp = b;
    }

    public void setBuildStatus(boolean b)
    {
        build = b;
    }

    public void setFallDamageStatus(boolean b)
    {
        fallDamage = b;
    }

    public boolean getPvPStatus()
    {
        return pvp;
    }

    public boolean getBuildStatus()
    {
        return build;
    }

    public boolean getFallDamageStatus()
    {
        return fallDamage;
    }

    public void loadDefaultPreventions()
    {

        pvp = false;
        build = false;
        fallDamage = false;

    }
}

