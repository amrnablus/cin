package com.centerview.cucumber.stepdefs;

import com.centerview.CinApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = CinApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
