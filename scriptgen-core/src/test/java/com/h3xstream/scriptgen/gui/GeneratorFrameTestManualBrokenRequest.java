package com.h3xstream.scriptgen.gui;

import com.esotericsoftware.minlog.Log;
import com.h3xstream.scriptgen.HttpRequestInfoFixtures;
import com.h3xstream.scriptgen.ReissueRequestScripter;
import com.h3xstream.scriptgen.model.HttpRequestInfo;

public class GeneratorFrameTestManualBrokenRequest {

    public static void main(String[] args) {
        Log.set(Log.LEVEL_DEBUG);
        HttpRequestInfo req = HttpRequestInfoFixtures.getBrokenRequest();
        new ReissueRequestScripter(req).openDialogWindow();
    }
}
