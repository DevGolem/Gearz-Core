package development.gearznetworking.com.Core.Ranks;

/**
 * Created by Ben on 5/19/2016.
 */
public enum GearzRank
{

    OWNER(10, "Owner", "§4[Owner] ", "§c", "§f"),
    ADMIN(9, "Admin", "§c[Admin] ", "§c", "§f"),
    DEV(9, "Dev", "§c[Dev] ", "§c", "§f"),
    JRADMIN(8, "JrAdmin", "§c[JrAdmin] ", "§c", "§f"),

    MOD(7, "Mod", "§9[Mod] ", "§9", "§f"),
    JRMOD(6, "JrMod", "§3[JrMod] ", "§3", "§f"),

    YOUTUBE(5, "YouTube", "§6[YouTube] ", "§6", "§f"),
    FRIEND(4, "Friend", "§5[Friend] ", "§5", "§f"),

    HERO(3, "Hero", "§d[Hero]", "§d", "§f"),
    ULTRA(2, "Ultra", "§b[Ultra]", "§b", "§f"),

    MEMBER(1, "Member", "§7", "§7", "§7");

    int id;
    String name;
    String prefix;
    String tabColor;
    String chatColor;

    GearzRank(int id, String name, String prefix, String tabColor, String chatColor)
    {

        this.id = id;
        this.name = name;
        this.prefix = prefix;
        this.tabColor = tabColor;
        this.chatColor = chatColor;

    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getPrefix()
    {
        return prefix;
    }

    public String getTabColor()
    {
        return tabColor;
    }

    public String getChatColor()
    {
        return chatColor;
    }

}

