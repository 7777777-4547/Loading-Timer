package io.github.blobanium.lt;

import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;

public class LoadingTimerPreLaunch implements PreLaunchEntrypoint {
    @Override
    public void onPreLaunch(){
        LoadingTimer.configRegister();
    }
}
