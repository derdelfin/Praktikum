package com.example.demo.controller;

import com.google.api.client.auth.oauth2.Credential;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.google.api.services.youtube.YouTube;

import java.util.List;

@Controller
public class YoutubeController {

    private static YouTube youtube;

    @GetMapping("/comments")
    public String getCommentsForVideo() {

        // Get Authenticated
        // Example of how to get Authenticated: https://developers.google.com/youtube/reporting/guides/registering_an_application
        // Get youtube Object: something like -> youtube = new YouTube.Builder(...)
        // Example: https://developers.google.com/youtube/v3/code_samples/java

        return "";
    }
}
