package pro.gravit.launcher.client;

import pro.gravit.launcher.LauncherInject;

public class GuiModuleConfig {
    @LauncherInject(value = "modules.javaruntime.createaccounturl")
    public String createAccountURL;
    @LauncherInject(value = "modules.javaruntime.forgotpassurl")
    public String forgotPassURL;
    @LauncherInject(value = "modules.javaruntime.hastebinserver")
    public String hastebinServer;
    @LauncherInject(value = "modules.javaruntime.site")
    public String site;
    @LauncherInject(value = "modules.javaruntime.vk")
    public String vk;
    @LauncherInject(value = "modules.javaruntime.discord")
    public String discord;
    @LauncherInject(value = "modules.javaruntime.enabledownloadjava")
    public boolean enableDownloadJava;
    @LauncherInject(value = "modules.javaruntime.userdisabledownloadjava")
    public boolean userDisableDownloadJava;
    @LauncherInject(value = "modules.javaruntime.jvmwindows64dir")
    public String jvmWindows64Dir;
    @LauncherInject(value = "modules.javaruntime.jvmwindows32dir")
    public String jvmWindows32Dir;

    public static Object getDefault() {
        GuiModuleConfig config = new GuiModuleConfig();
        config.createAccountURL = "https://politcubes.ru/#account";
        config.forgotPassURL = "https://politcubes.ru/#account";
        config.hastebinServer = "https://hasteb.in";
        config.vk = "https://vk.com/politcubes";
        config.discord = "https://discordapp.com/invite/7CAbCcQ";
        config.site = "https://politcubes.ru/";
        config.enableDownloadJava = false;
        config.userDisableDownloadJava = true;
        config.jvmWindows64Dir = "java-windows-x64";
        config.jvmWindows32Dir = "java-windows-x32";
        return config;
    }
}
