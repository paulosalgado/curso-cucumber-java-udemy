package br.ce.wcaquino.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import static cucumber.api.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/",
        glue = "br.ce.wcaquino.runners.steps",
        plugin = "pretty", monochrome = true,
        snippets = CAMELCASE/*, dryRun = false, strict = false*/)
public class CucumberRunner {
    // parei em 2/17
}
