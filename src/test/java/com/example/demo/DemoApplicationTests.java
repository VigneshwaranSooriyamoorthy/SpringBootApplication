package com.example.demo;

import com.example.demo.cucumber.CucumberRunnerTest;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.Launcher;

import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClass;

public class DemoApplicationTests {
	public static void main(String[] args) {
        Launcher launcher = LauncherFactory.create();
        SummaryGeneratingListener listener = new SummaryGeneratingListener();

        LauncherDiscoveryRequest request = LauncherDiscoveryRequestBuilder.request()
                .selectors(selectClass(CucumberRunnerTest.class))
                .build();

        launcher.execute(request, listener);
	}
}
