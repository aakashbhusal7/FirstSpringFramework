package com.example.demo.controller;

import com.example.demo.models.PostRequest;
import com.example.demo.models.PostResponse;
import com.example.demo.models.SampleResponse;
import org.springframework.web.bind.annotation.*;

@RestController
public class WebController {

    @RequestMapping("/sample")
    public SampleResponse Sample(@RequestParam(value = "name",
            defaultValue = "Ram") String name) {
        SampleResponse sampleResponse = new SampleResponse();
        sampleResponse.setId(1);
        sampleResponse.setMessage("Your name is " + name);
        return sampleResponse;
    }

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public PostResponse Test(@RequestBody PostRequest inputPayload) {
        PostResponse postResponse = new PostResponse();
        postResponse.setId(inputPayload.getId() * 100);
        postResponse.setMessage("Hello " + inputPayload.getName());
        postResponse.setExtra("Some text ");
        return postResponse;
    }
}
